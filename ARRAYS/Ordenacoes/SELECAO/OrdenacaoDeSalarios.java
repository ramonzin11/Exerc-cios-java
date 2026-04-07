import java.util.Scanner;
public class OrdenacaoDeSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario[] = new double[5];

        for(int i = 0; i < salario.length; i++){
            System.out.println("Digite o salário " + (i + 1) + "° funcionário: ");
            salario[i] = scanner.nextDouble();
        }

        for(int i = 0; i < salario.length - 1; i++){
            int menorSalario = i;

            for(int j = i + 1; j < salario.length; j++){
                if(salario[j] < salario[menorSalario]){
                    menorSalario = j;
                }

            }
            double variavelAuxil = salario[menorSalario];
            salario[menorSalario] = salario[i];
            salario[i] = variavelAuxil;
        }

        for(int i = 0; i < salario.length; i++){
            System.out.println("Salário do " + (i + 1) + "° funcionário: " + salario[i]);
        }

        scanner.close();
    }
}
