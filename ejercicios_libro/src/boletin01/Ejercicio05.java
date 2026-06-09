package boletin01;
import util.Entrada;
public class Ejercicio05 {
    public static void main(String[] args) {
        //Pedir un número e indicar si es positivo o negativo

        int num1;

        System.out.println("Ingrese un número: ");
        num1 = Entrada.entero();
       
        if(num1>0){
            System.out.println(num1+ " es Positivo.");
        }else{
            System.out.println(num1+ " es Negativo.");

        }

    }
}
