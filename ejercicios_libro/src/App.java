import util.Entrada;
import boletin01.Ejercicio01; 
import boletin01.Ejercicio02; 
import boletin01.Ejercicio03; 
import boletin01.Ejercicio04; 




public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("==== MENU PRINCIPAL ====");
        System.out.println("1. Boletín 1 - Ejercicio 1");
        System.out.println("2. Boletín 1 - Ejercicio 2");
        System.out.println("3. Boletín 1 - Ejercicio 3");
        System.out.println("4. Boletín 1 - Ejercicio 4");



        System.out.println("Ingrese el ejercicio a ejecutar: ");
        int opcion = Entrada.entero();

        if (opcion ==1){
              System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 1 --");
            // Ejecutamos llamando al método main del otro archivo
            Ejercicio01.main(args);
        }else if (opcion == 2) {
            System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 2 --");
            Ejercicio02.main(args);
        }else if (opcion == 3) {
            System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 3 --");
            Ejercicio03.main(args);
        }else if (opcion == 4) {
            System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 3 --");
            Ejercicio04.main(args);
        }
        else {
            System.out.println("Opción no válida");
        }

    

    }
}
