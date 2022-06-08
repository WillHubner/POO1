public class SQLFactory{
    public static void main(String[] args){

        Aluno aluno = new Aluno();
        
        if (Database.abrir(aluno, 1)) {
            System.out.println(aluno.nome);
        }
    }
}