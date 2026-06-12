package boletin01;

import util.Entrada;

public class Ejercicio12 {
    public static void main(String[] args) {

        // 12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
        // 1998
        int num;
        String numReves = "";
        System.out.println("ingrese número: ");
        num = Entrada.entero();

        if (num >= 0 && num <= 9999) {
            while (num > 0) {
                int digito = num % 10;
                numReves += digito;
                num = num / 10;
            }
            System.out.println(numReves);

        }else{
            System.out.println("Número fuera de rango");
        }

    }
}
