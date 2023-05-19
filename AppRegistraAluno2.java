public class AppRegistraAluno2 {
    public static void main(String[] args) {
        RegistraAluno aluno = new RegistraAluno();
        
        aluno.setNome("Ana");
        aluno.setEndereco("Rua Cajazeiras, 1533");
        aluno.setIdade(20);
        aluno.setNotaMatematica(9.0);
        aluno.setNotaPortugues(8.7);
        aluno.setNotaGeografia(7.9);
        
        aluno.imprimir(aluno.getNotaMatematica(), aluno.getNotaPortugues(), aluno.getNotaGeografia());
    }
}