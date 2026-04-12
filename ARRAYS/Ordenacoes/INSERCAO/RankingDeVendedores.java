public class RankingDeVendedores {
    public static void main(String[] args) {
        double[] vendas = {3500.0, 1200.0, 4800.0, 900.0, 2700.0};

        for(int i = 1; i < vendas.length; i++){
            double chave = vendas[i];
            int j = i - 1;
            while(j >= 0 && vendas[j] < chave){
                vendas[j + 1] = vendas[j];
                j--;
            }
            vendas[j + 1] = chave;
        }

        System.out.println("--- Ranking de Vendedores ---");
        for(int i = 0; i < vendas.length; i++){
            System.out.println((i + 1) + "° | R$ " + vendas[i]);
        }
    }
}