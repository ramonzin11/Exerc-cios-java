package Java.ARRAYS.ALGORITMOSDEORDENACAO.BOLHA;

public class FiltroDePrecos {
    public static void main(String[] args) {
        
        double[] produtos = {19.90, 150.00, 5.50, 2000.0, 45.00};

        // --- ORDENAÇÃO CRESCENTE ---
        // A lógica aqui é garantir que o maior valor "flutue" para a última posição
        for(int i = 0; i < produtos.length; i++){
            for(int j = 0; j < produtos.length - 1; j++){
                // Se o atual for MAIOR que o próximo, eles trocam
                if(produtos[j] > produtos[j + 1]){
                    double axuliar = produtos[j + 1];
                    produtos[j + 1] = produtos[j];
                    produtos[j] = axuliar;
                }
            }
        }

        System.out.println("ORDEM CRESCENTE (Do mais barato ao mais caro):");
        for (double cre : produtos) {
            System.out.println("R$ " + cre);
        }

        System.out.println("================================");

        // --- ORDENAÇÃO DECRESCENTE ---
        // Reiniciamos a lógica, mas agora empurrando os MENORES para o final
        for(int i = 0; i < produtos.length; i++){
            for(int j = 0; j < produtos.length - 1; j++){
                // Se o atual for MENOR que o próximo, eles trocam
                // Isso faz com que os maiores fiquem presos no início do array
                if(produtos[j] < produtos[j + 1]){
                    double axuliar = produtos[j + 1];
                    produtos[j + 1] = produtos[j];
                    produtos[j] = axuliar;
                }
            }
        }

        System.out.println("ORDEM DECRESCENTE (Destaque para os mais caros):");
        for (double decre : produtos) {
            System.out.println("R$ " + decre);
        }
    }
}
