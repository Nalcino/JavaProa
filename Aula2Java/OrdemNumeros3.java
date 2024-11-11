package comandoscondicionais;
import java.util.Scanner;

public class OrdemNumeros3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float n1,n2,n3,menor;

        System.out.println("entre com um Número: ");
        n1 = entrada.nextFloat();

        System.out.println("entre com um número: ");
        n2 = entrada.nextFloat();

        System.out.println("entre com um número: ");
        n3 = entrada.nextFloat();

        menor = n1;

        if (n2 < menor){
            menor = n2;
            System.out.println("O menor numero é" + menor);
        }
        if(n3 < menor){
            menor = n3;
            System.out.println("o menor Número é:"+ menor);
        }


    }
}
