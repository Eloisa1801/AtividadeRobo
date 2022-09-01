import java.util.Scanner;

import javax.swing.text.Position;
public class Teste {

    public static void main(String[] args) throws Exception {
     
        Scanner ler = new Scanner(System.in);
        //Coordenadas position = new Coordenadas(1,3);
      
        Robo r = new Robo();
        System.out.println("Informe a direcao :");
        String dir = ler.next();
        System.out.println("Informe a qauntidade de casas a movimentar : ");
        int qtdMove = ler.nextInt();
        r.move(dir, qtdMove);
        if(dir.equals("top")){
            System.out.println("Entrei no if com dir valendo: " + dir);
            r.top(qtdMove);
            System.out.println("posição X: "+ r.position.getX());
            System.out.println("posição Y: "+ r.position.getY());
        }

        else if(dir.equals("down")){
            r.down(qtdMove);
            System.out.println("posição X: "+ r.position.getX());
            System.out.println("posição Y: "+ r.position.getY());
        }
        else if(dir.equals("left")){
            r.left(qtdMove);
            System.out.println("posição X: "+ r.position.getX());
            System.out.println("posição Y: "+ r.position.getY());
        }
        else if(dir.equals("right")){
            r.right(qtdMove);
            System.out.println("posição X: "+ r.position.getX());
            System.out.println("posição Y: "+ r.position.getY());
        }
        else{
             System.out.println ("Opcao invalida");
        }
    }
    
}
