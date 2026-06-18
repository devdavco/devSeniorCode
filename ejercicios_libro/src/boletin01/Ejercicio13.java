package boletin01;
import util.Entrada;

public class Ejercicio13 {
    public static void main(String[] args) {
        //13. Pedir un número entre 0 y 99.999, decir si es capicúa.

        //Primero, debo sacar cada digito (dm,um,c,d,u) 

        //dm = Decesa de Mil
        //um = Unidad de mil
        //c = centena
        //d = decena
        //u = unidad

        //Para ello usaré el ejercicio anterior. Módulo ( % ) y división / 

        int numero = 0;
        int u,d,c,um,dm = 0;
        boolean capicua = false;
        
        System.out.println("Ingrese un número entre 0 y 99.999");
        numero = Entrada.entero();
        //Digito Unidad
        u = numero % 10;
        numero = numero /10;

        d = numero % 10;
        numero /=10;
        
        c = numero %10;
        numero /= 10;
        
        um  = numero%10;
        numero /= 10;

        dm = numero%10;
        
        //Para las 5 cifras
        if((dm == u) & (um == d) ){
            capicua = true;

            //para 4 cifras
        }else if(dm==0 & um == u & c == d){
            capicua = true;
            
            // 3 cifras
        }else if(dm == 0 & um == 0 & c == u){
            capicua = true;
            
            //2 cifras
        }else if(dm == 0 & um == 0 & c == 0 & d == u){
            capicua = true;
        }

        
        if(capicua){
            System.out.println("Es capicua");

        }else{
            System.out.println("No es capicua");
        }

        //Como tarea para alguien, validar que el número esté dentro del rango 0 y 99.999
        //pista hacer un while para seguir pidiendo el número en caso de no estar en rango
    }
}
