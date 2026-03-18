import java.util.Scanner;
public class MediaDaTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];
        double mediaDosAlunos; 
        double totalDasNotas = 0;
        int acimaDamedia = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digita a nota do " + (i + 1) + "° aluno: ");
            notas[i] = scanner.nextDouble();
            totalDasNotas += notas[i];
        }

        mediaDosAlunos = totalDasNotas / notas.length;
        double maior = notas[0];
        
        for(int i = 0; i < notas.length; i++){
            if(maior < notas[i]){
                maior = notas[i];
            }

            if(notas[i] > mediaDosAlunos){
                acimaDamedia++;
            }
        }

        System.out.println("Alunos acima da média: " + acimaDamedia);
        System.out.println("A média dos " + notas.length + " alunos: " + mediaDosAlunos);
        System.out.println("A maior nota: " + maior);

        scanner.close();
    }
}
