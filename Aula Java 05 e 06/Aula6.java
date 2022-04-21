public class Aula6{
    public static void main(String[] args){

        Carta asCopas = new Carta();

        asCopas.naipe = Naipe.COPAS;
        asCopas.numero = "A";

        Carta doisPaus = new Carta();

        doisPaus.naipe = Naipe.PAUS;
        doisPaus.numero = "2";

        doisPaus.escreverCarta();
        asCopas.escreverCarta();

    }    
}