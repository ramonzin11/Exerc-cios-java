import java.util.Scanner;
public class AlgoritmoDeAcumulacao{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double[] temperatura = new double[7];
        double cont = 0;


        System.out.println("BEM VINDO");

        for(int i = 0; i < temperatura.length; i++){
            System.out.print("DIGITE A " + ( i + 1) + "° TEMPERATURA: ");
            temperatura[i] = scanner.nextDouble();
            cont += temperatura[i];
        }

        System.out.println("O TOTAL DE TODAS AS TEMPERATURAS INSERIDA É: " + cont);
        System.out.println("A MÉDIA TOTAL É : " + (cont / temperatura.length));


        scanner.close();
    }
}