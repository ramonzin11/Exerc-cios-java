import java.util.Scanner;

public class sistemaDeCinema {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Definição das variáveis locais
        boolean sairDoLoop = false;
        int assentosDisponiveis = 20; // O total começa em 20

        System.out.println("=-=-=-=-= CINE-JAVA: CENTRAL DE VENDAS =-=-=-=-=");

        while (!sairDoLoop) {
            // Menu Principal
            System.out.println("\n-------------------------------");
            System.out.println("1: COMPRAR INGRESSOS");
            System.out.println("2: VER ASSENTOS RESTANTES");
            System.out.println("0: ENCERRAR SESSÃO");
            System.out.println("-------------------------------");
            
            System.out.print("Escolha uma opção: ");
            int escolhaDoUsuario = scanner.nextInt();

            switch (escolhaDoUsuario) {
                case 1:
                    System.out.print("\nQuantos ingressos você deseja comprar? ");
                    int quantidadeDesejada = scanner.nextInt();

                    // VALIDAÇÃO: Só vende se houver estoque suficiente
                    if (quantidadeDesejada > assentosDisponiveis) {
                        System.out.println(" OPERAÇÃO NEGADA!");
                        System.out.println("Não temos espaço suficiente. Assentos disponíveis: " + assentosDisponiveis);
                    } else if (quantidadeDesejada <= 0) {
                        System.out.println(" Quantidade inválida! Digite um valor maior que zero.");
                    } else {
                        // A SUBTRAÇÃO ocorre aqui, no ato da confirmação
                        assentosDisponiveis -= quantidadeDesejada;
                        System.out.println( quantidadeDesejada + " ingresso(s) comprado(s) com sucesso!");
                    }
                    break;

                case 2:
                    System.out.println("\n=== STATUS DA SALA ===");
                    System.out.println("Assentos disponíveis: " + assentosDisponiveis);
                    System.out.println("======================");
                    break;

                case 0:
                    System.out.println("Encerrando o sistema de vendas...");
                    sairDoLoop = true;
                    break;

                default:
                    System.out.println(" Opção incorreta! Tente novamente.");
                    break;
            }

            // FECHAMENTO AUTOMÁTICO: Se lotar a sala, o programa encerra
            if (assentosDisponiveis == 0) {
                System.out.println("\n SESSÃO LOTADA! Todas as poltronas foram vendidas.");
                sairDoLoop = true;
            }
        }

        System.out.println("\n=-=-=-=-=- SISTEMA FINALIZADO -=-=-=-=-=");
        System.out.println("Obrigado por usar o Cine-Java!");
        
        scanner.close();
    } 
}