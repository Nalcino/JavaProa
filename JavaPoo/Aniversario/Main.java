package JavaPoo2;

import java.util.Scanner;

    public class Main extends Festa {
        public void exibir() {
            System.out.println("\nDetalhes da Festa:");
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Local: " + getLocal());
            System.out.println("Tema: " + getTema());
            System.out.println("Decoração: " + (temDecoracao() ? "Sim" : "Não"));
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            JavaPoo2.Main festa = new JavaPoo2.Main();

            System.out.print("Digite o nome: ");
            festa.setNome(scanner.nextLine());

            System.out.print("Digite a idade: ");
            festa.setIdade(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Digite o local: ");
            festa.setLocal(scanner.nextLine());

            System.out.print("Digite o tema: ");
            festa.setTema(scanner.nextLine());

            System.out.print("Tem decoração? (true/false): ");
            festa.setDecoracao(scanner.nextBoolean());

            festa.exibir();
            scanner.close();
        }
    }

