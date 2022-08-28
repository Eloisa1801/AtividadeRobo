
import java.util.Scanner;
 
public class Robo {
 
    double x, y, novaPos, qtdMove;
    public double getQtdMove() {
        return qtdMove;
    }

    public void setQtdMove(double qtdMove) {
        this.qtdMove = qtdMove;
    }

    public double getNovaPos() {
        return novaPos;
    }

    public void setNovaPos(double novaPos) {
        this.novaPos = novaPos;
    }

    Scanner ler = new Scanner(System.in);
 
    public double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(Double y) {
        this.y = y;
    }

    public Robo (double x, double y ){
   
        this.x = x;
        this.y = y;
    }
   
 
    public  void top( ){
   
        this.novaPos = getY()+qtdMove;
 
    }

    public void down( ){
        this.novaPos = getY()-qtdMove;
    }

    public void left( ){
        this.novaPos = getX()-qtdMove;
    }

    public void right( ){
        this.novaPos = getX()+qtdMove;
    }
}
