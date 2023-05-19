public class RegistraAluno {
        private String nome;
        private String endereco;
        private int idade;
        private double notaMatematica;
        private double notaPortugues;
        private double notaGeografia;

        private static int contadorEstudante;

        public String getNome(){
            return nome;
        }
        public void setNome(String temp){
            nome = temp;
        }
        public String getEndereco(){
            return endereco;
        }
        public void setEndereco(String temp){
            endereco = temp;
        }
        public int getIdade(){
            return idade;
        }
        public void setIdade(int temp){
            idade = temp;
        }
        public void setNotaMatematica(double temp){
            notaMatematica = temp;
        }
        public void setNotaPortugues(double temp){
            notaMatematica = temp;
        }
        public void setNotaGeografia(double temp){
            notaGeografia = temp;
        }
        public double getNotaMatematica(){
            return notaMatematica;
        }
        public double getNotaPortugues(){
            return notaPortugues;
        }
        public double getNotaGeografia(){
            return notaGeografia;
        }
        public double getMedia(){
            double resultado = 0;
            resultado = (notaMatematica + notaPortugues + notaGeografia) / 3;
            return resultado;
        }
        public static int getQuantidadeAluno(){
            return contadorEstudante;
        }
        public void imprimir() {
            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("Idade: " + idade);
        }
    
        public void imprimir(double notaMatematica, double notaPortugues, double notaGeografia) {
            imprimir(); // Chama o método imprimir() sem parâmetros para exibir as informações pessoais
            System.out.println("Nota de Matemática: " + notaMatematica);
            System.out.println("Nota de Português: " + notaPortugues);
            System.out.println("Nota de Geografia: " + notaGeografia);
        }
}
