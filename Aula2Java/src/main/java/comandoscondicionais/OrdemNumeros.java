package comandoscondicionais;
import java.util.Scanner;

public class OrdemNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float n1,n2;

        System.out.println("entre com um Número: ");
        n1 = entrada.nextFloat();

        System.out.println("entre com um número: ");
        n2 = entrada.nextFloat();

        if (n1 == n2){
            System.out.println("Os número são iguais, tente novamente");
        }
        else if (n1 > n2){
            System.out.println("O maior número é:" + n1);
        }
        else{
            System.out.println("o maior número é:" + n2);
        }
    }
}
