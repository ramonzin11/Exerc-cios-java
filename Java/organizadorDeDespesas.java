import java.util.Scanner;
public class organizadorDeDespesas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double[] desepesas = new double[7];
        double totalDaDespesa = 0;

        System.out.println("===== CONTROLE DE DESPESAS ========");

        for(int i = 0; i < desepesas.length; i++){
            System.out.print("Quantos você gastou no dia " +( i + 1) + " :");
            desepesas[i] = scanner.nextDouble();
        }

        for(int i = 0; i< desepesas.length; i++){
            totalDaDespesa += desepesas[i];
        
        }

        System.out.println("O total de despesa: " + totalDaDespesa);
        System.out.println("Sua média é " + (totalDaDespesa / desepesas.length));

        scanner.close();
    }
}
