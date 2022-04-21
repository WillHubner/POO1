public class Venda {

    int pedido;
    String clinte;
    float total;

    Venda(String cliente){
        this.pedido = 1;
        this.clinte = cliente;
    }

    void valorVendaAtual(){
        System.out.println("A venda nº "+ this.pedido + " tem valor de R$ " + this.total);
    }
    
}
