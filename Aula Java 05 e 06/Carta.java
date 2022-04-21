public class Carta {
    String numero;
    Naipe naipe;

    void escreverCarta(){
        System.out.println("Esta carta é um " + this.numero + " de " + this.naipe + " da cor " + this.naipe.getCor());
    }
}
