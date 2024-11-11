package primeiraulabasico; // pacote (Pasta de organização de classes)
import java.util.Scanner;  //biblioteca para input do usuario
public class PrimeiraAula {


    public static void main(String[] args) {  // Método principal para execução da classe

        Scanner entrada = new Scanner(System.in); // entrada de dados pelo teclado

        System.out.println("Entre com o primeiro número: "); // permite exibição na tela (Print)
        int numero = entrada.nextInt(); // instância na classe Scanner na variável

        System.out.println("Entre com o segundo número: ");
        int numero2 = entrada.nextInt();

        int soma = numero + numero2; // instância que atribui valor à soma

        System.out.println("O valor do primeiro número é:" + numero);  // saida dos dados (estado atual)
        System.out.println("O valor do segundo número é:" + numero2);
        System.out.println("A soma dos dois números é:" + soma);
    }
}
