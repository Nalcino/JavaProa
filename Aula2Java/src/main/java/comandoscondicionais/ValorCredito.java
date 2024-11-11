package comandoscondicionais;
import java.util.Scanner;

public class ValorCredito {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float sl1,sl2,sl3,sl4,sl5,sl6, media,credito;

        System.out.println("Entre com seu salario:");
        sl1 = entrada.nextFloat();

        System.out.println("Entre com seu salario");
        sl2 = entrada.nextFloat();

        System.out.println("Entre com seu salario");
        sl3 = entrada.nextFloat();

        System.out.println("Entre com seu salario");
        sl4 = entrada.nextFloat();

        System.out.println("Entre com seu salario");
        sl5 = entrada.nextFloat();

        System.out.println("Entre com seu salario");
        sl6 = entrada.nextFloat();

        media = (sl1 + sl2 + sl3 + sl4 + sl5 + sl6) /6;

        if (media >= 0 && media<=500){
            System.out.println("Você não tem credito");
        }
        else if(media >=501 && media <= 1000){
            credito = media * 0.30f;
            System.out.println("O seu crédito é de : "+ credito);
        }
        else if(media >=1001 && media<=3000){
            credito = media *0.40f;
            System.out.println("O seu crédito é de:" + credito);
        }
        else{
            credito = media * 0.50f;
            System.out.println("O seu credito é:" + credito);
        }


    }
}
