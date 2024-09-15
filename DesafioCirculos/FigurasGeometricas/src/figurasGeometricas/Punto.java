package figurasGeometricas;

public class Punto {
    public double x;
    public double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /*
     * public double distanciaA(Punto otro) {
     * double dx = this.x - otro.x;
     * double dy = this.y - otro.y;
     * return Math.sqrt(dx * dx + dy * dy);
     * }
     */

}
