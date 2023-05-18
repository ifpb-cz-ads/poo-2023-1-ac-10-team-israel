public class Cobra extends Reptil {
    public Cobra(String nome, boolean venenoso) {
        super(nome, venenoso);
    }

    @Override
    public void emitirSom() {
        System.out.println("A cobra está sibilando.");
    }

    public void rastejarVelozmente() {
        System.out.println("A cobra está rastejando velozmente.");
    }
}