import java.util.Scanner;

public class Operaciones {

    static final int MAX = 2;

    static int cantReservas = 0;
    static String[] nombres = new String[MAX];
    static int[] horas = new int[MAX];
    static int[] servicios = new int[MAX];
    // static String[][] servicios = new String[][] {{"1","Corte de
    // Cabello","25000"},{"2","Tinte","60000"},{"3","Manicure","30000"}};

    public static void agendar(Scanner sc) {

        if (cantReservas < MAX) {
            System.out.println("Bienvenido al Agendamiento");
            String nombre = "";

            // Con Cupo

            // ========== NOMBRE ===========

            // Pedir y validar nombre
            System.out.println("Por favor ingresa nombre del Cliente:");
            nombre = sc.nextLine();
            boolean nombreValido = Validador.nombreValido(nombre);
            // System.out.println(nombreValido);

            while (!nombreValido) {

                System.out.println("Nombre ingresado incorrecto, intenta de nuevo");
                nombre = sc.nextLine();
                nombreValido = Validador.nombreValido(nombre);

            }
            // System.out.println("Bienvenido "+ nombre);

            // ========== HORA ===========

            // Pedir y validar hora
            System.out.println("Ingrese la hora deseada (8 - 17): ");

            int hora = sc.nextInt();
            sc.nextLine();
            boolean horaValida = Validador.horaValida(hora);

            // System.out.println("Hora: "+horaValida);

            while (!horaValida) {
                // System.out.println("Hora inválida (Fura de rango 8 - 17). Intente otra: ");
                hora = sc.nextInt();
                sc.nextLine();

                horaValida = Validador.horaValida(hora);

            }

            for (int i = 0; i < cantReservas; i++) {
                if (horas[i] == hora) {
                    System.out.println("Hora Ocupada, intente otra");
                    hora = sc.nextInt();
                    sc.nextLine();
                    horaValida = Validador.horaValida(hora);

                    while (!horaValida) {
                        // System.out.println("Hora inválida (Fura de rango 8 - 17). Intente otra: ");
                        hora = sc.nextInt();
                        sc.nextLine();

                        horaValida = Validador.horaValida(hora);

                    }

                    i = -1;
                }

            }
            // ========== SERVICIOS ===========

            System.out.println("Ingrese el servicio a tomar: ");
            System.out.println("""
                    1. Corte de Cabello
                    2. Tinte
                    3. Manicure""");

            int servicio = sc.nextInt();
            sc.nextLine();

            boolean servicioValidado = Validador.servicioValido(servicio);

            while (!servicioValidado) {

                System.out.println("Servicio incorrecto, elige nuevamente: ");
                System.out.println("""
                        1. Corte de Cabello
                        2. Tinte
                        3. Manicure""");
                servicio = sc.nextInt();
                sc.nextLine();
                servicioValidado = Validador.servicioValido(servicio);

            }

            nombres[cantReservas] = nombre;
            horas[cantReservas] = hora;
            servicios[cantReservas] = servicio;
            cantReservas++;

        } else {
            // Sin Cupo
            System.out.println("------------------------");
            System.out.println("No hay cupos disponibles");
            System.out.println("------------------------");
            return;
        }
    }

    public static void listar() {
        // imprimo reservas
        if (cantReservas == 0) {
            System.out.println("-------------------");
            System.out.println("Aún no hay reservas");
            System.out.println("-------------------");

        } else {

            for (int i = 0; i < cantReservas; i++) {
                String servicio = "";
                switch (servicios[i]) {
                    case 1 -> servicio = "CORTE";
                    case 2 -> servicio = "TINTE";
                    case 3 -> servicio = "MANICURE";

                }

                System.out.println(
                        i + 1 + ". Nombre: " + nombres[i] + " | Hora: " + horas[i] + "| Servicio: " + servicio);

            }

        }

    }

    public static void cancelar(Scanner sc){
        
        if (cantReservas == 0) {
            System.out.println("---------------------------------");
            System.out.println("Aún no hay reservas para cancelar");
            System.out.println("---------------------------------");

        }else{
            System.out.println("Ingrese la reserva a eliminar: ");
            int reserva = sc.nextInt();
            sc.nextLine();

            if(reserva <= cantReservas){


            }
        }
    }

}
