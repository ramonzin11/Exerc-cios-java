public class InversorDePosições {
    public static void main(String[] args) {
        
        // Vetor original com os dados em ordem crescente.
        int[] n1 = {1, 2, 3, 4, 5};
        // Novo vetor vazio que será preenchido com a lógica de inversão.
        int[] n2 = new int[5];

        System.out.println("CONTAGEM DE 1 ATÉ 5 ");
        // Loop padrão para exibir o vetor original.
        for(int i = 0; i < n1.length; i++){
            System.out.println(n1[i]);
        }

        System.out.println("\nCONTAGEM DE 5 ATÉ 1 ");
        // LAÇO DE INVERSÃO:
        for(int i = 0; i < n2.length; i++){
            // A MÁGICA: O índice de n2 cresce (0, 1, 2...) 
            // enquanto o índice de n1 é calculado para diminuir (4, 3, 2...).
            // n2[0] recebe n1[4-0] -> n1[4] (o último número)
            n2[i] = n1[4 - i];
            
            // Exibe o valor já invertido dentro do novo vetor.
            System.out.println(n2[i]);      
        }
    }
}
