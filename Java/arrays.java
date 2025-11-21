public class arrays{
    public static void main(String[] args) {
        
        double[] notas = {7.5, 9.0, 6.5, 8.0, 5.0};

        double somatotal = 0;

        System.out.println("=-=-=-=- Somando todas as notas =-=-=-=-");
        
        for(int i = 0; i < notas.length; i++){
            somatotal = somatotal + notas[i];
            
        }

        System.out.println("A soma total de todas as notas : " + somatotal);
    }
}