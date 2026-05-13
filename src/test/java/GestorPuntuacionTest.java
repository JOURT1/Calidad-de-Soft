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
        // Configuramos un estado inicial
        gestor.sumarPuntos("Stefan", 20);
        
        // Ejecutamos la acción a probar
        gestor.restarPuntos("Stefan", 5);
        
        // Verificamos el resultado
        assertEquals(15, gestor.obtenerPuntos("Stefan"));
    }
}