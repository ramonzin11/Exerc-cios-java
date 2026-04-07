public class RankingDeAlunos {
    public static void main(String[] args) {
        
        double notas[] = {9 , 10, 5, 7, 8 ,2 };

        for(int i = 0; i < notas.length - 1; i++){
            int notaMenor = i;

            for(int j = i + 1; j < notas.length; j++){
                if(notas[j] > notas[notaMenor]){
                    notaMenor = j;
                }
            }

            double varialAuxil = notas[notaMenor];
            notas[notaMenor] = notas[i];
            notas[i] = varialAuxil;
        }

       for(int i = 0; i < notas.length; i++){
            System.out.println("Notas do " + (i + 1)  + "° aluno: " + notas[i]);
       }
    }
}
