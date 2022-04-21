public class Produto {

    int id;
    String descricao;
    String um;
    float unitario;

    Produto(int id){

        if (id == 1) {
            this.id = id;
            this.descricao = "Fone de Ouvido";
            this.um = "UN";
            this.unitario = 10f;
        } else {
            this.id = id;
            this.descricao = "Alicate";
            this.um = "UN";
            this.unitario = 15f;
        }

        

    }
    
}
