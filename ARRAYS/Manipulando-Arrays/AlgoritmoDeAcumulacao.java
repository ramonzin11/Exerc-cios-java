import java.util.Scanner;

/**
 * Algoritmo para coleta de dados e geração de métricas estatísticas simples.
 * Demonstra a técnica de acumulação de valores dentro de um laço de repetição.
 */
public class AlgoritmoDeAcumulacao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Vetor configurado para armazenar 7 registros (ex: uma semana)
        double[] temperatura = new double[7];
        
        // Acumulador inicializado em zero
        double somaTotal = 0;

        System.out.println("=== SISTEMA DE MONITORAMENTO CLIMÁTICO ===");

        // ETAPA DE COLETA E ACUMULAÇÃO
        for(int i = 0; i < temperatura.length; i++){
            System.out.print("DIGITE A " + (i + 1) + "ª TEMPERATURA: ");
            temperatura[i] = scanner.nextDouble();
            
            // Lógica de Acumulação: soma o novo valor ao total já existente
            somaTotal += temperatura[i];
        }

        // ETAPA DE SAÍDA E ESTATÍSTICA
        System.out.println("\n--- RELATÓRIO FINAL ---");
        System.out.println("SOMA TOTAL DAS TEMPERATURAS: " + somaTotal);
        
        // O uso do .length torna o cálculo adaptável a qualquer tamanho de vetor
        double media = somaTotal / temperatura.length;
        System.out.println("A MÉDIA DAS TEMPERATURAS É: " + media);

        scanner.close();
    }
}