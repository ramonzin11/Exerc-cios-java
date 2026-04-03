public class PiramideDeNumeros {
    public static void main(String[] args) {
        
       

        for(int i = 1; i <= 5; i++){ // controla as linhas
            for(int j = 1; j <= i; j++){    // controla os números de cada linha
                System.out.print(j + " ");
            }
            System.out.println();           // pula a linha
        }
    }
}

