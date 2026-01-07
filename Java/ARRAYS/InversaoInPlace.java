/**
 * PROJETO: Inversão Otimizada de Vetores (In-Place)
 * OBJETIVO: Inverter um array sem utilizar memória adicional (vetor reserva).
 */
public class InversaoInPlace {
    public static void main(String[] args) {
        
        // Vetor original
        int[] ladoA = {1, 2, 3, 4, 5, 6};
        
        // Variável temporária para realizar a troca (swap)
        int ladoB;

        // O loop percorre apenas até a metade para evitar a "desinversão"
        for(int i = 0; i < ladoA.length / 2; i++){
            
            // 1. Guarda o valor atual na variável temporária
            ladoB = ladoA[i];

            // 2. Traz o valor da extremidade oposta para a posição atual
            ladoA[i] = ladoA[(ladoA.length - 1) - i];

            // 3. Move o valor guardado na temporária para a extremidade oposta
            ladoA[(ladoA.length - 1) - i] = ladoB;
        }

        // Impressão do vetor após a inversão completa
        System.out.println("Vetor Invertido:");
        for(int i = 0; i < ladoA.length; i++){
            System.out.println(ladoA[i]);
        }
    }
}