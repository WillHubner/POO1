public class Produto extends SQLClass{            
    int id;
    String descricao;
    double preco;    

    Produto(){
        this.setTableName("produtos");        
    }    
}
