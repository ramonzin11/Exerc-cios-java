import java.util.Scanner;
public class olheiroDeAtletas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double[] alturas = new double[5];

        System.out.println("=-=-=-=-= MENU DE DESEMPENHO =-=-=-=-=");

        for(int i = 0; i < alturas.length; i++){
            System.out.print("Digite a altura do " + (i + 1) + " atleta: ");
            alturas[i] = scanner.nextDouble();
        }

        for(int i = 0; i < alturas.length; i++){
            if(alturas[i] >= 1.80){
                System.out.println("======================================");
                System.out.println("Altura: " + alturas[i] + " CM");
                System.out.println("DESEMPENHO ADEQUADO!!!");
            }
        }

        scanner.close();
    }
}
