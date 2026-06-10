package boletin01;
import util.Entrada;
public class Ejercicio09 {
    public static void main(String[] args) {
        // Pedir dos números y mostrarlos ordenados de mayor a menor

        int num1,num2;

        System.out.println("Ingrese primer número: ");
        num1 = Entrada.entero();
        System.out.println("Ingrese segundo número: ");
        num2 = Entrada.entero();    

        if(num1>num2){
            System.out.println(num1 + " , "+num2);
        }else{
            System.out.println(num2 + " , "+num1);
        }
    }
}
