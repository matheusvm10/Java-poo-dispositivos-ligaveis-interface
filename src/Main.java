public class Main {
    public static void main(String[] args) {
        Ligavel[] dispositivos = new Ligavel[2];

        dispositivos[0] = new Lampada();
        dispositivos[1] = new Televisao();

        System.out.println("=== DISPOSITIVOS LIGÁVEIS ===");

        for (Ligavel dispositivo : dispositivos) {
            dispositivo.ligar();
            dispositivo.desligar();
            System.out.println("----------------");
        }
    }
}