public class ProdutoPerecivel extends Produto{

    String dataValidade;    

    @Override
    public void imprimirEtiqueta() {
        System.out.println("Produto Perecivel "+this.descricao + " validade: " + this.dataValidade);
    }
    
}
