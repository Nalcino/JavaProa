package JavaPoo;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Telefone celular = new Telefone();

        System.out.print("Digite o modelo do celular: ");
        celular.setModelo(scanner.nextLine());

        System.out.print("Digite a marca do celular: ");
        celular.setMarca(scanner.nextLine());

        System.out.print("Digite o número do celular: ");
        celular.setNumero(scanner.nextLine());

        System.out.print("O celular tem câmera? (true ou false): ");
        celular.setTemCamera(scanner.nextBoolean());

        System.out.print("Digite o tamanho da tela do celular (em polegadas): ");
        celular.setTamanhoTela(scanner.nextDouble());

        System.out.println("\nInformações do Telefone Celular:");
        System.out.println(celular.toString());

    }
}

