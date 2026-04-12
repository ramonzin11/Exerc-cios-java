public class CadastroOrdenado {
    public static void main(String[] args) {
        int[] idades = {34, 12, 45, 23, 8};

        for(int i = 1; i < idades.length; i++){
            int chave = idades[i];
            int j = i - 1;
            while(j >= 0 && idades[j] > chave){
                idades[j + 1] = idades[j];
                j--;
            }
            idades[j + 1] = chave;
        }

        System.out.println("Idades ordenadas:");
        for(int idade : idades){
            System.out.println(idade);
        }
    }
}