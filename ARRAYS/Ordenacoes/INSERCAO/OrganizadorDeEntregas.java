public class OrganizadorDeEntregas {
    public static void main(String[] args) {
        
        int[] pacotes = {400, 102, 50, 950, 20, 15, 88};
        int totalDeslocamentos = 0;

        for(int i = 1; i < pacotes.length; i++){
            int chave = pacotes[i];
            int j = i - 1;

            while (j >= 0 && pacotes[j] > chave) {
                pacotes[j + 1] = pacotes[j];
                j--;
                totalDeslocamentos++;
            }
            pacotes[j + 1] = chave;
        }

        System.out.println("--- Rota de Entrega (Pacotes Ordenados) ---");
        for (int id : pacotes) {
            System.out.println("Pacote ID: " + id);
        }
        System.out.println("Itens movidos: " + totalDeslocamentos + " vezes.");
    }
}