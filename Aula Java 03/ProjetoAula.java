public class ProjetoAula {
    
    public static void main(String[] args){        
                
        Carro meuCarro = new Carro();  
        Carro seuCarro = new Carro();

        Entidade eu = new Entidade();

        eu.nome = "Willian";

        // meuCarro.proprietario = eu;
        // seuCarro.proprietario = eu;

        System.out.println(meuCarro.proprietario.nome);     
        System.out.println(seuCarro.proprietario.nome);     
        
    
                        
    }
    
}
