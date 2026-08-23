import java.util.Scanner;
public class GeradorDeTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== TABUADA INTELIGENTE =====");

        System.out.print("QUAL NÚMERO VOCÊ QUER VER A TABUADA DE 1 Á 10: ");
        int numeroDoUsuario = scanner.nextInt();
        
        gerarTabuada(numeroDoUsuario);

        scanner.close();
    }

    public static void gerarTabuada(int numero){
        for(int i = 1; i <= 10; i++){
            int mult = numero * i;
            System.out.println(numero + " X " + i + " = " + mult);
        }
    }
}
