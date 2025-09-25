public class Clásicos implements Reproducible {
    private String titulo;
    private String director;

    public Clásicos(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    @Override
    public void reproducir() {
        System.out.println("🎬 Reproduciendo película de terror: '" + titulo + "' dirigida por " + director);
    }

    @Override
    public void pausar() {
        System.out.println("⏸️ Pausando película: '" + titulo + "'");
    }

    @Override
    public void detener() {
        System.out.println("⏹️ Deteniendo película: '" + titulo + "'");
    }

    
}
