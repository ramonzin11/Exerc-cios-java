public class FiltroDePrecos {
    public static void main(String[] args) {
        
        double[] produtos = {19.90, 150.00, 5.50, 2000.0, 45.00};

        // ORDENAÇÃO CRESCENTE
        for(int i = 0; i < produtos.length; i++){
            for(int j = 0; j < produtos.length - 1; j++){
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

        // ORDENAÇÃO DECRESCENTE
        for(int i = 0; i < produtos.length; i++){
            for(int j = 0; j < produtos.length - 1; j++){
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
