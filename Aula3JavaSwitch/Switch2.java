package Switch;
import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int mes;
        String mensagem;

        System.out.println("Entre com o número do mês :");
        mes = entrada.nextInt();

        switch (mes){
            case 1:
                mensagem = "Mês de Janeiro!";
                break;
            case 2:
                mensagem = "Mês de fevereiro!";
                break;
            case 3:
                mensagem = "Mês de Março!";
                break;
            case 4:
                mensagem = "Mês de Abril!";
                break;
            case 5:
                mensagem = "Mês de Maio!";
                break;
            case 6:
                mensagem = "Mês de Junho!";
                break;
            case 7:
                mensagem = "Mês de Julho!";
                break;
            case 8:
                mensagem = "Mês de Agosto!";
                break;
            case 9:
                mensagem = "Mês de Setembro!";
                break;
            case 10:
                mensagem = "Mês de Outubro!";
                break;
            case 11:
                mensagem = "Mês de Novembro!";
                break;
            case 12:
                mensagem = "Mês de Dezembro!";
                break;
            default:
                mensagem = "Número inválido";
        }

        System.out.println(mensagem);

    }
}
