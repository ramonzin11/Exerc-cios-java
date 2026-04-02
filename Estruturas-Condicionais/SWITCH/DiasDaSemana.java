import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int interacaoDoUsuario;
        String diaDaSemana;
        boolean sairDoLoop = false;

        while (!sairDoLoop) { // Adicionado o "!" para o loop funcionar

            System.out.println("\nDigite um número de 1 a 7 (ou 0 para sair): ");
            interacaoDoUsuario = scanner.nextInt();

            switch (interacaoDoUsuario) {
                case 1:
                    diaDaSemana = "Domingo";
                    System.out.println(diaDaSemana);
                    break;
                case 2:
                    diaDaSemana = "Segunda-Feira";
                    System.out.println(diaDaSemana);
                    break;
                case 3:
                    diaDaSemana = "Terça-Feira";
                    System.out.println(diaDaSemana);
                    break;
                case 4:
                    diaDaSemana = "Quarta-Feira";
                    System.out.println(diaDaSemana);
                    break;
                case 5:
                    diaDaSemana = "Quinta-Feira";
                    System.out.println(diaDaSemana);
                    break;
                case 6:
                    diaDaSemana = "Sexta-Feira";
                    System.out.println(diaDaSemana);
                    break; // Faltava este break
                case 7:
                    diaDaSemana = "Sábado";
                    System.out.println(diaDaSemana);
                    break;
                case 0: // Adicionada opção para sair do loop
                    sairDoLoop = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        scanner.close();
    }
    
}