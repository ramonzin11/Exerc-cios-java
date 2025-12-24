import java.util.Scanner;

public class elevadorDeCarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean sairDoloop = false;

        int pesoMaximo = 500;
        int interecaoDousuario;
        int pesoAtual = 0;

        System.out.println("=-=-=-=-=-=-=-=-= BEM VINDO PASSAGEIRO =-=-=-=-=-=-=-=");

        while (!sairDoloop) {
            System.out.println("=================================");    
            System.out.println("MENU PRINCIPAL");
            System.out.print("1: ADICIONAR CARGA \n2: VER PESO ATUAL \n0: SAIR ");
            
            System.out.print("\nEscolha uma opção: ");
            interecaoDousuario = scanner.nextInt();

            switch (interecaoDousuario){
                case 1:
                    System.out.println("=================================");
                    System.out.print("Insira a carga desejada : ");
                    int pesoDopassageiro = scanner.nextInt();

                    pesoAtual += pesoDopassageiro;
                    
                    if(pesoAtual > pesoMaximo){
                        System.out.println("=================================");
                        System.out.println("Peso excedido! Carga não permitida");
                        System.out.println("O peso atual: " + pesoAtual);
                        sairDoloop = true;
                    }else{
                        System.out.println("=================================");
                        System.out.println("Operação realizada !");
                    }
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.println("Peso atual : " + pesoAtual);
                    break;
                case 0:
                    sairDoloop = true;
                    break;
                default:
                    System.err.println("Opção não indentificada. Tente novamente!!!");
                    break;
            }

        
          
        }

        if(pesoAtual < pesoMaximo){
        System.out.println("=================================");
            System.out.println("Até a proxima...Boa viagem!!!");
        }else{
            System.out.println("=================================");
            System.out.println("Essa viagem não pode ser realizada!!!");

        }

        scanner.close();
    }
}
