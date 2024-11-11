package comandoscondicionais;
import java.util.Scanner;

public class PermissãoVoto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira sua idade:");
        int idade = entrada.nextInt();

        if(idade<=15){
            System.out.println("Você não pode votar");
        }else if(idade>=16 && idade<=17){
            System.out.println("Seu voto é opcional");
        }
        else if(idade >=18 && idade<=69){
            System.out.println("Seu voto é obrigatorio!");
        }
        else{
            System.out.println("O seu voto é opcional");
        }
    }
}
