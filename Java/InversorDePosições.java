public class InversorDePosições {
    public static void main(String[] args) {
        
        int[] n1 = {1,2,3,4,5};
        int[] n2 = new int[5];

        System.out.println("CONTAGEM DE 1 ATÉ 5 ");
        for(int i = 0; i < n1.length; i++){
            System.out.println(n1[i]);
        }

        System.out.println("\nCONTAGEM DE 5 ATÉ 1 ");
        for(int i = 0; i < n2.length; i++){
            n2[i] = n1[4 - i];
            System.out.println(n2[i]);      
        }
        


    }
}
