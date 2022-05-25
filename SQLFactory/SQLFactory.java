public class SQLFactory{
    public static void main(String[] args){

        Estoque pilha = new Estoque();

        pilha.id = 1;
        pilha.filial_id = 2;
        pilha.produto_id = 42;
        pilha.quantidade = 1900;

        System.out.println("-------SELECT-------");
        System.out.println(pilha.selectSQL());
        System.out.println("-------INSERT-------");
        System.out.println(pilha.insertSQL());
        System.out.println("-------UPDATE-------");
        System.out.println(pilha.updateSQL());
        System.out.println("-------DELETE-------");
        System.out.println(pilha.deleteSQL());
    
    }
}