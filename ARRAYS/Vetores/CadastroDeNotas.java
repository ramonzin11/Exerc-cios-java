import java.util.Scanner;
public class CadastroDeNotas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double totalDasNotas = 0;
        double media;

        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite " + (i + 1) + "°" + " nota: ");
            notas[i] = scanner.nextDouble();
            totalDasNotas += notas[i];
        }

        System.out.println("Notas registradas: ");
        for (double d : notas) {
            System.out.println(d);
        }

        media = totalDasNotas / notas.length;
        System.out.println("A média das notas: " + media);
        System.out.println("\nA soma total de todas as notas: " + totalDasNotas);

        scanner.close(); 
    }
}
