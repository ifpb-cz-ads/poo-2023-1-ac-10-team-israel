public class Reptil extends Animal {
    protected boolean venenoso;

    public Reptil(String nome, boolean venenoso) {
        super(nome);
        this.venenoso = venenoso;
    }

    @Override
    public void emitirSom() {
        System.out.println("O réptil está emitindo um som.");
    }

    public void rastejar() {
        System.out.println("O réptil está rastejando.");
    }
}