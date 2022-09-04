import java.util.Scanner;

import javax.swing.text.Position;
public class Teste {
   
    public static void main(String[] args) throws Exception {
     
        Scanner ler = new Scanner(System.in);
        //Coordenadas position = new Coordenadas(1,3);
      
        Robo r = new Robo();

        System.out.println("----------------------");
        System.out.println("1 - MOVIMENTAR ROBO");
        System.out.println("2 - SAIR");
        System.out.println("----------------------");
        int op = ler.nextInt();
 
        while(op==1) { 
            System.out.println("Informe a direcao :");
            String dir = ler.next();
            System.out.println("Informe a qauntidade de casas a movimentar : ");
            int qtdMove = ler.nextInt();
            r.move(dir, qtdMove);
    
            if(dir.equals("top")){
                r.posAnderior();
                r.top(qtdMove);
                r.novaPos(); 
            }

            else if(dir.equals("down")){
                r.posAnderior();
                r.down(qtdMove);
                r.novaPos();
            }
            else if(dir.equals("left")){
                r.posAnderior();
                r.left(qtdMove);
                r.novaPos();
            }
            else if(dir.equals("right")){
                r.posAnderior();
                r.right(qtdMove);
                r.novaPos();
            }
            else{
                System.out.println ("Opcao invalida");
                System.out.println("----------------------");
                System.out.println("1 - CONTINUAR");
                System.out.println("2 - SAIR");
                System.out.println("----------------------");
                op = ler.nextInt();
                
            } 
        }
    }
    
}
