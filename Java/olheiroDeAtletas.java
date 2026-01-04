import java.util.Scanner; // Importa a ferramenta para ler dados do teclado

public class olheiroDeAtletas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // DECLARAÇÃO: Criamos um array (vetor) de números reais (double)
        // Reservamos 5 espaços contínuos na memória RAM.
        double[] alturas = new double[5];

        System.out.println("=-=-=-=-= MENU DE DESEMPENHO =-=-=-=-=");

        // PRIMEIRO LAÇO (ENTRADA DE DADOS):
        // Usamos 'i' como o índice para acessar cada gaveta do vetor de 0 a 4.
        for(int i = 0; i < alturas.length; i++){
            System.out.print("Digite a altura do " + (i + 1) + " atleta: ");
            
            // O valor digitado é guardado na posição 'i' do vetor.
            alturas[i] = scanner.nextDouble();
        }

        // SEGUNDO LAÇO (PROCESSAMENTO/FILTRO):
        // Percorremos o vetor novamente para analisar os dados que já estão salvos.
        for(int i = 0; i < alturas.length; i++){
            
            // IF (A CONDIÇÃO): Verificamos o valor dentro da gaveta atual.
            if(alturas[i] >= 1.80){
                System.out.println("======================================");
                // Exibimos apenas os dados que passaram no filtro (>= 1.80)
                System.out.println("Altura: " + alturas[i] + " CM");
                System.out.println("DESEMPENHO ADEQUADO!!!");
            }
        }

        scanner.close(); // Fecha o scanner para liberar recursos do sistema
    }
}