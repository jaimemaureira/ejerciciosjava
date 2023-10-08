
package Ateneo;

/**
 *
 * @author Jaime
 */
public class Catalogo {
    
    protected String idIsbn, titulo, autor;
    protected int precio;

    public Catalogo() {
    }

    public Catalogo(String idIsbn, String titulo, String autor, int precio) {
        this.idIsbn = idIsbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getIdIsbn() {
        return idIsbn;
    }

    public void setIdIsbn(String idIsbn) {
        this.idIsbn = idIsbn;
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
        return "Catalogo{" + "idIsbn=" + idIsbn + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + '}';
    }
    
    
    
}
