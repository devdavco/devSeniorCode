package boletin01;
import util.Entrada;
public class Ejercicio07 {
    public static void main(String[] args) {
        //Pedir dos números y decir cual es el mayor
        int num1,num2;

        System.out.println("Ingrese primer número: ");
        num1 = Entrada.entero();
        System.out.println("Ingrese segundo número: ");
        num2 = Entrada.entero();

        if ( num1 > num2 ){
            System.out.println(num1 + " es mayor que "+ num2);
        }else{
            System.out.println(num2 + " es mayor que " +num1);
        }
    }
}
