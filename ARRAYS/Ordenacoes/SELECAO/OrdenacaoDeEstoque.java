public class OrdenacaoDeEstoque {
    public static void main(String[] args) {
        
        int[] estoque = {75, 12, 43, 5, 28, 30, 1, 2, 46, 1000};

        for(int i = 0; i < estoque.length - 1; i++){
            int atuaMenor = i;
            for(int j = i + 1; j < estoque.length; j++){
                if(estoque[j] < estoque[atuaMenor]){
                    atuaMenor = j;
                }
            }
            int variAxilia = estoque[atuaMenor];
            estoque[atuaMenor] = estoque[i];
            estoque[i] = variAxilia;
        }

        System.out.println("Estoque organizado de forma crescente:");
        for(int item : estoque){
            System.out.println(item);
        }
    }
}