
package Ateneo;

/**
 *
 * @author Jaime
 * v 1.0 */
public class Libro{
    
    private String isbn, titulo; 
    private Autor autor;
    private int precio;

    public Libro() {
    }

    public Libro(String idIsbn, String titulo, Autor autor, int precio) {
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
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
    
    public void imprimirInfoLibroOferta(){
        System.out.println("\t------Libros en oferta------\n");
        System.out.println("ISBN:\t\t\t" + " " + getIdIsbn());
        System.out.println("Titulo:\t\t\t" + " " + getTitulo());
        System.out.println("Autor:" + " " + getAutor());
        System.out.println("Precio:\t\t\t" + " " + getPrecio());
        System.out.println("El IVA es de:\t\t" + " " + this.calcularIVA());
        System.out.println("El precio Total es:\t" + " " + this.totalPrecioIVA() + "\n");
        }
}
