import java.util.Scanner;

public class monitorDeTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] temperatura = new double[5];
        
        // Inicializamos com valores extremos para garantir que qualquer temperatura 
        // digitada entre no primeiro teste.
        double tempMaior = -999;
        double tempMenor = 999;

        System.out.println("BEM-VINDO AO MONITOR DE TEMPERATURA");

        // 1. Coleta de dados
        for(int i = 0; i < temperatura.length; i++){
            System.out.print("Qual é a temperatura da " + (i + 1) + " cidade: ");
            temperatura[i] = scanner.nextDouble();
        }

        // 2. Processamento: Encontrando os extremos
        for(int i = 0; i < temperatura.length; i++){
            // Se a temperatura da gaveta atual for maior que a que eu conheço, eu atualizo.
            if(temperatura[i] > tempMaior){
                tempMaior = temperatura[i];
            }
            // Se for menor que a que eu conheço, eu atualizo também.
            if(temperatura[i] < tempMenor){
                tempMenor = temperatura[i];
            }
        }

        // 3. Saída: Imprimimos o resultado final apenas UMA VEZ fora dos laços.
        System.out.println("\n===== RELATÓRIO FINAL =======");
        System.out.println("A MAIOR temperatura registrada foi: " + tempMaior + "°C");
        System.out.println("A MENOR temperatura registrada foi: " + tempMenor + "°C");

        scanner.close();
    }
}