import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;

        while (opcion != 5) {
            Menu.mostrar();
            opcion = Menu.leerOpcion(sc);
            // boolean horaValida,nombreValido,servicioValido;
            
            switch (opcion) {
                case 1:
                
                    Operaciones.agendar(sc);

                    break;
                case 2:
                    // System.out.println(opcion);
                    Operaciones.listar();
                    break;
                case 3:

                    Operaciones.cancelar(sc);
                    break;
                case 4:
                    System.out.println(opcion);
                    //Operaciones.verValorTotal();
                    break;
                case 5:
                    System.out.println(opcion);
                    System.out.println("Gracias por usar el gestor. Hasta pronto.");
                    break;
                default:
                    System.out.println("Opcion no valida. Elige entre 1 y 5.");
            }
        }
        sc.close();
    }
}