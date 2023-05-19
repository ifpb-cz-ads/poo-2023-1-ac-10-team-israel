public class Cachorro extends Mamifero {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo.");
    }
}