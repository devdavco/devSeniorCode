import java.util.Scanner;

public class Validador {

    public static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.println(mensaje);
            if (sc.hasNextInt()) {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } else {
                System.out.println("No es un número entero. Intente de nuevo");
                sc.nextLine();
            }
        }

    }

    /*
    NUEVAS FUNCIONES: 
    - Validar hora ¿Está entre 8 y 18?
    - ¿Texto vació?
    - ¿Cupo disponible?
    
    Inserte aquí método 

    */

    public static double leerDecimal(Scanner sc , String mensaje){
        while(true){
            System.out.println(mensaje);
            if(sc.hasNextDouble()){
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            }else{
                System.out.println("No es un número valido. Intente de nuevo");
                sc.nextLine();
            }
        }
    }

    public static String leerTexto(Scanner sc, String mensaje){
            System.out.println(mensaje);
            return sc.nextLine();
    }

    public static void hayProducto(boolean hayProducto){
        if (!hayProducto) {
            System.out.println("Aun no hay ningun producto registrado.");
            return;
        }
    }

}
