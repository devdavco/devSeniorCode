package boletin01;
import util.Entrada;
public class Ejercicio06 {
    public static void main(String[] args) {
        // Pedir dos números y decir si uno es múltiplo del otro

        int num1,num2;

        System.out.println("Ingrese primer número: ");
        num1 = Entrada.entero();
        System.out.println("Ingrese segundo número: ");
        num2 = Entrada.entero();

        if(num1%num2==0){
            System.out.println(num1 + " es múltiplo de "+num2);
        }else{
            System.out.println("No son múltiplos.");
        }
    }
}
