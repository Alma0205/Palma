public interface Reproducible {

    String TIPO_LIBRERIA = "Multimedia Estándar v1.0";


    void reproducir();
    void pausar();
    void detener();

    default void adelantar(int segundos) {
        System.out.println("Adelantando el medio " + segundos + " segundos.");
    }


    static String obtenerInfoLibreria() {
        return "Librería de reproducción: " + TIPO_LIBRERIA;
    }
}
