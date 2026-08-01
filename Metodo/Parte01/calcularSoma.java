import java.util.Scanner;
public class calcularSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um valor: ");
        int valorA = scanner.nextInt();

        System.out.println("digite outro valor: ");
        int valorB = scanner.nextInt();
        
        System.out.println("a soma dos valore " + valorA + " + " + valorB + " = " + equacao(valorA, valorB));

        scanner.close();
    }

    public static int equacao(int valorA , int valorB){
        return valorA + valorB;
    }

    

}
