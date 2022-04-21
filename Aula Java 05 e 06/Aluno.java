public class Aluno{
    public static int ALUNOS; 
    public static final float PI = 3.14f;

    String nome;

    Aluno(){
        ALUNOS++;
    }

    private int semestre = 1;

    int getSemestre(){
        return this.semestre;
    }
    void setSemestre(int semestre){
        if (this.semestre + 1 == semestre) { 
            this.semestre = semestre; 
        } else {
            System.out.println("O Semestre informado é inválido!");
        }
    
    }

}