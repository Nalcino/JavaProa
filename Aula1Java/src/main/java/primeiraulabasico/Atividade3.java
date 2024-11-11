package primeiraulabasico;
import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre um número: ");
        int numero = entrada.nextInt();

        int tabuada = 0;
        while (tabuada <=10){
            int resultado = numero * tabuada;
            System.out.println("a tabuado do"+ numero +"é: " + resultado);
            tabuada++;
        }
    }
}
