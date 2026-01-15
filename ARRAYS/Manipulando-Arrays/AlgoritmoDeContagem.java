import java.util.Scanner;

/**
 * Algoritmo para contagem e separação visual de números pares e ímpares.
 * Demonstra o uso de contadores e filtros lógicos em vetores.
 */
public class AlgoritmoDeContagem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Vetor para armazenar 8 intenções (entradas) do usuário
        int[] intecaoDoUsuario = new int[8];
        
        // Inicialização dos contadores (Estado zero)
        int contatorPar = 0;
        int contatorImpar = 0;

        // ETAPA 1: Entrada e Processamento em tempo real
        for(int i = 0; i < intecaoDoUsuario.length; i++){
            System.out.print((i + 1) + "° NUMERO: ");
            intecaoDoUsuario[i] = scanner.nextInt();

            // Lógica de Paridade: Se o resto da divisão por 2 for 0, é par
            if(intecaoDoUsuario[i] % 2 == 0){
                contatorPar++;
            } else {
                contatorImpar++;
            }
        }

        System.out.println("\n======= RESUMO DA OPERAÇÃO =====");

        // ETAPA 2: Filtragem de Pares
        System.out.println("NÚMEROS PARES ENCONTRADOS:");
        for(int i = 0; i < intecaoDoUsuario.length; i++){
            if(intecaoDoUsuario[i] % 2 == 0){
                System.out.println("-> " + intecaoDoUsuario[i]);
            }
        }
        
        // ETAPA 3: Filtragem de Ímpares
        System.out.println("\nNÚMEROS ÍMPARES ENCONTRADOS:");
        for(int i = 0; i < intecaoDoUsuario.length; i++){
            // Verificação por resto 1 (ímpar)
            if(intecaoDoUsuario[i] % 2 == 1 || intecaoDoUsuario[i] % 2 == -1){
                System.out.println("-> " + intecaoDoUsuario[i]);
            }
        }

        // ETAPA 4: Exibição das métricas finais
        System.out.println("=====================================");
        System.out.println("RESULTADO: " + contatorPar + " números pares.");
        System.out.println("RESULTADO: " + contatorImpar + " números ímpares.");

        scanner.close();
    }
}