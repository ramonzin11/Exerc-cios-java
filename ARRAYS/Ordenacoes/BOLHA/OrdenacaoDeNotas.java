public class OrdenacaoDeNotas {
    public static void main(String[] args) {
        
        double[] notas = {5.0, 9.0, 10.0, 2.0, 4.5,2.5};

        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas.length - 1; j++){
                if(notas[j] > notas[j + 1]){
                    
                    double axuliar = notas[j + 1];
                    notas[j + 1] = notas[j];
                    notas[j] = axuliar;
                }
            } 
            
        }

        for (double d : notas) {
            System.out.println(d);
        }
        
    }
}
