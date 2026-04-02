import java.util.Scanner;
public class MenuDeRestaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int interacaoDoUsuario;
        boolean sairDoLoop = false;

        String nomeDoPrato01 = "MACARRÇÃO COM MOLHO BRANCO";
        double valorDoPrato01 = 50.00;

        String nomeDoPrato02 = "LASANHA DE FRANGO";
        double valorDoPrato02 = 45.00;

        String nomeDoPrato03 = "FRANGO EMPANADO";
        double valorDoPrato03 = 55.00;

        String nomeDoPrato04 = "FRANGO GRELHADO";
        double valorDoPrato04 = 60.00;

        String nomeDoPrato05 = "CAMARÃO COM MOLH0";
        double valorDoPrato05 = 70.00;

        while (!sairDoLoop) {
            System.out.println("1: PRATO 1");
            System.out.println("2: PRATO 2");
            System.out.println("3: PRATO 3");
            System.out.println("4: PRATO 4");
            System.out.println("5: PRATO 5");
            System.out.println("0 Sair do menu");
            System.out.print("\nEscolha qual operação deseja realizar!");
            interacaoDoUsuario = scanner.nextInt();

            switch (interacaoDoUsuario) {
                case 1:
                    System.out.println("NOME DO PRATO: " + nomeDoPrato01 + " | VALOR DO PRATO: " + valorDoPrato01);
                    break;
                case 2:
                    System.out.println("NOME DO PRATO: " + nomeDoPrato02 + " | VALOR DO PRATO: " + valorDoPrato02);
                    break;
                case 3:
                    System.out.println("NOME DO PRATO: " + nomeDoPrato03 + " | VALOR DO PRATO: " + valorDoPrato03); 
                    break;
                case 4:
                    System.out.println("NOME DO PRATO: " + nomeDoPrato04 + " | VALOR DO PRATO: " + valorDoPrato04); 
                    break;
                case 5:
                    System.out.println("NOME DO PRATO: " + nomeDoPrato05 + " | VALOR DO PRATO: " + valorDoPrato05);           
                default:
                    System.out.println("Opção invalida!!!");
                    break;
            }
        }

        scanner.close();


    }
}
