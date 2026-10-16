public class Lampada implements Ligavel {
    private boolean ligada;

    public Lampada() {
        this.ligada = false;
    }

    public boolean isLigada() {
        return this.ligada;
    }

    @Override
    public void ligar() {
        this.ligada = true;
        System.out.println("A lâmpada está ligada.");
    }

    @Override
    public void desligar() {
        this.ligada = false;
        System.out.println("A lâmpada está desligada.");
    }
}