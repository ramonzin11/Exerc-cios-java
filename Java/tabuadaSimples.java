import java.util.Scanner;
public class tabuadaSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=*=*=*=*=* TABUADA SIMPLES =*=*=*=*=*=*");
        
        System.out.print("Qual taboada você deseja saber : ");
        int numerotabuada = scanner.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10) {
            int equacao = multiplicador * numerotabuada;
            System.out.println(multiplicador + " X " + numerotabuada + " = " + equacao);
            multiplicador++;
        }
        

    }
}
