package Java.ARRAYS.ALGORITMOSDEORDENACAO.ORDENACAOPORSELECAO;

public class Tesste {
    public static void main(String[] args) {
        
        int[] anos = {2010, 2023, 1988};
        int auxiliar;

        for(int i = 0; i < anos.length; i++){

            for(int j = 0; j < anos.length; i++){

                if(anos[j] >  anos[j + 1]){

                    auxiliar = anos[j + 1];
                    anos[j + 1] = anos[j];
                    anos[j] = auxiliar;
                }
            }
        }

        for(int p : anos){
            System.out.println(p);
        }
    }
}
