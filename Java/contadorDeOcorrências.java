import java.util.Scanner;
public class contadorDeOcorrências {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] listaDeNumeros = {12,32,5,34,12,12,13,99,16,11};

        int intercaoDoUsario;
        int contador = 0; 

        System.out.println("====== BEM-VINDO AO CONTADOR DE OCORRÊNCIAS =======");

        System.out.print("Digite um número: ");
        intercaoDoUsario = scanner.nextInt();

        for(int i = 0; i < listaDeNumeros.length; i++){
            if(listaDeNumeros[i] == intercaoDoUsario){
                contador++;
            }
        }
        
        System.out.println("\nO número " + intercaoDoUsario + " aparece " + contador + " vezes");

        scanner.close();


    }
}
