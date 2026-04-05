import java.util.Scanner;

public class CalculadorDeServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double manutencao = 0, limpeza = 0, revisao = 0;
        boolean sairDoloop = false;

        while (!sairDoloop) {
            System.out.println("\n1: MANUTENÇÃO");
            System.out.println("2: LIMPEZA");
            System.out.println("3: REVISÃO");
            System.out.println("0: SAIR");

            System.out.print("Escolha: ");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Reposição de peça? (1: Sim / 2: Não): ");
                    manutencao += scanner.nextInt() == 1 ? 250 : 150;
                    break;
                case 2:
                    System.out.print("Limpeza detalhada? (1: Sim / 2: Não): ");
                    limpeza += scanner.nextInt() == 1 ? 150 : 100;
                    break;
                case 3:
                    System.out.print("Revisão completa? (1: Sim / 2: Não): ");
                    revisao += scanner.nextInt() == 1 ? 180 : 80;
                    break;
                case 0:
                    sairDoloop = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        System.out.print("Quantas peças adquiriu: ");
        int qtd = scanner.nextInt();
        double total = manutencao + limpeza + revisao;
        double desconto = qtd > 20 ? total * 0.20 : qtd > 10 ? total * 0.15 : 0;

        System.out.println("MANUTENÇÃO: R$ " + manutencao);
        System.out.println("LIMPEZA: R$ " + limpeza);
        System.out.println("REVISÃO: R$ " + revisao);
        System.out.println("TOTAL COM DESCONTO: R$ " + (total - desconto));
        scanner.close();
    }
}
