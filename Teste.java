public class Teste {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Coordenadas p1 = new Coordenadas(2,7);
        Coordenadas p2 = new Coordenadas(3,6);

        double result = p1.distance(p1, p2);
    }
    
}
