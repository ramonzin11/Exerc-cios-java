

public class TrocaDeIdade {
    public static void main(String[] args) {
        
        int[] idadesDosUsuarios = {12, 23, 54, 16, 11, 2, 33};
        int totalTrocasRealizadas = 0; // Nome mais claro para o que estamos medindo

        // O laço 'i' controla quantas passagens faremos no total
        for(int i = 0; i < idadesDosUsuarios.length; i++){

            // O laço 'j' faz a comparação par a par (vizinhos)
            // Usamos -1 para não estourar o limite do array ao checar j + 1
            for(int j = 0; j < idadesDosUsuarios.length - 1; j++){

                // Se o número da esquerda for MAIOR que o da direita...
                if(idadesDosUsuarios[j] > idadesDosUsuarios[j + 1]){

                    // ...realizamos a troca (Swap) usando a variável auxiliar
                    int auxiliar = idadesDosUsuarios[j + 1];
                    idadesDosUsuarios[j + 1] = idadesDosUsuarios[j];
                    idadesDosUsuarios[j] = auxiliar;

                    // Incrementamos aqui para contar a troca REAL de posições
                    totalTrocasRealizadas++;
                }
            }
        }

        // Exibição dos dados organizados
        System.out.println("--- Idades Ordenadas ---");
        for (int idade : idadesDosUsuarios) {
            System.out.println(idade + " anos");
        }
        
        System.out.println("============================");
        System.out.println("O SISTEMA REALIZOU: " + totalTrocasRealizadas + " TROCAS DE POSIÇÃO.");
    }
}