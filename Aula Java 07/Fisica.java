public class Fisica extends Pessoa {
    String cpf;

    void escreverDadosCadastro(){
        super.escreverDadosCadastro();
        System.out.println("CPF:" + this.cpf);
    }
}