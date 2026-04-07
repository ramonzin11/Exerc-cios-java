public class ClassificacaoDeProdutos {
    public static void main(String[] args) {
        
        double precos[] = {12.00, 30.00, 11.00, 5.50,50.00};

        for(int i = 0; i < precos.length - 1; i++){
            int atualmenor = i;

            for(int j = i + 1; j < precos.length; j++){
                if(precos[j] < precos[atualmenor]){
                    atualmenor = j;
                }
            
            }

            double variaAuxil = precos[atualmenor];
            precos[atualmenor] = precos[i];
            precos[i] = variaAuxil;

        }

      System.out.println("forma ordenada: " );
        for (double d : precos) {
            System.out.println("R$ " + d);
        }
    }
}
