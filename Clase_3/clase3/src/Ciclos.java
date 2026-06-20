public class Ciclos {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Plata #"+i);
        }

        int vueltas = 51;

        while (vueltas > 0 ) {
            System.out.println("Faltan "+ vueltas + " para finalizar la carrera!");
            vueltas -=1;
        }
    }
}
