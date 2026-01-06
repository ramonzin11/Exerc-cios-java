import java.util.Scanner;
public class calculadorDeServico {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Variáveis acumuladoras para cada tipo de serviço
        double manutencao = 0;
        double limpeza = 0;
        double revisão = 0;

        // Controle do laço e variáveis de cálculo
        boolean sairDoloop = false;
        int interacaoDoUsario;
        double total;
        double desconto;
        int quantidadeDepeca;
        
        System.out.println("==== BEM-VINDO AO NOSSO SISTEMA =====");

        // O laço continua até que sairDoloop seja verdadeiro (case 0)
        while (!sairDoloop) {
            System.out.println("\nMENU DE SERVIÇOS");
            System.out.println("1: FAZER MANUTENÇÃO"); 
            System.out.println("2: FAZER UMA LIMPEZA");
            System.out.println("3: FAZER UMA REVISÃO");
            System.out.println("0: SAIR");

            System.out.print("\nESCOLHA ALGUNS DOS NOSSOS SERVIÇOS: ");
            interacaoDoUsario = scanner.nextInt();

            // Estrutura de decisão para o menu
            switch (interacaoDoUsario) {
                case 1:
                    System.out.print("\nPRECISA DE REPOSIÇÃO DE PEÇA (1: SIM / 2: NÃO): ");
                    int servicoExtra = scanner.nextInt();

                    // Lógica de acréscimo baseada em condição extra
                    if(servicoExtra == 1){
                        manutencao += 150 + 100; // Valor base + peça
                        System.out.println("\nSERVIÇO EXTRA APLICADO");
                    } else {
                        manutencao += 150;
                    }
                    System.out.println("OPERAÇÃO CONCLUIDA!!!");
                    break;
                case 2:
                    System.out.print("\nOPTA PELA LIMPEZA DETALHADA (1: SIM / 2: NÃO): ");
                    servicoExtra = scanner.nextInt();
            
                    if(servicoExtra == 1){
                        limpeza += 100 + 50;
                        System.out.println("\nSERVIÇO EXTRA APLICADO");
                    } else {
                        limpeza += 100;
                    }
                    System.out.println("OPERAÇÃO CONCLUIDA!!!");
                    break;
                case 3:
                    System.out.print("\nOPTA PELA REVISÃO COMPLETA(1: SIM / 2: NÃO): ");
                    servicoExtra = scanner.nextInt();

                    if(servicoExtra == 1){
                        revisão += 80 + 100;
                        System.out.println("\nSERVIÇO EXTRA APLICADO");
                    } else {
                        revisão += 80;
                    } 
                    System.out.println("OPERAÇÃO CONCLUIDA!!!");
                    break;
                case 0:
                    System.out.println("\nATÉ LOGO !!!");
                    sairDoloop = true; // Quebra a condição do while
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA... TENTE NOVAMNETE!");
                    break;
            }
        }

        // Lógica de fidelidade/desconto após o encerramento do menu
        System.out.print("\nQUANTAS PEÇAS VOCÊ ADQUIRIU: ");
        quantidadeDepeca = scanner.nextInt();

        total = manutencao + revisão + limpeza;

        // Tabela de descontos progressivos
        if (quantidadeDepeca > 20) {
            desconto = total * 0.20; // 20%
            System.out.println("PARABÉNS... CUPOM DE 20% APLICADO!!!");
        } else if (quantidadeDepeca > 10) {
            desconto = total * 0.15; // 15%
            System.out.println("PARABÉNS... CUPOM DE 15% APLICADO!!!");
        } else {
            desconto = 0;
            System.out.println("QUANTIDADE INSUFICIENTE PARA DESCONTO.");
        }   
        
        // Exibição do fechamento da conta
        System.out.println("==================================");
        System.out.println("===== RESUMO =======");
        System.out.println("MANUTENÇÃO: R$ " + manutencao);
        System.out.println("REVISÃO: R$ " + revisão);
        System.out.println("LIMPEZA: R$ " + limpeza);
        System.out.println("TOTAL COM DESCONTO: R$ " + (total - desconto));
     
        scanner.close();
    }
}