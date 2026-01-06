

public class InversaoInPlace{
    public static void main(String[] args) {
        
        int[] ladoA = {1,2,3,4,5,6};
        int ladoB;

        for(int i = 0; i < ladoA.length / 2; i++){
            ladoB = ladoA[i];

            ladoA[i] = ladoA[(ladoA.length - 1) -i];

            ladoA[(ladoA.length -1) -i] = ladoB;
        }

       for(int i = 0; i < ladoA.length; i++){
        System.out.println(ladoA[i]);
       }
    }
}