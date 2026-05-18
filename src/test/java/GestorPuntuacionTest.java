import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestorPuntuacionTest {

    @Test
    void debeSumarPuntosAUnJugador() {
        GestorPuntuacion gestor = new GestorPuntuacion();

        gestor.sumarPuntos("Justin", 10);

        assertEquals(10, gestor.obtenerPuntos("Justin"));
    }

    @Test
    void debeAcumularPuntosDelMismoJugador() {
        GestorPuntuacion gestor = new GestorPuntuacion();

        gestor.sumarPuntos("Justin", 10);
        gestor.sumarPuntos("Justin", 5);

        assertEquals(15, gestor.obtenerPuntos("Justin"));
    }

    // --- Cycle 2 ---
    @Test
    void debeRestarPuntosAUnJugador() {
        GestorPuntuacion gestor = new GestorPuntuacion();
        gestor.sumarPuntos("Stefan", 20);
        
        gestor.restarPuntos("Stefan", 5);
        
        assertEquals(15, gestor.obtenerPuntos("Stefan"));
    }

    // --- Cycle 4 ---
    @Test
    void debeReiniciarLosPuntosDeUnJugadorA_cero() {
        GestorPuntuacion gestor = new GestorPuntuacion();
        gestor.sumarPuntos("Jhoel", 20);

        gestor.reiniciarPuntos("Jhoel");

        assertEquals(0, gestor.obtenerPuntos("Jhoel"));
    }
}