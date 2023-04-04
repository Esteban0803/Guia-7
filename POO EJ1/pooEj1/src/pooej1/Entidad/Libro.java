package pooej1.Entidad;

public class Libro {

    public int isbn;
    public String titulo;
    public String autor;
    public int numPags;
    public Libro() {
    }
    public Libro(int isbn, String titulo, String autor, int numPags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }
}
