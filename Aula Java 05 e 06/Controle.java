public class Controle {
    private StatusAr status = StatusAr.DESLIGADO;

    private void ligar(){
        this.status = StatusAr.LIGADO;
        System.out.println("Ligando o Ar!");
    }
    private void desligar(){
        this.status = StatusAr.DESLIGADO;
        System.out.println("Desligando o Ar!");
    }

    void power(){
        if (this.status == StatusAr.DESLIGADO) {
            ligar();
        } else {
            desligar();
        }
    }   
}