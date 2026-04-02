import java.util.Scanner;

public class SistemaDeSuporteAoCLiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int interacaoDoUsuario;
        boolean sairDoLoop = false;

        while (!sairDoLoop) {
            System.out.println("\n1) Problema Técnico");
            System.out.println("2) Financeiro");
            System.out.println("3) Cancelamento");
            System.out.println("4) Falar com atendente");
            System.out.println("0) Sair do menu");
            System.out.print("Escolha qual operação deseja realizar: ");
            interacaoDoUsuario = scanner.nextInt();

            switch (interacaoDoUsuario) {
                case 1:
                    System.out.println("Vamos direcionar essa conversa para nossa assistência técnica especialista.");
                    break;
                case 2:
                    System.out.println("Aguarde um momento que o nosso financeiro vai entrar em contato com você.");
                    break;
                case 3:
                    System.out.println("Cancelamento feito com sucesso!");
                    break;
                case 4:
                    System.out.println("Um dos nossos atendentes irá assumir essa conversa.");
                    break;
                case 0:
                    sairDoLoop = true;
                    break; // Faltava este break
                default:
                    System.out.println("Opção inválida!!!");
                    break;
            }
        }

        scanner.close();
    }
    
}