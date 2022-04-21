public class Pessoa {
    protected String nome;
    protected int idade;
    protected String endereco;
    protected String cidade;
    protected String uf;
    protected String ie;

    Pessoa(){}

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    void escreverDadosCadastro(){        
        System.out.println("Nome: "+ this.nome + " | Cidade:"+this.cidade+"/"+this.uf);
        System.out.println("A idade é: "+this.idade);
    }
}
