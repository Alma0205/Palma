public class Main {
    public static void main(String[] args) {
        System.out.println(Reproducible.obtenerInfoLibreria());
        System.out.println("=====================================================");

   
        Pelicula pelicula1 = new Pelicula("Nosferatu", "F. W. Murnau");
        Pelicula pelicula2 = new Pelicula("El Resplandor", "Stanley Kubrick");
        Pelicula pelicula3 = new Pelicula("Drácula", "Tod Browning");

     
        Serie serie1 = new Serie("Historias de Halloween", 1);
        Serie serie2 = new Serie("El Exorcista", 2);

       
        ReproductorMultimedia miReproductor = new ReproductorMultimedia();

        System.out.println("--- Probando con Películas ---");
        miReproductor.gestionar(pelicula1);
        miReproductor.gestionar(pelicula2);
        miReproductor.gestionar(pelicula3);

        System.out.println("\n--- Probando con Series ---");
        miReproductor.gestionar(serie1);
        miReproductor.gestionar(serie2);
    }
}
