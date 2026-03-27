import java.util.Scanner;
public class ClassificadorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Classificador De Temperatura");

        System.out.println("Qual é a temperatura atual: ");
        double tempAtual = scanner.nextDouble();

        if(tempAtual < 10){
            System.out.println("Temperatura muito frio: " + tempAtual + "°");
        }else if(tempAtual >= 10 && tempAtual <= 17){
            System.out.println("Temperatura frio: " + tempAtual + "°");
        }else if(tempAtual >= 18 && tempAtual <= 25){
            System.out.println("Temperatura Agradável: " + tempAtual + "°");
        }else if(tempAtual >= 26 && tempAtual <= 35){
            System.out.println("Temperatura quente: " + tempAtual + "°");
        }else{
            System.out.println("Temperatura muito quente: " + tempAtual + "°");
        }

        scanner.close();
    }
}
