import java.util.Scanner;
 
public class AvaliacaoDeAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Frequencia do aluno: ");
        int frequencia = scanner.nextInt();
 
        double media = (nota1 + nota2 + nota3) / 3;
 
        if(7.0 <= media && 75 <= frequencia){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

        System.out.println("Media: " + media + " | Frequencia: " + frequencia);
        scanner.close();

    }
}
