public class ReproductorMultimedia {
    

    public void gestionar(Reproducible medio) {
        medio.reproducir();
        medio.adelantar(15);
        medio.pausar();
        medio.detener();
        System.out.println("==========================================");
    }
}
