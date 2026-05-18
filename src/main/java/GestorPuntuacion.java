import java.util.HashMap;
import java.util.Map;

public class GestorPuntuacion {

    private static final int PUNTAJE_INICIAL = 0;

    private final Map<String, Integer> puntuaciones = new HashMap<>();

    public void sumarPuntos(String jugador, int puntos) {
        int nuevoPuntaje = obtenerPuntajeActual(jugador) + puntos;
        puntuaciones.put(jugador, nuevoPuntaje);
    }

    // --- Cycle 2 ---
    public void restarPuntos(String jugador, int puntos) {
        int nuevoPuntaje = obtenerPuntajeActual(jugador) - puntos;
        puntuaciones.put(jugador, nuevoPuntaje);
    }

    // --- Cycle 4 ---
    public void reiniciarPuntos(String jugador) {
        puntuaciones.put(jugador, PUNTAJE_INICIAL);
    }

    public int obtenerPuntos(String jugador) {
        return obtenerPuntajeActual(jugador);
    }

    private int obtenerPuntajeActual(String jugador) {
        return puntuaciones.getOrDefault(jugador, PUNTAJE_INICIAL);
    }
}