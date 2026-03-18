import java.util.Scanner;
public class InversaoDeVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int metade = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + "° número: ");
            numeros[i] = scanner.nextInt();
            
        }
        System.out.println("-------------------------------------------------------");

        for(int i = 0; i < numeros.length / 2; i++){           
            int auxiliar = numeros[i];                        // salva o da frente
            numeros[i] = numeros[numeros.length - 1 - i];    // frente recebe o de trás
            numeros[numeros.length - 1 - i] = auxiliar;      // trás recebe o da frente
        }

        for (int i : numeros) {
            System.out.println(i);
        }

          
    }
}
