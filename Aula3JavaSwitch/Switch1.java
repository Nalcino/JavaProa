package Switch;
import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do farol (1 para Verde, 2 para Amarelo, 3 para Vermelho): ");
        int Farol = scanner.nextInt();
        String mensagem;

        switch(Farol) {
            case 1:
                mensagem = "Farol Verde! Siga!";
                break;
            case 2:
                mensagem = "Farol Amarelo! Atenção, Reduza a velocidade!";
                break;
            case 3:
                mensagem = "Farol Vermelho! Pare!";
                break;
            default:
                mensagem = "Número inválido";
        }

        System.out.println(mensagem);
    }
}
