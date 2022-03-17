public class Pessoa {
    String nome;
    String sobrenome;
    String endereco;
    int idade;

    Pessoa(String nome){
        this.nome = nome;
        this.idade = 1;
    }

    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.idade = 1;
        this.sobrenome = sobrenome;
    }    

    Pessoa(String nome, String sobrenome, String endereco){
        this.nome = nome;
        this.idade = 1;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }
    
    void escreverIdade(){
        System.out.println(nome + " tem " + idade + " anos.");
    }

    void somarIdade(int idade){
        this.idade = this.idade + idade;
    }

    void escreverNome(){  //PROCEDIMENTO OU MÉTODO
        System.out.println(nome + " " +sobrenome);        
    }

    String nomeSobrenome(){ //FUNÇÃO
        String nomecompleto = nome + " " + sobrenome;
        return nomecompleto;
    }
}
