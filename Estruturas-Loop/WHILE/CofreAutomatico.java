import java.util.Scanner;

public class CofreAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double contaDousuario = 0;
        boolean sairDoloop = false;

        System.out.print("Olá, poderia me dizer seu nome: ");
        String nomeDoUsuario = scanner.nextLine();

        System.out.print("Qual meta você deseja atingir: ");
        double metaDoUsuario = scanner.nextDouble();

        while (!sairDoloop) {
            System.out.println("\n--- MENU DE OPERAÇÕES ---");
            System.out.println("1: REGISTRAR ENTRADA");
            System.out.println("2: VER SALDO ATUAL");
            System.out.println("3: CONFIGURAÇÕES DE META");
            System.out.println("0: SAIR DO PROGRAMA");

            System.out.print("\nO que você quer fazer, " + nomeDoUsuario + "? ");
            int interacaoComUsuario = scanner.nextInt();

            switch (interacaoComUsuario) {
                case 1:
                    System.out.print("Quanto você deseja depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        contaDousuario += deposito;
                        System.out.println("REGISTRO FEITO COM SUCESSO!");
                    } else {
                        System.out.println("ERRO: O valor deve ser maior que zero.");
                    }
                    break;
                case 2:
                    System.out.println("Saldo: R$ " + contaDousuario);
                    break;
                case 3:
                    System.out.println("Sua meta é: R$ " + metaDoUsuario);
                    double faltam = metaDoUsuario - contaDousuario;
                    if (faltam > 0) {
                        System.out.println("Ainda faltam: R$ " + faltam);
                    } else {
                        System.out.println("META JÁ ATINGIDA!");
                    }
                    break;
                case 0:
                    sairDoloop = true;
                    break;
                default:
                    System.out.println("Opção indisponível, tente novamente.");
                    break;
            }

            if (contaDousuario >= metaDoUsuario && interacaoComUsuario == 1) {
                System.out.println("\nPARABÉNS! VOCÊ ATINGIU SUA META!");
            }
        }

        System.out.println("Saldo Final: R$ " + contaDousuario);
        scanner.close();
    }
}