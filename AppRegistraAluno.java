public class AppRegistraAluno {
    public static void main(String[] args) {
        RegistraAluno aluno = new RegistraAluno();
        
        aluno.setNome("Ana");
        aluno.setEndereco("Rua Cajazeiras, 1533");
        aluno.setIdade(18);
        aluno.setNotaMatematica(8.5);
        aluno.setNotaPortugues(7.2);
        aluno.setNotaGeografia(6.8);
        
        aluno.imprimir();
    }
}
