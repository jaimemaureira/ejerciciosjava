
package Ateneo;

/**
 *
 * @author Jaime
 * v 1.0 */
public class Libro {
    
    private String Isbn, titulo, autor;
    private int precio;

    public Libro() {
    }

    public Libro(String idIsbn, String titulo, String autor, int precio) {
        this.Isbn = idIsbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getIdIsbn() {
        return Isbn;
    }

    public void setIdIsbn(String idIsbn) {
        this.Isbn = idIsbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "Isbn=" + Isbn + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + '}';
    }
    
    
    
}
