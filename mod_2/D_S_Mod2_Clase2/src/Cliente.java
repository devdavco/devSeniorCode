//herencia usamos extends para traer atributos y métodos de la clase padre
public class Cliente extends Usuario {

    private int puntos;

    public Cliente(String nombre, String email, int puntos) {
        super(nombre, email);
        this.puntos = puntos;

    }

}
