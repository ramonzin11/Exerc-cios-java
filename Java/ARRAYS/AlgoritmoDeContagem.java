import java.util.Scanner;
public class AlgoritmoDeContagem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] intecaoDoUsuario = new int[8];
        int contatorPar = 0;
        int contatorImpar = 0;

        for(int i = 0; i < intecaoDoUsuario.length; i++){
            System.out.print((i + 1) + "° NUMERO: ");
            intecaoDoUsuario[i] = scanner.nextInt();

            if(intecaoDoUsuario[i] % 2 == 0){
                contatorPar++;
            }else{
                contatorImpar++;
            }
        }

        System.out.println("======= RESUMO DA OPEÇÃO =====");

        System.out.println("NÚMEROS PARES: ");
        for(int i = 0; i < intecaoDoUsuario.length; i++){
            if(intecaoDoUsuario[i] % 2 == 0){
                System.out.println(intecaoDoUsuario[i]);
            }
        }
        
        System.out.println("NÚMEROS IMPARES: ");
        for(int i = 0; i < intecaoDoUsuario.length; i++){
            if(intecaoDoUsuario[i] % 2 == 1){
                System.out.println(intecaoDoUsuario[i]);
            }
        }

        System.out.println("=====================================");
        System.out.println("NA OPERAÇÃO TEM " + contatorPar + " NÚMEROS PARES");
        System.out.println("NA OPERAÇÃO TEM " + contatorImpar + " NÚMEROS IMPARES");

        scanner.close();

    }
}
