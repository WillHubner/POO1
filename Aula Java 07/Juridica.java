public class Juridica extends Pessoa{
    String cnpj;

    Juridica(){}

    Juridica(String nome, int idade, String cnpj){
        super(nome, idade);
        this.cnpj = cnpj;
    }

    void escreverDadosCadastro(){
        super.escreverDadosCadastro();
        System.out.println("CNPJ: "+this.cnpj);
    }
}