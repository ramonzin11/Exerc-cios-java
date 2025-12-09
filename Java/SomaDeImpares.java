import java.util.Scanner;

public class SomaDeImpares {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int primeiroValor = scanner.nextInt();

        System.out.println("Digite outro valor: ");
        int segundoValor = scanner.nextInt();

        int somaTotal = 0;

        for(int i = primeiroValor; i  <= segundoValor; i++ ){
            if (i % 2 == 1) {
                somaTotal = somaTotal + i;
              
            }
        }

        System.out.println("A soma de todos os números Impares: " + somaTotal);
              


        scanner.close();
    
    }
}
