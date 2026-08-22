import java.util.Scanner;

public class ConversorTemperatura{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intercaoDoUsuario;
        boolean sairDoloop = false;

        System.out.println("===== MANU DE CONVERÇÃO =====");
        System.out.println("1. CONVERTER DE CELSIUS PARA FAHRENHEIT \n2. CONVERTER DE FAHRENHEIT PARA CELSIUS \n3. CONVERTER DE CELSIUS PARA KELVIN  ");
        System.out.print("\nqual opção você deseja : ");
        intercaoDoUsuario = scanner.nextInt();

        while (!sairDoloop) {
           switch (intercaoDoUsuario) {
            case 1:
                System.out.print("QUANTO GRÃUS VOCÊ DESEJA CONVERTER: ");
                double graus = scanner.nextDouble();
                System.out.print("A converção de celsius para fahrenheit: " + celsiusParaFahrenheit(graus));
                sairDoloop = true;
                break;
            case 2:
                System.out.print("QUANTO GRÃUS VOCÊ DESEJA CONVERTER: ");
                double graus2 = scanner.nextDouble();
                System.out.print("A converção de fahrenheit para celso " + fahrenheitParaCelsius(graus2));
                sairDoloop = true;
                break;
            case 3: 
                System.out.print("QUANTO GRÃUS VOCÊ DESEJA CONVERTER: ");
                double graus3 = scanner.nextDouble();
                sairDoloop = true;
                System.out.print("A converção de fahrenheit para celso " + celsiusParaKelvin(graus3));
                break;
            default:
                System.out.println("Desculpe esse número está invalido ");
                sairDoloop = true;
                break;
           } 
            
        }

        scanner.close();
        

    }

    public static double celsiusParaFahrenheit(double celsius){
        double fahren = (celsius * 9/5) + 32;
        return fahren;
    }

    public static double fahrenheitParaCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    public static double celsiusParaKelvin(double celsius){
        double kelvin = celsius + 273.15;
        return kelvin;
    }

}