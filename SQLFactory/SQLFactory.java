public class SQLFactory{
    public static void main(String[] args){

        // Usuario user = new Usuario();

        // user.id = 1;
        // user.nome = "Willian";
        // user.login = "willian.hubner@hotmail.co.uk";
        // user.senha = "123456";
        // user.status = 0;
        // user.data = "04/05/2022";

        Carro uno = new Carro();
        uno.ano = 2022;
        uno.valor = 199.99;
        uno.modelo = "Uno Economy";
        uno.marca = "Fiat";

        System.out.println(uno.insertSQL());

    }
}