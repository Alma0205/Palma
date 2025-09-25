public class Serie implements Reproducible {
    private String nombre;
    private int temporada;

    public Serie(String nombre, int temporada) {
        this.nombre = nombre;
        this.temporada = temporada;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo serie: " + nombre + " - Temporada " + temporada);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando serie: " + nombre + " - Temporada " + temporada);
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo serie: " + nombre + " - Temporada " + temporada);
    }


    public String getNombre() {
        return nombre;
    }

    public int getTemporada() {
        return temporada;
    }
}
