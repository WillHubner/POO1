public class ProdutoNaoPerecivel extends Produto {

    @Override
    public void imprimirEtiqueta() {
        System.out.println("Produto Não Perecivel "+ this.descricao);
    }
    
}
