public class Mamifero extends Animal {
    protected int idade;

    public Mamifero(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamífero está emitindo um som.");
    }

    public void amamentar() {
        System.out.println("O mamífero está amamentando seus filhotes.");
    }
}