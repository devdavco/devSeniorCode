import java.util.Scanner;

public class Operaciones {


    static final int MAX = 10;

    static int cantReservas = 0;
    static String[] nombres = new String[MAX];
    static int[] horas = new int[MAX];
    static int[] servicios = new int[MAX];
   // static String[][] servicios = new String[][] {{"1","Corte de Cabello","25000"},{"2","Tinte","60000"},{"3","Manicure","30000"}}; 



public static void agendar(Scanner sc){

    System.out.println("Biendevido al Agendamiento");
    String nombre = sc.nextLine();

    if(cantReservas < MAX){
        //Con Cupo

    //  ========== NOMBRE ===========

        // Pedir y validar nombre
        System.out.println("Por favor ingresa nombre del Cliente:");
        nombre = sc.nextLine();
        boolean nombreValido = Validador.nombreValido(nombre) ;
        System.out.println(nombreValido);

        while(!nombreValido){

            System.out.println("Nombre ingresado incorrecto, intenta de nuevo");
            nombre = sc.nextLine();
            nombreValido = Validador.nombreValido(nombre);  

        }
       // System.out.println("Bienvenido "+ nombre);

    //  ========== HORA ===========

        // Pedir y validar hora
        System.out.println("Ingrese la hora deseada (8 - 17): ");

        int hora = sc.nextInt();
        boolean horaValida = Validador.horaValida(hora);

        //System.out.println("Hora: "+horaValida);

        while(!horaValida){
            System.out.println("Hora inválida. Intente otra: ");
            hora = sc.nextInt();
            horaValida = Validador.horaValida(hora);
            
        }
        
        for (int i : horas) {
            while( i == hora ){
                System.out.println("Hora Ocupada, intente otra");
                hora = sc.nextInt();
                horaValida = Validador.horaValida(hora);
            }
        }

        nombres[cantReservas] = nombre;
        horas[cantReservas] = hora;
        cantReservas ++;

        for(int i = 0 ; i < cantReservas ; i++){

            System.out.println("Nombre: " + nombres[i] + " | Hora: " +horas[i] );
        }


    }else{
        //Sin Cupo

        System.out.println("No hay cupos disponibles");
        return;
    }
}

/*
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
*/

    /*
    - Agendar
    - Listar
    - Cancelar
    - Calcular reporte del día.
    */


}
