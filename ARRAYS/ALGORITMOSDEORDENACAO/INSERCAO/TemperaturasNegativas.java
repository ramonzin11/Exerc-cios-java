package Java.ARRAYS.ALGORITMOSDEORDENACAO.INSERCAO;

public class TemperaturasNegativas {
    public static void main(String[] args) {
        
        // Criamos um array de doubles para suportar casas decimais e temperaturas negativas
        double[] temps = {5.2, -2.0, 15.5, -10.3, 0.0, -5.0};

        // --- INÍCIO DO ALGORITMO INSERTION SORT ---

        // O laço começa no índice 1 (a segunda temperatura), 
        // pois consideramos que a primeira já está "ordenada" sozinha.
        for(int i = 1; i < temps.length ; i++){
            
            // A 'chave' é a temperatura que estamos tentando encaixar no lugar certo
            double chave = temps[i]; 
            
            // 'j' representa o vizinho imediatamente à esquerda da nossa chave
            int j = i - 1;

            /*
             * O laço 'while' faz o trabalho de "abrir espaço":
             * 1. (j >= 0): Garante que não vamos tentar acessar um índice antes do começo do array.
             * 2. (temps[j] > chave): Verifica se o vizinho da esquerda é maior que a nossa chave.
             */
            while (j >= 0 && temps[j] > chave) {
                // Se o vizinho for maior, ele "pula" uma casa para a direita
                temps[j + 1] = temps[j];
                
                // Decrementamos j para continuar comparando com quem está mais atrás
                j--;
            }

            // Após sair do while, o 'j + 1' é a posição exata onde a chave deve entrar.
            // Aqui é feito o "encaixe" da temperatura.
            temps[j + 1] = chave;
        }

        // --- EXIBIÇÃO DOS RESULTADOS ---

        System.out.println("Temperaturas organizadas da mais fria para a mais quente:");
        
        // Utilizamos o for-each para percorrer o array e imprimir cada temperatura
        for(double temperatura : temps){
            System.out.println(temperatura + "°C");
        }
    }
}