import java.util.Scanner;

/**
 * Algoritmo para filtragem de elementos em vetores.
 * Aplica uma lógica de seleção baseada em uma condição pré-definida.
 */
public class AlgoritmoDeFiltragem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração do vetor com tamanho fixo (5 posições)
        double[] notasDosAluno = new double[5];

        // ETAPA 1: Entrada de Dados
        // O laço percorre o vetor preenchendo cada índice com a entrada do usuário
        for(int i = 0; i < notasDosAluno.length; i++){
            System.out.println("DIGITE A " + (i + 1) + "ª NOTA: ");
            notasDosAluno[i] = scanner.nextDouble();
        }

        System.out.println("\n--- RELATÓRIO: NOTAS ACIMA OU IGUAL A 7.00 ---");

        // ETAPA 2: Filtragem e Saída
        // Varredura completa do vetor para verificar a condição lógica
        for(int i = 0; i < notasDosAluno.length; i++){
            // Filtro Condicional: Apenas notas que atendem ao critério são impressas
            if(notasDosAluno[i] >= 7.00){
                System.out.println("Nota aprovada: " + notasDosAluno[i]);
            }
        }

        // Encerramento do recurso para evitar vazamento de memória (memory leak)
        scanner.close();
    }
}