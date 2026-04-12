public class InteligenteOtimizacao {
    public static void main(String[] args) {
        
        int[] numeros = {1, 6, 3, 2, 7, 65, 35};

        for(int i = 0; i < numeros.length; i++){
            boolean trocou = false;

            for(int j = 0; j < numeros.length - 1; j++){
                if(numeros[j] > numeros[j + 1]){
                    int axuliar = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = axuliar;
                    trocou = true;
                }
            }

            if(!trocou){
                System.out.println("Array já ordenado. Parou na volta " + (i + 1));
                break;
            }
        }

        System.out.println("Resultado final:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}