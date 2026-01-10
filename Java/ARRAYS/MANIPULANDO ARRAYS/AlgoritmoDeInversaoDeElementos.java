public class AlgoritmoDeInversaoDeElementos {
    public static void main(String[] args) {
        
        // Inicialização do vetor estático
        int[] lista = {1, 2, 3, 4, 5, 6};   
        int temp; // Variável auxiliar para realizar o swap (troca)

        System.out.println("--- LISTA ORIGINAL ---");
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }

        /* ALGORITMO DE INVERSÃO:
           Percorremos apenas até a metade (lista.length / 2).
           Se percorrêssemos o vetor inteiro, os elementos seriam 
           trocados duas vezes, voltando à ordem original.
        */
        for(int i = 0; i < lista.length / 2; i++){
            
            // 1. Armazena o valor da posição atual na variável temporária
            temp = lista[i];

            // 2. A posição atual recebe o valor da sua posição espelhada no final
            // Exemplo: se i=0 e o tamanho é 6, ele busca o índice (6-1)-0 = 5
            lista[i] = lista[(lista.length - 1) - i];

            // 3. A posição final recebe o valor que estava guardado na variável temporária
            lista[(lista.length - 1) - i] = temp;
        }

        System.out.println("\n--- LISTA INVERTIDA ---");
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
    }
}