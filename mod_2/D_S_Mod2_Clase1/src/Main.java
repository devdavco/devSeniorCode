

void main() {

//    Perro perro = new Perro();
//
//    perro.nombre = "Juana";
//    perro.raza = "Criollo";
//    perro.ladrar();


    Libro libro = new Libro();

    libro.autor = "David Corrales";
    libro.paginas = 6;
    libro.titulo = "Un mundo mágico";

    Libro libro2 = new Libro("Cien años", "Juan", 23);


    System.out.println(libro2.descripcion()+ " Libro 2");

    System.out.println(libro.descripcion());
}