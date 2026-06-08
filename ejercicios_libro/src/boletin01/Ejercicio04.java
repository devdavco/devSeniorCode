package boletin01;
import util.Entrada;
public class Ejercicio04 {
    public static void main(String[] args) {
        //Pedir dos números y decir si son iguales o no

        int n1,n2;

        System.out.println("¿Son iguales?\nIngrese el primer número: ");
        n1 = Entrada.entero();
        System.out.println("Ingrese el segundo número");
        n2 = Entrada.entero();

        if(n1==n2){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
    }

}
