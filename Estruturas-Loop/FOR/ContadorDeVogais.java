import java.util.Scanner;
public class ContadorDeVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        

        for(int i = 0; i < palavra.length(); i++){
            palavra.toLowerCase();
            char letra = palavra.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }

        System.out.println("Essa palavra tem: " + contador + " Vogais");
        scanner.close();
    }
}
