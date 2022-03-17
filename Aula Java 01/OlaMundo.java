import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso:");
        float peso = entrada.nextFloat();
        System.out.println("Digite a sua altura:");
        float altura = entrada.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Seu IMC e: "+ imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso, come mais!");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está com o Peso normal, que inveja!");
        }


  

        
    }
}
