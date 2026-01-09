public class AlgoritmoDeInversaoDeElementos {
    public static void main(String[] args) {
        
        int[] lista = {1,2,3,4,5,6};   
        int metade;

        System.out.println("LISTA DE NÚMEROS");
        for(int i = 0; i < lista.length;i++){
            System.out.println(lista[i]);
        }


        for(int i = 0; i < lista.length/2 ; i++){
            
            metade = lista[i];


            lista[i] = lista[(lista.length - 1) -i];

            lista[(lista.length - 1) -i] = metade;
        }

        System.out.println("NÚMEROS INVERTIDOS");
        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
        
    }
}
