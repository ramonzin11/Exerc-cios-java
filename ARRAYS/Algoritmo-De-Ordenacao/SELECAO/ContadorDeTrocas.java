

public class ContadorDeTrocas {
    public static void main(String[] args) {

        // Array desordenado para teste
        int[] intensDeTrocas = {1, 22, 34, 53, 2, 60, 0};
        
        // Variável para medir a eficiência: quantas vezes alteramos as posições no array
        int totalTrocas = 0;

        // --- INÍCIO DO SELECTION SORT ---
        
        // O laço externo define qual posição (i) estamos tentando preencher com o menor valor
        for(int i = 0; i < intensDeTrocas.length - 1; i++){
            
            // Assumimos inicialmente que o menor número está na posição atual
            int menorNumero = i;

            // O laço interno busca o menor valor real no restante do array (à direita)
            for(int j = i + 1; j < intensDeTrocas.length; j++){

                // Se encontrarmos alguém menor que o nosso atual 'menorNumero'...
                if(intensDeTrocas[j] < intensDeTrocas[menorNumero]){
                    // ...apenas atualizamos o índice do campeão (sem trocar ainda)
                    menorNumero = j;
                }
                // Nota: Comparações acontecem aqui dentro, mas trocas não.
            }

            // Lógica de Troca (Swap):
            // O valor que está na posição 'i' troca de lugar com o valor da posição 'menorNumero'
            int auxil = intensDeTrocas[i];
            intensDeTrocas[i] = intensDeTrocas[menorNumero];
            intensDeTrocas[menorNumero] = auxil;

            // Incrementamos o contador pois uma movimentação de memória ocorreu
            totalTrocas++;
        }

        // --- EXIBIÇÃO ---

        System.out.println("Array organizado:");
        for(int itens : intensDeTrocas){
            System.out.println(itens);
        }
        
        // Exibe o total de trocas. No Selection Sort, esse número é sempre (Tamanho do Array - 1)
        System.out.println("O algoritmo realizou " + totalTrocas + " trocas de posição.");
    }
}