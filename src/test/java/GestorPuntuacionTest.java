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
}