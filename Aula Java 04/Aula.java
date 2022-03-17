public class Aula {
    public static void main(String[] args){
        Pessoa eu = new Pessoa("Willian", "Hubner");
        
        eu.escreverNome();
                
        eu.sobrenome = "Hubner";
        eu.idade = 25;

        eu.escreverIdade();

        eu.somarIdade(2);

        eu.escreverIdade();

        // String nomeCompleto = eu.nomeSobrenome();        

        // System.out.println(nomeCompleto);

        // eu.escreverNome();
        // eu.escreverIdade();
    }
}
