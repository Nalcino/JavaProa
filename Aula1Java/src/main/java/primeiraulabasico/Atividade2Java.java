package primeiraulabasico;
import java.util.Scanner;

public class Atividade2Java {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        int nota1 = entrada.nextInt();

        System.out.println("Entre com a Segunda nota: ");
        int nota2 = entrada.nextInt();

        System.out.println("Entre com a terceira nota: ");
        int nota3 = entrada.nextInt();

        System.out.println("Entre com a Quarta nota: ");
        int nota4 = entrada.nextInt();

        int soma = nota1 + nota2 + nota3 + nota4;
        int média = soma /4;


        System.out.println("O valor da primeira nota é:" + nota1);
        System.out.println("O valor da segunda nota é:" + nota2);
        System.out.println("O valor da terceira nota é:" + nota3);
        System.out.println("O valor da quarta nota é:" + nota4);
        System.out.println("A média das notas è: " + média);




    }
}
