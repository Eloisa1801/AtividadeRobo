import java.util.Scanner;
public class Teste {

    public static void main(String[] args) throws Exception {
     
        Scanner ler = new Scanner(System.in);
       // Robo pos = new Robo(2,7);
        Coordenadas posicao = new Coordenadas(0,0)   ;
      
        Robo r = new Robo();
        System.out.printf("Informe a direcao :\n");
        String dir = ler.next();
        System.out.printf("Informe a qauntidade de casas a movimentar :\n");
        Double qtdMove = ler.nextDouble();
        r.move(dir, qtdMove);

        if(dir == "top"){
            top();
        }

        else if( dir == "down"){
            down();
        }
        else if( dir == "left"){
           left();
        }
        else if( dir == "right"){
            right();
        }
        else{
            System.out.println ("Opcao invalida");
        }
    }
    
}
