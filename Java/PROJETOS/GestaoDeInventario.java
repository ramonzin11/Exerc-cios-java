package Java.PROJETOS;
import java.util.Scanner;

public class GestaoDeInventario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1. Definição das estruturas de armazenamento (Arrays Paralelos) 
        String[] nomesDoProdutos = new String[5];
        int[] quantidadeDoProdutos = new int[5];
        double[] valorUnitarioDoProduto = new double[5];

        // 2. Variáveis de controle de fluxo e estatística
        boolean sairDoLoop = false;
        double totalGeral = 0;
        int opcao;

        // 3. Loop Principal: Mantém o software rodando até que o usuário decida sair
        while (!sairDoLoop) {
            System.out.println("\n=== SISTEMA DE INVENTÁRIO V1.0 ===");
            System.out.println("1: CADASTRAR PRODUTOS");
            System.out.println("2: LISTAR ESTOQUE ATUAL");
            System.out.println("0: ENCERRAR E GERAR RELATÓRIO");

            System.out.print("\nSELECIONE UMA OPÇÃO: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:    
                    // Loop para preenchimento de todos os slots do inventário
                    for(int i = 0; i < nomesDoProdutos.length; i++) {
                        System.out.println("\n--- CADASTRO DO ITEM " + (i + 1) + " ---");
                        
                        scanner.nextLine(); // Legenda: Limpa o buffer para ler Strings corretamente

                        System.out.print("NOME DO PRODUTO: ");
                        nomesDoProdutos[i] = scanner.nextLine();
    
                        System.out.print("QUANTIDADE EM ESTOQUE: ");
                        quantidadeDoProdutos[i] = scanner.nextInt();
    
                        System.out.print("PREÇO UNITÁRIO: R$ ");
                        valorUnitarioDoProduto[i] = scanner.nextDouble();

                        System.out.println("SITUAÇÃO: Registrado com sucesso!");
                    }
                    break;

                case 2:
                    // Exibição simples dos dados cadastrados nos vetores
                    System.out.println("\n--- CONSULTA DE PRODUTOS ---");
                    for(int i = 0; i < nomesDoProdutos.length; i++){
                        System.out.println("ID: " + i + " | Item: " + nomesDoProdutos[i] + " | Qtd: " + quantidadeDoProdutos[i]);
                    }
                    break;

                case 0:
                    // Flag de saída para encerrar o loop e seguir para o relatório final
                    sairDoLoop = true;
                    break;

                default:
                    System.out.println("ERRO: Opção inválida no sistema!");
                    break;
            }
        }

        // 4. Processamento Final e Relatório de Auditoria
        System.out.println("\n===============================================");
        System.out.println("          RELATÓRIO FINAL DE AUDITORIA          ");
        System.out.println("===============================================");

        for(int i = 0; i < valorUnitarioDoProduto.length; i++){
            // Legenda: Cálculo do custo acumulado por tipo de produto
            double custoLote = quantidadeDoProdutos[i] * valorUnitarioDoProduto[i];
            totalGeral += custoLote;

            System.out.println("\nPRODUTO: " + nomesDoProdutos[i].toUpperCase());
            System.out.println("VALOR TOTAL EM LOTE: R$ " + custoLote);

            // Regra de Negócio: Verificação de nível crítico de segurança
            if(quantidadeDoProdutos[i] < 5){
                System.out.println(">> STATUS: [!] ALERTA DE ESTOQUE BAIXO");
                System.out.println(">> AÇÃO RECOMENDADA: Repor unidades imediatamente.");
            }
        }

        // 5. Finalização: Apresentação do Patrimônio Total Cadastrado
        System.out.println("\n-----------------------------------------------");
        System.out.println("PATRIMÔNIO TOTAL AVALIADO: R$ " + totalGeral);
        System.out.println("===============================================");

        scanner.close(); // Legenda: Encerra o recurso de leitura para liberar memória
    }
}