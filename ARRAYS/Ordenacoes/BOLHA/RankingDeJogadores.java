public class RankingDeJogadores {
    public static void main(String[] args) {
        int[] pontos = {50, 59,100,22,45};

        for(int i = 0; i < pontos.length; i++){
            for(int j = 0; j < pontos.length - 1; j++){
                if(pontos[j] < pontos[j + 1]){
                    int variavel = pontos[j];
                    pontos[j] = pontos[j + 1];
                    pontos[j + 1] = variavel;
                }
            }
        }

        for (int i : pontos) {
            System.out.println(i);
        }
    }
}
