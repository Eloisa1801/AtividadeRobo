
public class Robo {
    Coordenadas position;
    char direction;
    public Coordenadas getPosition() {
        return position;
    }
    public void setPosition(Coordenadas position) {
        this.position = position;
    }
    public char getDirection() {
        return direction;
    }
    public void setDirection(char direction) {
        this.direction = direction;
    }
    public Robo (double _x, double _y){
        this.position = new Coordenadas(_x, _y);

    }

    public void move(char dir, int qtdMove){}

    public void top(int pos){
        

    }

    public void down(int pos){
        
    }

    public void left(int pos){

    }

    public void right(int pos){
        
    }
}
