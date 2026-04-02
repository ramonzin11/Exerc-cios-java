import java.util.Scanner;
public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroValor;
        int segundoValor;
        int interacaoDoUsuario;
        boolean sairDoLoop = false;

        int soma;
        int subtracao;
        int multiplicao;
        int divisao;

        

        while (!sairDoLoop) {
            System.out.println(" ============= Bem vindo ============");

            System.out.print("Digite o primeiro valor: ");
            primeiroValor = scanner.nextInt();

            System.out.println("Digite o segundo valor: ");
            segundoValor = scanner.nextInt();

            System.out.println("1: SOMA");
            System.out.println("2: SUBTRAÇÃO");
            System.out.println("3: DIVISÃO");
            System.out.println("4: MULTIPLICAÇÃO");
            System.out.println("0 Sair do menu");
            System.out.print("\nEscolha qual operação deseja realizar!");
            interacaoDoUsuario = scanner.nextInt();

            switch (interacaoDoUsuario) {
                case 1:
                    soma = primeiroValor + segundoValor;
                    System.out.println(primeiroValor +  " + " + segundoValor + " = " + soma);
                    break;
                case 2:
                    subtracao = primeiroValor - segundoValor;
                    System.out.println(primeiroValor +  " - " + segundoValor + " = " + subtracao);
                    break;
                case 3:
                    divisao = primeiroValor / segundoValor;
                    System.out.println(primeiroValor +  " / " + segundoValor + " = " + divisao);
                    break;
                case 4: 
                    multiplicao = primeiroValor * segundoValor;
                    System.out.println(primeiroValor +  " * " + segundoValor + " = " + multiplicao);
                    break;
                case 0:
                    sairDoLoop = true;
                default:
                    System.out.println("Desculpe opção invalida!!!");
                    break;
            }

        }

        scanner.close();
    }
}
