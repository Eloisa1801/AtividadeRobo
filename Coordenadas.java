public class Coordenadas {

    double x, y;

    public Coordenadas(){}

    public Coordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

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

    public double distance(Coordenadas p1, Coordenadas p2) {
        double d = Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2);
        return Math.sqrt(d);
    }
    
}
