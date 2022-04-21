public class FrenteCaixa{
    public static void main(String[] args){
        
        Venda vendaAtual = new Venda("Marcelo");

        Produto produtoPesquisado = new Produto(1);

        ItemVenda item01 = new ItemVenda(vendaAtual, produtoPesquisado);
        
        Produto produtoPesquisado2 = new Produto(2);

        ItemVenda item02 = new ItemVenda(vendaAtual, produtoPesquisado2);

        vendaAtual.valorVendaAtual();

    }
}