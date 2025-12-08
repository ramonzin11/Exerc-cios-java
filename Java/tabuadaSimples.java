import java.util.Scanner;
public class tabuadaSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=*=*=*=*=* TABUADA SIMPLES =*=*=*=*=*=*");
        
        //? Nessa primeira etapa o usuario vai digite o número da tabuada que ele deseja ver
        System.out.print("Qual taboada você deseja saber : ");
        int numerotabuada = scanner.nextInt();

        //? vamos desclarar a variavel que vai ser multiplicada pelo número que o usuario definial 
        int multiplicador = 1;

        //? Aqui vai acomtecer a multiplicação 
        while (multiplicador <= 10) {
            int equacao = multiplicador * numerotabuada;
            System.out.println(multiplicador + " X " + numerotabuada + " = " + equacao);
            multiplicador++;
        }
        
        scanner.close();

    }
}
