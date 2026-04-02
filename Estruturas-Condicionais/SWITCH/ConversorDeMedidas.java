import java.util.Scanner;

public class ConversorDeMedidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean sairDoLoop = false;
        int interacaoDoUsuario;

        System.out.println("Bem vindo ao conversor de medidas");

        while (!sairDoLoop) {
            System.out.println("\n1) Km para milhas");
            System.out.println("2) kg para libras");
            System.out.println("3) Celsius para Fahrenheit");
            System.out.println("0) Sair do menu");

            System.out.print("Escolha qual operação deseja realizar: ");
            interacaoDoUsuario = scanner.nextInt();

            switch (interacaoDoUsuario) {
                case 1:
                    System.out.print("Digite quantos km deseja converter para milhas: ");
                    double km = scanner.nextDouble();
                    double milhas = km * 0.6214;
                    System.out.println("A conversão de " + km + " km para milhas é " + milhas);
                    break;
                case 2:
                    System.out.print("Digite quantos kg deseja converter para libras: ");
                    double kg = scanner.nextDouble();
                    double libras = kg * 2.2046;
                    System.out.println("A conversão de " + kg + " kg para libras é " + libras);
                    break;
                case 3:
                    System.out.print("Digite quantos Celsius deseja converter para Fahrenheit: ");
                    double C = scanner.nextDouble();
                    double F = (C * 1.8) + 32;
                    System.out.println("A conversão de " + C + " C° para Fahrenheit é " + F);
                    break;
                case 0:
                    sairDoLoop = true;
                    break; // Adicionado o break aqui
                default:
                    System.out.println("Opção inválida!!");
                    break;
            }
        }

        scanner.close();
        
    }
}