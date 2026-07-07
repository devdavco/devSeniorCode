public class Libro {

    String titulo;
    String autor;
    int paginas;

    //Vacio
    public Libro() {
    }
    //Llenito
    Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor  = autor;
        this. paginas = paginas;
    }
    //Medio lleno
    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor  = autor;
    }
    String descripcion(){

        return titulo + " de " + autor + " con " + paginas + " paginas";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
