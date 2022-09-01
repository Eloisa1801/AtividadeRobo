
public class Robo {
    Coordenadas position = new Coordenadas(2, 2);
    // char direction;
    public Robo(){}

    public Coordenadas getPosition() {
        return position;
    }
    public void setPosition(Coordenadas position) {
        this.position = position;
    }
    // public char getDirection() {
    //     return direction;
    // }
    // public void setDirection(char direction) {
    //     this.direction = direction;
    // }
    public Robo (double _x, double _y){
        this.position = new Coordenadas(_x, _y);

    }

    public void move(String dir, int qtdMove){}

    public void top( double qtdMove){
        position.setY(position.getY()+qtdMove);

    }

    public void down( int qtdMove){
        position.setY(position.getY()-qtdMove);
    }

    public void left( int qtdMove){
        position.setX(position.getX()+qtdMove);
    }

    public void right( int qtdMove){
        position.setX(position.getX()-qtdMove);
    }
}
