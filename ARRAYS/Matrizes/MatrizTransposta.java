public class MatrizTransposta {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposta = new int[3][3];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz Original:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transposta:");
        for(int i = 0; i < transposta.length; i++){
            for(int j = 0; j < transposta[i].length; j++){
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}