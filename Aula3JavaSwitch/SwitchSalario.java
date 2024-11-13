package Switch;
import java.util.Scanner;

public class SwitchSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Cargo;
        String Funcao;
        double salario, aumento, novo;

        System.out.println("Digite seu cargo (0001 a 0005)");
        Cargo = entrada.nextInt();

        switch (Cargo) {
            case 0001:
                Funcao = "Programador Estagiário";
                salario = 1400.00;
                aumento = 0.10;
                break;
            case 0002:
                Funcao = "Programador Júnior";
                salario = 3000.00;
                aumento = 0.12;
                break;
            case 0003:
                Funcao = "Programador Pleno";
                salario = 5500.00;
                aumento = 0.13;
                break;
            case 0004:
                Funcao = "Programador Sênior";
                salario = 8000.00;
                aumento = 0.15;
                break;
            case 0005:
                Funcao = "Programador Master";
                salario = 12000.00;
                aumento = 0.18;
                break;
            default:
                System.out.println("Cargo inválido");
                entrada.close();
                return;
        }

        novo = salario + (salario * aumento);

        System.out.println(Funcao);
        System.out.printf("O novo salário é R$ "+ novo);

    }
}
