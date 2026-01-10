import java.util.Scanner;

/**
 * Algoritmo de busca simples para validação de dados.
 * Demonstra a técnica de busca linear com uso de flag sentinela.
 */
public class AlgoritmoDeBuscaSimples {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Base de dados simulada (Vetor de IDs com pendências)
        int[] idsUsuarios = {10, 12, 11, 16, 54, 25, 7, 9, 5, 3};
        int interacaoDoUsuario; 
        
        // Flag Booleana: Armazena o estado da busca (encontrado ou não)
        Boolean flagDoids = false;

        System.out.print("SISTEMA DE SEGURANÇA - DIGITE O NÚMERO DO SEU ID: ");
        interacaoDoUsuario = scanner.nextInt();

        // ETAPA DE BUSCA: Percorre o array comparando o alvo com cada elemento
        for(int i = 0; i < idsUsuarios.length; i++){
            if(idsUsuarios[i] == interacaoDoUsuario){
                // Se encontrar, altera o estado da flag
                flagDoids = true;
                // Dica técnica: Poderia ser usado um 'break' aqui para otimizar
            }
        }

        // ETAPA DE DECISÃO: Age com base no resultado da busca
        System.out.println("\n-------------------------------------------");
        if(flagDoids){
            System.out.println("RESULTADO: SEU ID ESTÁ COM PENDÊNCIAS.");
            System.out.println("STATUS: ACESSO BLOQUEADO!!!");
        } else {
            System.out.println("RESULTADO: ID NÃO CONSTA NA LISTA DE RESTRIÇÕES.");
            System.out.println("STATUS: ACESSO LIBERADO!!!");
        }
        System.out.println("-------------------------------------------");

        scanner.close();
    }
}