public class ItemVenda {

    int idProduto;
    int idVenda;
    String descricao;
    int qtd;
    float unitario;
    float total; 
    
    ItemVenda(Venda venda, Produto item){

        this.descricao = item.descricao;
        this.idProduto = item.id;
        this.idVenda = venda.pedido;
        this.qtd = 1;
        this.unitario = item.unitario;
        this.total = item.unitario * this.qtd;

        venda.total = venda.total + this.total;

    }
    
}
