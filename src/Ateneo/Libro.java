
package Ateneo;

/**
 *
 * @author Jaime
 * v 1.0 */
public class Libro {
    
    private String isbn, titulo, autor;
    private int precio;

    public Libro() {
    }

    public Libro(String idIsbn, String titulo, String autor, int precio) {
        this.isbn = idIsbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getIdIsbn() {
        return isbn;
    }

    public void setIdIsbn(String idIsbn) {
        this.isbn = idIsbn;
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
        return "Catalogo{" + "Isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + '}';
    }
    
    // metodos custom
    
    public double calcularIVA (){
        
        double IVA = 0.19;
        
        return this.precio * IVA;
        
    }
    
    public double totalPrecioIVA(){
        
        double total =  1.19;
        
        return this.precio * total;
    }
    
  
}
