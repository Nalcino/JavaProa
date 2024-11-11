package comandoscondicionais;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1;

        System.out.println("Digite um número: ");
        n1 = entrada.nextInt();

        if (n1 % 2 == 0){
            System.out.println("O número :"+ n1 + "è par");
        }
        else{
            System.out.println("O número : "+ n1+"è impar");
        }
    }

}
