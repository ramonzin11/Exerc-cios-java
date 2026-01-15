

public class OrganizadorDeEntregas {
    public static void main(String[] args) {
        
        int[] pacotes = {400, 102, 50, 950, 20, 15, 88};
        int totalDeslocamentos = 0; // Contador solicitado no exercício

        // Começamos a partir do segundo elemento (índice 1)
        for(int i = 1; i < pacotes.length; i++){
            int chave = pacotes[i]; // O pacote que estamos tentando encaixar
            int j = i - 1;

            // O laço while "empurra" os pacotes maiores para a direita
            while (j >= 0 && pacotes[j] > chave) {
                pacotes[j + 1] = pacotes[j]; // Deslocamento para a direita
                j--;
                
                totalDeslocamentos++; // Contamos cada movimento de "empurrar"
            }
            
            // Colocamos o pacote (chave) no espaço vazio
            pacotes[j + 1] = chave;
        }

        // Exibição dos pacotes ordenados
        System.out.println("--- Rota de Entrega (Pacotes Ordenados) ---");
        for (int id : pacotes) {
            System.out.println("Pacote ID: " + id);
        }

        System.out.println("================================");
        System.out.println("O algoritmo precisou mover itens " + totalDeslocamentos + " vezes para abrir espaço.");
    }
}