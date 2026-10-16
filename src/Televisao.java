public class Televisao implements Ligavel {
    private boolean ligada;

    public Televisao() {
        this.ligada = false;
    }

    public boolean isLigada() {
        return this.ligada;
    }

    @Override
    public void ligar() {
        this.ligada = true;
        System.out.println("A televisão está ligada.");
    }

    @Override
    public void desligar() {
        this.ligada = false;
        System.out.println("A televisão está desligada.");
    }
}