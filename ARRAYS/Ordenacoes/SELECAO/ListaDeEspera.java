
public class ListaDeEspera {
    public static void main(String[] args) {


       int lista[] = {1,3,2,4,5};

        for(int i = 0; i < lista.length - 1; i++){
            int atualPrimeiro = i;

            for(int j = i + 1; j < lista.length; j++){
                if(lista[j] < lista[atualPrimeiro]){
                    atualPrimeiro = j;
                }
            }

            int varialAuxil = lista[atualPrimeiro];
            lista[atualPrimeiro] = lista[i];
            lista[i] = varialAuxil;
        }

        for(int i = 0; i < lista.length; i++){
            System.out.println((i+ 1) + "° | Número da ficha: " + lista[i] );
        }
    }
}
