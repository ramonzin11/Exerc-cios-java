import java.util.Scanner;
 
public class ClassificadorDeTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lado 1: "); double lado1 = scanner.nextDouble();
        System.out.print("Lado 2: "); double lado2 = scanner.nextDouble();
        System.out.print("Lado 3: "); double lado3 = scanner.nextDouble();
 
        if((lado1+lado2)<=lado3||(lado3+lado1)<=lado2||(lado3+lado2)<=lado1){
            System.out.print("Nao e um triangulo");
        } else if(lado1==lado2 && lado2==lado3){
            System.out.print("Triangulo Equilatero");
        } else if(lado1==lado2||lado1==lado3||lado2==lado3){
            System.out.print("Triangulo Isosceles");
        } else {
            System.out.print("Triangulo Escaleno");
        }
        scanner.close();
    }
}

