package comandoscondicionais;
import java.util.Scanner;

public class Calculoimc {

    public static void main(String[] args) {
        float  peso , altura , imc;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qualk seu peso?");
        peso = entrada.nextFloat();

        System.out.println("Qual sua altura?");
        altura = entrada.nextFloat();

        imc = peso /(altura*altura);

        if (imc<=18.5){
            System.out.println("Abaixo do peso");
        }
        else if(imc >= 18.6 && imc<= 24.9){
            System.out.println("Peso Ideal(Parabens)");
        }
        else if(imc>=25 && imc<=29.9) {
            System.out.println("Acima do peso");
        }
        else if (imc >=30 && imc<= 34.9){
            System.out.println("Obesidade grau I");
        }
        else if (imc>=35 && imc <=39.9){
            System.out.println("Obesidade Grau II");
        }
        else{
            System.out.println("Obesidade III(mórbida)");
        }

    }
}
