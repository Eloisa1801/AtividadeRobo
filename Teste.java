import java.util.Scanner;
public class Teste {

    public static void main(String[] args) throws Exception {
     
        Scanner ler = new Scanner(System.in);
        Robo pos = new Robo(2,7);
 
        System.out.println ( pos.getX ());
        System.out . println ( pos.getY ());
         
        System.out.printf("Informe a direcao :\n");
        String dir = ler.next();
        System.out.printf("Informe a qauntidade de casas a movimentar :\n");
        Double qtdMove = ler.nextDouble();

        if(dir == "top"){
            
            pos.top( );
        }

        else if( dir == "down"){
            pos.down ( );
        }
        else if( dir == "left"){
            pos.left ( );
        }
        else if( dir == "right"){
            pos.right ( );
        }
        else{
            System.out.println ("Opcao invalida");
        }
    }
    
}


