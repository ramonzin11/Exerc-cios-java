package Java.ARRAYS.ALGORITMOSDEORDENACAO.SELECAO;

public class RankingDecrescente {
    public static void main(String[] args) {
        
        // Array representando pontuações de jogadores
        int[] pontuacoes = {450, 800, 120, 1500, 990};

        // --- ALGORITMO SELECTION SORT (ORDEM DECRESCENTE) ---

        // Percorremos o array definindo a posição 'i' que deve receber o MAIOR valor da rodada
        for(int i = 0; i < pontuacoes.length - 1; i++){
            
            // Iniciamos assumindo que o maior valor está na posição atual (i)
            int maior = i;

            // O laço interno busca o maior valor no restante do array
            for(int j = i + 1; j < pontuacoes.length; j++){
                
                // MUDANÇA CHAVE: Usamos '>' para encontrar o maior valor e trazê-lo para o início
                if(pontuacoes[j] > pontuacoes[maior]){
                    // Anotamos o índice onde o maior valor foi encontrado
                    maior = j;
                }
            }

            // Lógica de TROCA (Swap):
            // Trocamos o valor da posição atual 'i' pelo valor encontrado no índice 'maior'
            int variaAxuliar = pontuacoes[i];
            pontuacoes[i] = pontuacoes[maior];
            pontuacoes[maior] = variaAxuliar;
        }

        // --- EXIBIÇÃO DO RANKING ---
        System.out.println("RANKING DE PONTUAÇÕES (DO MAIOR PARA O MENOR):");
        
        // Utilizando For-Each para uma leitura simplificada do array final
        for(int itens : pontuacoes){
            System.out.println(itens);
        }

    }
}
