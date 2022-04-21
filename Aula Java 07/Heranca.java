public class Heranca {
    public static void main(String[] args){

        // Pessoa pessoaGeral = new Pessoa("Willian", 18);
        
        // pessoaGeral.escreverDadosCadastro();

        Juridica pessoaJuridica = new Juridica("Empresa Fantasma", 1, "00.000.000/0000-00");     
        
        pessoaJuridica.endereco = "Av. Gov. Julio Campos";
        pessoaJuridica.cidade = "Sinop";
        pessoaJuridica.uf = "MT";
        pessoaJuridica.ie = "ISENTO";    

        pessoaJuridica.escreverDadosCadastro();

        // Fisica pessoFisica = new Fisica();     

        // pessoFisica.nome = "Marcelo";
        // pessoFisica.idade = 18;
        // pessoFisica.cpf = "000.000.000-00";
        // pessoFisica.endereco = "Av Tarumas";
        // pessoFisica.cidade = "Sinop";
        // pessoFisica.uf = "MT";
        // pessoFisica.ie = "ISENTO";

        // pessoFisica.escreverDadosCadastro();                
        
    }
}
