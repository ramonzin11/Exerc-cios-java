package Java.PROJETOS;
import java.util.Scanner;
public class GestaoDeInventario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] nomesDoProdutos = new String[5];
        int[] quantidadeDoProdutos = new int[5];
        double[] valorUnitarioDoProduto = new double[5];

        boolean sairDoLoop = false;
        double total = 0;
        int intecaoDoUsuario;

        while (!sairDoLoop) {
            System.out.println("\n=== BEM-VINDO AO MENU PRINCIPAL ===");

            System.out.println("1: CADASTRAS PRODUTO");
            System.out.println("2: VER PRODUTOS CADASTRADOS");
            System.out.println("0: SAIR DO SISTEMA");

            System.out.print("\nQUAL OPÇÃO VOCÊ DESEJA: ");
            intecaoDoUsuario = scanner.nextInt();

            switch (intecaoDoUsuario) {
                case 1:    
                    for(int i = 0; i < nomesDoProdutos.length; i++) {
                        System.out.println("\nCADASTRO DO PRODUTO " + (i + 1));
                        
                        scanner.nextLine();

                        System.out.print("NOME: ");
                        nomesDoProdutos[i] = scanner.nextLine();
    
                        System.out.print("QUANTIDADE: ");
                        quantidadeDoProdutos[i] = scanner.nextInt();
    
                        System.out.print("VALOR UNITÁRIO: R$ ");
                        valorUnitarioDoProduto[i] = scanner.nextDouble();

                        System.out.println("REGISTRO REALIZADO COM SUCESSO!!!");
                        System.out.println("===============================================");
                    }
                    break;

                case 2:
                    for(int i = 0; i < quantidadeDoProdutos.length; i++){
                        System.out.println("\nPRODUTO " + (i + 1));
                        System.out.println("NOME: " + nomesDoProdutos[i]);
                        System.out.println("QUANTIDADE: " + quantidadeDoProdutos[i]);
                        System.out.println("VALOR UNITÁRIO: R$ " + valorUnitarioDoProduto[i]);
                        System.out.println("===============================================");
                    }
                    break;
                case 0:
                    sairDoLoop = true;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA...TENTE NOVAMENTE!!!");
                    break;
            }

            
        }

        System.out.println("\nRESUMO DO INVENTARIO: ");

        for(int i = 0; i < valorUnitarioDoProduto.length; i++){
            System.out.println("===============================================");
            System.out.println("\n" + (i + 1) + " " + nomesDoProdutos[i]);
            System.out.println("O CUSTO DO PRODUTO: R$ " + (quantidadeDoProdutos[i] * valorUnitarioDoProduto[i]));

            if(quantidadeDoProdutos[i] < 5){
                System.out.println("O produto: " + nomesDoProdutos[i] + " está abaixo de 5 unidades");
                System.out.println("Unidade atual: " + quantidadeDoProdutos[i]);
            }
        }

        for(int i = 0; i < valorUnitarioDoProduto.length; i++){
           total =+ valorUnitarioDoProduto[i];
        }

        System.out.println("===============================================");
        System.out.println("\nTotal de todos os produtos: R$ " + total);

        scanner.close();
    }
}
