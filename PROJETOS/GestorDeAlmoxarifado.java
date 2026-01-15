package Java.PROJETOS;

import java.util.Scanner;

/**
 * Sistema de Gestão de Almoxarifado
 * Este programa demonstra o uso de conceitos fundamentais em Java:
 * - Estruturas de repetição (while, for) e decisão (switch-case)
 * - Manipulação de Arrays unidimensionais paralelos
 * - Algoritmo de Ordenação (Selection Sort)
 * - Algoritmo de Busca Binária
 * - Acumuladores e cálculos financeiros básicos
 */
public class GestorDeAlmoxarifado {
    public static void main(String[] args) {
        // Inicialização do Scanner para captura de dados via teclado
        Scanner scanner = new Scanner(System.in);

        // Definição do tamanho fixo dos arrays para o estoque (capacidade máxima)
        int tamanhoEstoque = 5;
        
        // Arrays paralelos: cada índice representa um atributo do mesmo produto
        double[] precoDosprodutos = new double[tamanhoEstoque];
        int[] quantidadesDosProdutos = new int[tamanhoEstoque];
        String[] nomeDosProdutos = new String[tamanhoEstoque];
        int[] idDoAlmoxerife = new int[tamanhoEstoque];

        // Variável de controle para manter a execução do loop do menu
        boolean sairDoloop = false;

        System.out.println("====== BEM-VINDO AO NOSSO SISTEMA =====");

        // Loop principal do sistema que exibe o menu recorrentemente
        while (!sairDoloop) {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1: CADASTRAR PRODUTOS");
            System.out.println("2: CONSULTAR PRODUTO");
            System.out.println("3: RELATÓRIO GERAL");
            System.out.println("0: SAIR DO SISTEMA");

            System.out.print("\nO QUE DESEJA FAZER: ");
            int escolhaDousuario = scanner.nextInt();

            // Estrutura que direciona para a funcionalidade escolhida
            switch (escolhaDousuario) {
                case 1:
                    // --- MÓDULO DE CADASTRO ---
                    System.out.println("================================================");
                    System.out.print("QUANTOS PRODUTOS DESEJA CADASTRAR (MÁX " + tamanhoEstoque + "): ");
                    int qtdCadastrar = scanner.nextInt();

                    // Validação simples para evitar erro de índice fora dos limites (IndexOutOfBounds)
                    if (qtdCadastrar <= tamanhoEstoque) {
                        for (int i = 0; i < qtdCadastrar; i++) {
                            scanner.nextLine(); // Limpeza de buffer para evitar pulo na leitura da String nome

                            System.out.println("\n--- CADASTRO DO " + (i + 1) + "º PRODUTO ---");
                            System.out.print("NOME DO PRODUTO: ");
                            nomeDosProdutos[i] = scanner.nextLine();

                            System.out.print("PREÇO DO PRODUTO: R$ ");
                            precoDosprodutos[i] = scanner.nextDouble();

                            System.out.print("QUANTIDADE EM ESTOQUE: ");
                            quantidadesDosProdutos[i] = scanner.nextInt();

                            System.out.print("CRIE UM ID ÚNICO (NÚMERO): ");
                            idDoAlmoxerife[i] = scanner.nextInt();
                        }
                        System.out.println("\nCADASTRO CONCLUÍDO COM SUCESSO!");
                        System.out.println("================================================");
                    } else {
                        System.out.println("ERRO: QUANTIDADE ACIMA DO LIMITE DO ESTOQUE.");
                    }
                    break;

                case 2:
                    // --- MÓDULO DE CONSULTA COM BUSCA BINÁRIA ---
                    
                    // PASSO 1: Ordenação via Selection Sort
                    // Necessário para que a Busca Binária funcione corretamente
                    for (int i = 0; i < idDoAlmoxerife.length - 1; i++) {
                        int indiceAtual = i;
                        // Busca o menor ID no restante do array para trazer para a frente
                        for (int j = i + 1; j < idDoAlmoxerife.length; j++) {
                            if (idDoAlmoxerife[j] < idDoAlmoxerife[indiceAtual]) {
                                indiceAtual = j;
                            }
                        }
                        // Troca (Swap) dos valores no array de IDs
                        int axiliar = idDoAlmoxerife[indiceAtual];
                        idDoAlmoxerife[indiceAtual] = idDoAlmoxerife[i];
                        idDoAlmoxerife[i] = axiliar;

                        // Sincronização: Troca os nomes correspondentes para o novo índice
                        String auxNome = nomeDosProdutos[indiceAtual];
                        nomeDosProdutos[indiceAtual] = nomeDosProdutos[i];
                        nomeDosProdutos[i] = auxNome;

                        // Sincronização: Troca os preços correspondentes
                        double auxPreco = precoDosprodutos[indiceAtual];
                        precoDosprodutos[indiceAtual] = precoDosprodutos[i];
                        precoDosprodutos[i] = auxPreco;

                        // Sincronização: Troca as quantidades correspondentes
                        int auxQtd = quantidadesDosProdutos[indiceAtual];
                        quantidadesDosProdutos[indiceAtual] = quantidadesDosProdutos[i];
                        quantidadesDosProdutos[i] = auxQtd;
                    }

                    // PASSO 2: Implementação da lógica de Busca Binária
                    int inicioDoArray = 0;
                    int finalDoArray = idDoAlmoxerife.length - 1;
                    int metadeDoArray; 
                    int idAtual; 
                    boolean encontrou = false;

                    System.out.print("DIGITE O ID DO PRODUTO QUE DESEJA ENCONTRAR: ");
                    idAtual = scanner.nextInt();

                    // Algoritmo que divide o espaço de busca pela metade a cada iteração
                    while ((inicioDoArray <= finalDoArray) && !encontrou) {
                        metadeDoArray = (inicioDoArray + finalDoArray) / 2;

                        if (idDoAlmoxerife[metadeDoArray] == idAtual) {
                            encontrou = true; // O item foi localizado
                        } else if (idAtual > idDoAlmoxerife[metadeDoArray]) {
                            inicioDoArray = metadeDoArray + 1; // Busca na metade superior
                        } else {
                            finalDoArray = metadeDoArray - 1; // Busca na metade inferior
                        }
                    }

                    // PASSO 3: Exibição do Resultado da Busca
                    System.out.println("================================================");
                    if (encontrou) {
                        // Varredura linear para confirmar e imprimir os dados do ID encontrado
                        for (int i = 0; i < idDoAlmoxerife.length; i++) {
                            if (idDoAlmoxerife[i] == idAtual ) {
                                System.out.println("PRODUTO LOCALIZADO!");
                                System.out.println("ID: " + idAtual);
                                System.out.println("NOME: " + nomeDosProdutos[i]);
                                System.out.println("PREÇO: R$ " + precoDosprodutos[i]);
                                System.out.println("ESTOQUE: " + quantidadesDosProdutos[i]);
                                System.out.println("================================================");
                                break; // Interrompe o loop após localizar
                            }
                        }
                    } else {
                        System.out.println("ID NÃO CADASTRADO NO SISTEMA.");
                    }
                    break;

                case 3:
                    // --- MÓDULO DE RELATÓRIO E AUDITORIA ---
                    System.out.println("\n===============================================");
                    System.out.println("        RELATÓRIO GERAL DE ESTOQUE             ");
                    System.out.println("===============================================");

                    double valorTotalEstoque = 0;
                    int itensTotais = 0;

                    // Percorre todos os índices do array para consolidar dados
                    for (int i = 0; i < idDoAlmoxerife.length; i++) {
                        // Filtro para ignorar registros vazios (onde o ID é zero)
                        if (idDoAlmoxerife[i] != 0) { 
                            System.out.println("ID: " + idDoAlmoxerife[i] + " | ITEM: " + nomeDosProdutos[i] + " | QNT: " + quantidadesDosProdutos[i] + " | PREÇO: R$" + precoDosprodutos[i]);
                            
                            // Acumuladores para estatísticas globais de valor e quantidade
                            valorTotalEstoque += (precoDosprodutos[i] * quantidadesDosProdutos[i]);
                            itensTotais += quantidadesDosProdutos[i];
                        }
                    }
                    System.out.println("-----------------------------------------------");
                    System.out.println("TOTAL DE ITENS NO ALMOXARIFADO: " + itensTotais);
                    System.out.printf("VALOR TOTAL PATRIMONIAL: R$ %.2f\n", valorTotalEstoque);
                    System.out.println("===============================================");
                    break;

                case 0:
                    // Altera a flag para encerrar a repetição do menu principal
                    sairDoloop = true;
                    break;

                default:
                    // Feedback para entradas fora do padrão do menu
                    System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE.");
                    break;
            }
        }
        System.out.println("SISTEMA ENCERRADO. ATÉ LOGO!");
        scanner.close(); // Encerramento do recurso Scanner
    }
}