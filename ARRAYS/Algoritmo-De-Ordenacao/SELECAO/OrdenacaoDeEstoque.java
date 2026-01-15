

public class OrdenacaoDeEstoque {
    public static void main(String[] args) {
        
        // Array de teste com valores desordenados
        int[] estoque = {75, 12, 43, 5, 28, 30, 1, 2, 46, 1000};
      
        // --- ALGORITMO SELECTION SORT (ORDENAÇÃO POR SELEÇÃO) ---

        // Laço externo: percorre o array até o penúltimo elemento
        // Ele define a posição 'i' que queremos preencher com o valor correto
        for(int i = 0; i < estoque.length - 1; i++){
            
            // Iniciamos assumindo que o menor valor está na posição atual (i)
            int atuaMenor = i; 

            // Laço interno: procura o menor valor no restante do array (de i + 1 em diante)
            for(int j = i + 1; j < estoque.length; j++){

                // Se encontrarmos um valor menor que o nosso "atuaMenor" atual...
                if(estoque[j] < estoque[atuaMenor]){
                    // ...apenas anotamos o NOVO índice do menor valor encontrado
                    atuaMenor = j;
                }
            }

            // Lógica de TROCA (Swap):
            // Após encontrar o menor valor de toda a rodada, trocamos com a posição 'i'
            // Usamos a variável auxiliar (variAxilia) como um "copo temporário"
            int variAxilia = estoque[atuaMenor]; // Salva o menor valor
            estoque[atuaMenor] = estoque[i];     // Move o valor da posição atual para onde estava o menor
            estoque[i] = variAxilia;             // Coloca o menor valor na sua posição correta (i)
        }

        // --- EXIBIÇÃO DOS DADOS ---

        System.out.println("Estoque organizado de forma crescente:");
        
        // Uso do For-Each para percorrer e imprimir o array de forma limpa
        for(int item : estoque){
            System.out.println(item);
        }
    }
}