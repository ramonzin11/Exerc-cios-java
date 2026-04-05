import java.util.Scanner;

public class ElevadorDeCarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pesoMaximo = 500;
        int pesoAtual = 0;
        boolean sairDoloop = false;

        while (!sairDoloop) {
            System.out.println("\n1: ADICIONAR CARGA");
            System.out.println("2: VER PESO ATUAL");
            System.out.println("0: SAIR");

            System.out.print("Escolha uma opção: ");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Insira a carga: ");
                    int peso = scanner.nextInt();
                    pesoAtual += peso;
                    if (pesoAtual > pesoMaximo) {
                        System.out.println("PESO EXCEDIDO! Carga não permitida.");
                        sairDoloop = true;
                    } else {
                        System.out.println("Operação realizada! Peso atual: " + pesoAtual);
                    }
                    break;
                case 2:
                    System.out.println("Peso atual: " + pesoAtual);
                    break;
                case 0:
                    sairDoloop = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        if (pesoAtual <= pesoMaximo) {
            System.out.println("Boa viagem!");
        } else {
            System.out.println("Viagem não realizada!");
        }
        scanner.close();
    }
}
