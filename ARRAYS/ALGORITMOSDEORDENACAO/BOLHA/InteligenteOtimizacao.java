package Java.ARRAYS.ALGORITMOSDEORDENACAO.BOLHA;

public class InteligenteOtimizacao {
    public static void main(String[] args) {
        
        int[] numeros = {1, 6, 3, 2, 7, 65, 35};

        // Laço externo: controla as passagens pelo array
        for(int i = 0; i < numeros.length; i++){
            
            // A "bandeira" (flag) começa como false a cada nova passagem
            boolean trocou = false;

            // Laço interno: compara os pares vizinhos
            for(int j = 0; j < numeros.length - 1; j++){
                if(numeros[j] > numeros[j + 1]){
                    // Realiza a troca (Swap)
                    int axuliar = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = axuliar;
                    
                    // Se houve ao menos UMA troca, marcamos como true
                    trocou = true;
                }
            }

            // O PONTO CHAVE: Se após percorrer o array inteiro o 'trocou' continuar false,
            // significa que o array já está perfeitamente ordenado.
            if(!trocou){
                System.out.println("Otimização: O array já está ordenado. Parando na volta " + (i + 1));
                break; // Sai do laço 'i' imediatamente
            }
        }

        // Exibição (Dica: Usei System.out para a cor padrão do console)
        System.out.println("Resultado final:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}