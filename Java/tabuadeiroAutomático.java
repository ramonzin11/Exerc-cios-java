import java.util.Scanner;

public class tabuadeiroAutomático {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("=-=-=-= TABUADEIRO JAVA =-=-=-=-=");

        System.out.println("\n==================================");
        System.out.print("\nO valor de qual tabuada você deseja saber: ");
        int multiplicador = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int resultado = i * multiplicador;
            System.out.println(i + " X " + multiplicador + " = " + resultado);
            
        }

        scanner.close();
    }
}
