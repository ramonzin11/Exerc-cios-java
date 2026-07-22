public class DiagonalPrincipal {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Elementos da diagonal principal:");
        int soma = 0;
        for(int i = 0; i < matriz.length; i++){
            System.out.println(matriz[i][i]);
            soma += matriz[i][i];
        }
        System.out.println("Soma da diagonal: " + soma);
    }
}