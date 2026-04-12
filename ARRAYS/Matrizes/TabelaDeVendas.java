public class TabelaDeVendas {
    public static void main(String[] args) {
        double[][] vendas = {
            {1500.0, 2300.0, 1800.0},
            {3200.0, 1100.0, 2700.0},
            {900.0,  4100.0, 3300.0}
        };

        System.out.println("--- Tabela de Vendas ---");
        for(int i = 0; i < vendas.length; i++){
            double totalVendedor = 0;
            System.out.print("Vendedor " + (i + 1) + ": ");
            for(int j = 0; j < vendas[i].length; j++){
                System.out.print("R$ " + vendas[i][j] + " ");
                totalVendedor += vendas[i][j];
            }
            System.out.println("| Total: R$ " + totalVendedor);
        }
    }
}