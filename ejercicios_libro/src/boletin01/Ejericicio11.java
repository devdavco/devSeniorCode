package boletin01;
import util.Entrada;
public class Ejericicio11 {
    public static void main(String[] args) {
        //11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.

        int num;

        System.out.println("Ingrese un número entre 0 - 9.999 ");
        num = Entrada.entero();
        
        if((num >= 0) & (num <= 9999)){
            int cifras = Integer.toString(num).length();
            System.out.println("Tiene "+ cifras+" cifras");
        }else{
            System.out.println("Número fuera de rango/inválido");
        }
    }
}
