import util.Entrada;
import boletin01.Ejercicio01; 
import boletin01.Ejercicio02; 
import boletin01.Ejercicio03; 
import boletin01.Ejercicio04; 
import boletin01.Ejercicio05;
import boletin01.Ejercicio06;
import boletin01.Ejercicio07;  
import boletin01.Ejercicio08; 
import boletin01.Ejercicio09; 
import boletin01.Ejercicio10; 
import boletin01.Ejercicio11; 






public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("==== MENU PRINCIPAL ====");
        System.out.println("1. Boletín 1 - Ejercicio 1");
        System.out.println("2. Boletín 1 - Ejercicio 2");
        System.out.println("3. Boletín 1 - Ejercicio 3");
        System.out.println("4. Boletín 1 - Ejercicio 4");
        System.out.println("5. Boletín 1 - Ejercicio 5");
        System.out.println("6. Boletín 1 - Ejercicio 6");
        System.out.println("7. Boletín 1 - Ejercicio 7");
        System.out.println("8. Boletín 1 - Ejercicio 8");
        System.out.println("9. Boletín 1 - Ejercicio 9");
        System.out.println("10. Boletín 1 - Ejercicio 10");
        System.out.println("11. Boletín 1 - Ejercicio 11");

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
            System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 4 --");
            Ejercicio04.main(args);
        }else if (opcion == 5) {
            System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 5 --");
            Ejercicio05.main(args);
        }else if (opcion == 6) {
            System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 6 --");
            Ejercicio06.main(args);
        }else if (opcion == 7) {
            System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 7 --");
            Ejercicio07.main(args);
        }else if (opcion == 8) {
            System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 8 --");
            Ejercicio08.main(args);
        }else if (opcion == 9) {
            System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 9 --");
            Ejercicio09.main(args);
        }else if (opcion == 10) {
            System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 10 --");
            Ejercicio10.main(args);
        }else if (opcion == 11) {
            System.out.println("\n-- Ejecutando Boletín 1, Ejercicio 11 --");
            Ejercicio11.main(args);
        }
        
        else {
            System.out.println("Opción no válida");
        }

    

    }
}
