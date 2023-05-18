public class Gato extends Mamifero {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato está miando.");
    }

    public void arranharMoveis() {
        System.out.println("O gato está arranhando os móveis.");
    }
}