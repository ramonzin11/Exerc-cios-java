
public class Teste{
    public static void main(String[] args) {
        
        double[] precos = {45.90, 12.50, 5.00, 30.00, 15.75, 2.10};
        double temp;

        for(int i = 0; i < precos.length; i++){

            for(int j = 0; j < precos.length - 1; j++){

                if(precos[j] > precos[j + 1]){

                    temp = precos[j];
                    precos[j] = precos[j+1];
                    precos[j + 1] = temp;
                }
            }
        }

        System.out.println("PREÇOS ORDENADOS:");
        for (double p : precos) {
        System.out.println(p);
        }
    }
}