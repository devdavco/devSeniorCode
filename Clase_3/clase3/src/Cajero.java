import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        // Cajereo tiene menu:
        // 1. Nuevo pedido
        // 2. Aplicar descuento
        // 3. Cerrar caja

        // El uso de switch. Con muchas options se usan de una
        // forma más clara.
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        boolean repetir = true;
        System.out.println("""
                --> Bienvevino al Cajero <--
                Por favor seleccione una opción:
                1. Nuevo pedido
                2. Aplicar Descuento
                3. Cerrar caja
                """);
        opcion = sc.nextInt();
        sc.nextLine();

        //Switch antiguo 
        // switch (opcion) {
        //     case 1:
        //         System.out.println("Nuevo Pedido");
        //         break;
        //     case 2:
        //         System.out.println("Aplicar descuento");

        //         break;
        //     case 3:
        //         System.out.println("Cerrar caja");
        //         break;
        //     default:
        //         System.out.println("Opción Inválida");

        // }

        //Switch Nuevo
        switch (opcion) {
            
            case 1 -> System.out.println("Nuevo Pedido! "); 
            case 2 -> System.out.println("Aplicar Descuento!");
            case 3 -> System.out.println("Cerrar caja");
            default -> System.out.println("Opción inválida!");
            
        }

    }

}
