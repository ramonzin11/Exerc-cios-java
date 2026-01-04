import java.util.Scanner;

public class organizadorDeDespesas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Criamos um vetor para 7 dias. O 'double' permite números com vírgula (dinheiro).
        double[] desepesas = new double[7];
        
        // Variável acumuladora para somar os gastos totais.
        double totalDaDespesa = 0;

        System.out.println("===== CONTROLE DE DESPESAS ========");

        // PRIMEIRO LAÇO: Preenchimento do vetor
        for(int i = 0; i < desepesas.length; i++){
            // (i + 1) serve apenas para mostrar "dia 1" em vez de "dia 0" para o usuário.
            System.out.print("Quantos você gastou no dia " +( i + 1) + " :");
            desepesas[i] = scanner.nextDouble();
        }

        // SEGUNDO LAÇO: Processamento dos dados (Soma)
        for(int i = 0; i < desepesas.length; i++){
            // O operador '+=' pega o valor que já está na variável e soma com o novo.
            totalDaDespesa += desepesas[i];
        }

        // SAÍDA DE DADOS:
        System.out.println("O total de despesa: " + totalDaDespesa);
        
        // Calculamos a média dividindo o total pelo tamanho do vetor (.length).
        System.out.println("Sua média é " + (totalDaDespesa / desepesas.length));

        scanner.close();
    }
}
