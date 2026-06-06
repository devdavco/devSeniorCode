import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); // :)


        //Ingresando por Consola
        /*
        String nombre;
        int edad;
        char sexo;
        double salario;
        boolean activo;


         
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite nombre del estudiante: ");

        nombre = entrada.next();

        System.out.println("Ahora por favor ingresa tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Cual es tu salario deseado?: ");
        salario = entrada.nextDouble();

        System.out.println("Digite el sexo: "); 
        sexo = entrada.next().charAt(0); //Guarda el primer dígito de lo que ingrese el usuario

        System.out.println("¿Su estado es activo?\na 1- Sí \n 2- No");
        activo = entrada.nextBoolean();


        //Salida de datos consola (imprimo todo)
        System.out.println("Bienvenido "+ nombre + "\nEdad: "+ edad + "\nSalario Deseado: "+ salario + "\nSexo: " + sexo + "Esado: " + activo);


*/
        //Ahora por ventana emergente

        String nombre;
        int edad;
        char sexo;
        double salario;
        boolean estado;


        nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
        sexo = JOptionPane.showInputDialog("Sexo: ").charAt(0);
        salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Salario: "));
        estado = Boolean.parseBoolean(JOptionPane.showInputDialog("ACTIVO?: "));

        //Salida Datos

        JOptionPane.showMessageDialog(null,"Nombre: "+ nombre + "\nEdad:" + edad +"\nSexo:" + sexo + "\nSalario: " + salario + "\nEstado (True / False): " + estado );
    








    }
}
