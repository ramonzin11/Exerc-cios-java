import java.util.Scanner;

public class SistemaDeCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean sairDoLoop = false;
        int assentosDisponiveis = 20;

        System.out.println("=-=-=-=-= CINE-JAVA: CENTRAL DE VENDAS =-=-=-=-=");

        while (!sairDoLoop) {
            System.out.println("\n1: COMPRAR INGRESSOS");
            System.out.println("2: VER ASSENTOS RESTANTES");
            System.out.println("0: ENCERRAR SESSÃO");

            System.out.print("Escolha uma opção: ");
            int escolhaDoUsuario = scanner.nextInt();

            switch (escolhaDoUsuario) {
                case 1:
                    System.out.print("Quantos ingressos? ");
                    int quantidade = scanner.nextInt();
                    if (quantidade > assentosDisponiveis) {
                        System.out.println("Sem espaço! Assentos disponíveis: " + assentosDisponiveis);
                    } else if (quantidade <= 0) {
                        System.out.println("Quantidade inválida!");
                    } else {
                        assentosDisponiveis -= quantidade;
                        System.out.println(quantidade + " ingresso(s) comprado(s)!");
                    }
                    break;
                case 2:
                    System.out.println("Assentos disponíveis: " + assentosDisponiveis);
                    break;
                case 0:
                    sairDoLoop = true;
                    break;
                default:
                    System.out.println("Opção incorreta!");
                    break;
            }

            if (assentosDisponiveis == 0) {
                System.out.println("SESSÃO LOTADA!");
                sairDoLoop = true;
            }
        }
        scanner.close();
    }
}
