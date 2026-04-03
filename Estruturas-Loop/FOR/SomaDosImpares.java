public class SomaDosImpares {
    public static void main(String[] args) {
        
        int contator = 0;

        System.out.println("Todos os números Impares de 1 a 10");

        for(int i = 1; i < 10; i++){

            if(i % 2 == 1){
               contator += i;
            }


            if(i % 2 == 1){
                System.out.println(i);
            }
        }

        System.out.println("A soma de todos os números Impares de 1 a 10: " + contator);
    }
}
