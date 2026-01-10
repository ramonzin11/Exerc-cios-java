import java.util.Scanner;

public class contadorDeOcorrências {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Vetor inicializado com alguns números repetidos (ex: o 12) para testar a lógica.
        int[] listaDeNumeros = {12, 32, 5, 34, 12, 12, 13, 99, 16, 11};

        int intercaoDoUsario;
        // Variável 'contador' começa em zero. Ela só aumenta quando achamos o número.
        int contador = 0; 

        System.out.println("====== BEM-VINDO AO CONTADOR DE OCORRÊNCIAS =======");

        System.out.print("Digite um número: ");
        intercaoDoUsario = scanner.nextInt();

        // LAÇO DE BUSCA: O 'i' percorre todas as posições do vetor, da 0 até a 9.
        for(int i = 0; i < listaDeNumeros.length; i++){
            // IF (SE): Compara se o valor na gaveta atual é igual ao que o usuário digitou.
            if(listaDeNumeros[i] == intercaoDoUsario){
                // Se for igual, incrementamos o contador em +1.
                contador++;
            }
        }
        
        // SAÍDA: Exibimos o resultado final após checar o vetor inteiro.
        System.out.println("\nO número " + intercaoDoUsario + " aparece " + contador + " vezes");

        scanner.close();
    }
}