package figurasGeometricas;

public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public double getRadio() {
        return radio;
    }

    public boolean intersectaCon(Circulo otro) {
        double distanciaEntreCentros = Math
                .sqrt(Math.pow(this.centro.x - otro.centro.x, 2) + Math.pow(this.centro.y - otro.centro.y, 2));

        // Sumar los radios de los dos círculos
        double sumaDeRadios = this.radio + otro.radio;

        // Si la distancia entre los centros es menor o igual que la suma de los radios,
        // hay intersección
        return distanciaEntreCentros <= sumaDeRadios;

    }

}