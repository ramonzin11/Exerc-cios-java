import java.util.Scanner;

public class cofreAutomatico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //? Definição das variáveis locais de controle do sistema
        double contaDousuario = 0;
        boolean sairDoloop = false;

        System.out.print("Olá, poderia me dizer seu nome: ");
        String nomeDoUsuario = scanner.nextLine();

        System.out.println("\n=-=-=-=-=- Bem-vindo " + nomeDoUsuario + " =-=-=-=-=-=-");

        System.out.print("Qual meta você deseja atingir: ");
        double metaDoUsuario = scanner.nextDouble();

        while (!sairDoloop) {
            //? Menu principal e limpo 
            System.out.println("\n--- MENU DE OPERAÇÕES ---");
            System.out.println("1: REGISTRAR ENTRADA");
            System.out.println("2: VER SALDO ATUAL");
            System.out.println("3: CONFIGURAÇÕES DE META");
            System.out.println("0: SAIR DO PROGRAMA");
            
            System.out.print("\nO que você quer fazer, " + nomeDoUsuario + "? ");
            int interacaoComUsuario = scanner.nextInt();

            switch (interacaoComUsuario) {
                case 1: //? No caso 1: o usuario vai fazer um deposito na própria conta
                    System.out.print("Quanto você deseja depositar: ");
                    double deposito = scanner.nextDouble();

                    //? Validação de segurança: depósito deve ser positivo
                    if (deposito > 0) {
                        contaDousuario += deposito;
                        System.out.println("REGISTRO FEITO COM SUCESSO!");
                    } else {
                        System.out.println("ERRO: O valor do depósito deve ser maior que zero.");
                    }
                    break;

                case 2: //? No caso 2: o usuario vai verificar quantos ele tem na sua conta
                    System.out.println("\n======= SALDO ATUAL =======");
                    System.out.println("Saldo: R$ " + contaDousuario);
                    System.out.println("===========================");
                    break;

                case 3: //? No caso 3: o usuario vai verificar a meta 
                    System.out.println("\n======= META ATUAL =======");
                    System.out.println("Sua meta é: R$ " + metaDoUsuario);
                    double faltam = metaDoUsuario - contaDousuario; //! Aqui vai calcular quantos falta para o usuario bater a meta 
                    
                    //? Se a meta for maior que zero, vai mostra quantos que falta para bater a meta
                    if (faltam > 0) {
                        System.out.println("Ainda faltam: R$ " + faltam);
                    } else {
                        System.out.println("META JÁ ATINGIDA!");
                    }

                    //? Aqui vai perguntar para o usuario se ele deseja alterar a meta 
                    System.out.println("\nDeseja alterar a meta? (1: Sim / 2: Não)");
                    int mudarMeta = scanner.nextInt();

                    if (mudarMeta == 1) {
                        System.out.print("Defina a nova meta: ");
                        metaDoUsuario = scanner.nextDouble();

                        System.out.println("Meta atualizada!");
                    }
                    break;

                case 0: //? No caso 0: Se o usuario quiser finalizar o programa 
                    sairDoloop = true;
                    break;

                default: //? caso ao contrario: voltar para o menu principal
                    System.out.println("Opção indisponível, tente novamente.");
                    break;
            }

            //? Verificação automática de meta após cada volta do loop
            if (contaDousuario >= metaDoUsuario && interacaoComUsuario == 1) {
                System.out.println("\nPARABÉNS, " + nomeDoUsuario.toUpperCase() + "! VOCÊ ACABOU DE ATINGIR SUA META!");
            }
        }

        //? Resumo final fora do loop
        System.out.println("\n=-=-=-=-=- RESUMO FINAL -=-=-=-=-=");
        System.out.println("Usuário: " + nomeDoUsuario);
        System.out.println("Saldo Final: R$ " + contaDousuario);
        System.out.println("Meta Definida: R$ " + metaDoUsuario);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Programa finalizado. Até logo!");

        scanner.close();
    }
}