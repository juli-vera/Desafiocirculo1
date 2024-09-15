package test;

import org.junit.jupiter.api.Test;

import figurasGeometricas.Circulo;

import figurasGeometricas.Punto;

public class TestFigura {

    @Test
    public void crearCirculoTest() {
        Circulo c1 = new Circulo(new Punto(0, 0), 1);
        Circulo c2 = new Circulo(new Punto(1, 1), 1.5);

        System.out.println(c1.intersectaCon(c2));

    }
}
