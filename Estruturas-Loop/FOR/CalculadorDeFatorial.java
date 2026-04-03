import java.util.Scanner;
public class CalculadorDeFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digte o número que deseja vatora: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for(int i = 1; i <= numero; i++){
            fatorial *= i; // mesmo que fatorial = fatorial * i
        }

        System.out.println("O número fatorado: " + fatorial);

        scanner.close();
    }
}
