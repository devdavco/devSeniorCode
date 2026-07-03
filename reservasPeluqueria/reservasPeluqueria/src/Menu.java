import java.util.Scanner;

public class Menu {

    public static void mostrar() {

        System.out.println("=== PELUQUERÍA MARTA   ===");
        System.out.println("1. Agendar una Reserva");
        System.out.println("2. Listar Reservas");
        System.out.println("3. Cancelar una Reserva");
        System.out.println("4. Ver Reporte Diario");
        System.out.println("5. Salir");
    }

    public static int leerOpcion(Scanner sc) {
        return sc.nextInt(); //Validador.leerEntero(sc, "Elige una opcion: ");
    }
}