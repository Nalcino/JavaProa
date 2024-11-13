package Switch;
import java.util.Scanner;

public class SwitchCombo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int combo;
        String mensagem;

        System.out.println("Escolha o combo de 1 a 5:");
        combo = entrada.nextInt();

        switch (combo){
            case 1:
                mensagem ="Combo Whopper Clássico\n" +
                        "\n" +
                        "Lanche: Whopper com hambúrguer 100% carne bovina, alface, tomate, maionese, ketchup, picles e cebola.\n" +
                        "Acompanhamento: Batata frita média.\n" +
                        "Bebida: Refrigerante ou suco de 500 ml.";
                break;
            case 2:
                mensagem = "Combo Chicken Sandwich Supremo\n" +
                        "\n" +
                        "Lanche: Sanduíche de frango empanado crocante com alface e maionese.\n" +
                        "Acompanhamento: Onion rings (anéis de cebola) média.\n" +
                        "Bebida: Chá gelado de 500 ml.";
                break;
            case 3:
                mensagem = "Combo Big King\n" +
                        "\n" +
                        "Lanche: Big King com dois hambúrgueres, queijo, alface, cebola e molho especial.\n" +
                        "Acompanhamento: Batata frita grande.\n" +
                        "Bebida: Milkshake de chocolate ou baunilha.";
                break;
            case 4:
                mensagem = "Combo Cheddar Duplo\n" +
                        "\n" +
                        "Lanche: Sanduíche com dois hambúrgueres, cheddar cremoso e cebola caramelizada.\n" +
                        "Acompanhamento: Nuggets (6 unidades).\n" +
                        "Bebida: Refrigerante de 500 ml.";
                break;
            case 5:
                mensagem = "Combo Veggie Whopper\n" +
                        "\n" +
                        "Lanche: Veggie Whopper com hambúrguer vegetal, tomate, alface, picles, ketchup e maionese.\n" +
                        "Acompanhamento: Batata frita média.\n" +
                        "Bebida: Água mineral ou suco natural.";
                break;

            default: mensagem = "Combo Invalido!";
        }
        System.out.println(mensagem);
    }
}
