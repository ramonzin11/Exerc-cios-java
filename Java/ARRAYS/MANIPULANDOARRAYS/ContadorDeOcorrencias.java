import java.util.Scanner;

public class ContadorDeOcorrencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conjunto de dados inicializado de forma estática
        int[] ocorrencias = {12, 7, 4, 6, 7, 7, 6, 5, 4, 3};
        
        // Inicialização do contador (Estado zero)
        int numerosDeOcorrencias = 0;
        int interacao;

        System.out.print("Qual é o id da sua ocorrência: ");
        interacao = scanner.nextInt();

        // Algoritmo de busca: O(n) - percorre o vetor uma única vez
        for(int i = 0; i < ocorrencias.length; i++){
            // Verificação de correspondência
            if(ocorrencias[i] == interacao){
                numerosDeOcorrencias++;
            }
        }

        // Exibição dos resultados processados
        System.out.print("A ocorrência do id: " + interacao + " aparece " + numerosDeOcorrencias + " vezes em nosso sistema");

        // Liberação de memória do recurso de entrada
        scanner.close();
    }
}