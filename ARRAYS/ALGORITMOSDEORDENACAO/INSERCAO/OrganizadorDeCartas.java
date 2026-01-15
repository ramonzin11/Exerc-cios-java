package Java.ARRAYS.ALGORITMOSDEORDENACAO.INSERCAO;

public class OrganizadorDeCartas {
    public static void main(String[] args) {
        
        // Array de inteiros simulando cartas ou códigos de produtos
        // Nota: Este array já está quase ordenado, o que é o cenário ideal para este algoritmo!
        int[] carts = {2, 3, 45, 54, 22, 300, 1000, 2000};

        // --- INÍCIO DO INSERTION SORT ---

        // Começamos do segundo elemento (índice 1)
        for(int i = 1; i < carts.length; i++){
            
            // 'chave' guarda o valor da "carta" que queremos posicionar corretamente
            int chave = carts[i];
            
            // 'j' começa sendo o índice do vizinho à esquerda da chave
            int j = i - 1;

            /*
             * O laço WHILE percorre a parte já organizada do array (à esquerda)
             * Ele move para a direita todos os números que são maiores que a nossa chave.
             */
            while (j >= 0 && carts[j] > chave) {
                // Desloca o valor maior para a posição da frente, "abrindo um buraco"
                carts[j + 1] = carts[j];
                
                // Recua o índice para comparar com o próximo elemento à esquerda
                j--;
            }

            // Quando encontramos um número menor que a chave (ou o início do array),
            // colocamos a chave no "buraco" que ficou vago (j + 1).
            carts[j + 1] = chave;
        }

        // --- EXIBIÇÃO ---

        System.out.println("Cartas organizadas com sucesso:");
        
        // Loop aprimorado (for-each) para mostrar o resultado final
        for(int item : carts){
            System.out.println(item);
        }
    }
}
