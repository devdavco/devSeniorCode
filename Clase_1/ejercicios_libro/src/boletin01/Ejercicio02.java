package boletin01;

import util.Entrada;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Pedir el radio de un círculo y calcular su área. A=PI*r^2
        double a, r;
        System.out.println("Introduce el radio de un círculo: ");
        r = Entrada.real();
        a = Math.PI * (r * r);
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a);
    }

}
