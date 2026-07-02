import java.util.Scanner;

public class Operaciones {

    static boolean hayProducto = false;

    static final int MAX = 10;
    static String[] nombres = new String[MAX];
    static int[] cantidades = new int[MAX];
    static double[] precios = new double[MAX];
    static int total = 0;


    static String[] clientes = new String[MAX];
    static int[] horas = new int[MAX];
    static String[][] servicios = new String[][] {{"1","Corte de Cabello","25000"},{"2","Tinte","60000"},{"3","Manicure","30000"}}; 


    public static void registrar(Scanner sc) {

        if (total == MAX) {
            System.out.println("Inventario lleno. No se pueden agregar mas productos.");
            return;
        }
        nombres[total] = Validador.leerTexto(sc, "Nombre del producto: ");
        cantidades[total] = Validador.leerEntero(sc, "Cantidad: ");
        precios[total] = Validador.leerDecimal(sc, "Precio unitario: ");
        total++;
        System.out.println("Producto registrado correctamente.");
    }


        public static void listar() {
        if (total == 0) {
            System.out.println("Aun no hay productos registrados.");
            return;
        }
        System.out.println("--- INVENTARIO ---");
        for (int i = 0; i < total; i++) {
            System.out.println((i + 1) + ". " + nombres[i]
                    + " | cant: " + cantidades[i]
                    + " | precio: " + precios[i]);
        }
    }


        public static void actualizarCantidad(Scanner sc) {
        if (total == 0) {
            System.out.println("Aun no hay productos registrados.");
            return;
        }
        listar();
        int pos = Validador.leerEntero(sc, "Numero del producto a actualizar: ");
        if (pos < 1 || pos > total) {
            System.out.println("Ese numero no existe en el inventario.");
            return;
        }
        cantidades[pos - 1] = Validador.leerEntero(sc, "Nueva cantidad: ");
        System.out.println("Cantidad actualizada.");
    }

    public static void verValorTotal() {
        if (total == 0) {
            System.out.println("Aun no hay productos registrados.");
            return;
        }
        double suma = 0;
        for (int i = 0; i < total; i++) {
            suma = suma + (cantidades[i] * precios[i]);
        }
        System.out.println("Valor total del inventario: " + suma);
    }


    /*
    - Agendar
    - Listar
    - Cancelar
    - Calcular reporte del día.
    */


}
