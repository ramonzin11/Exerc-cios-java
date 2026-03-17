import java.util.Scanner;
public class MaiorEMenorValor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[6];
    

        for(int j = 0; j < numeros.length; j++){
            System.out.println("Digite " + (j + 1) + "°: ");
            numeros[j] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0]; 

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        
        System.out.println("O Maior número " + maior);
        System.out.println("O menor números " + (menor));

        scanner.close();

    }

}
