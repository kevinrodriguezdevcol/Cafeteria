/**
 * CLASE Producto
 * --------------------------------------------------------------
 * Representa un producto genérico de la cafetería y es la CLASE PADRE
 * de la que heredarán "Bebida" y "Comida". Además, IMPLEMENTA la
 * interfaz Descontable (implements), por lo que está obligada a
 * escribir el metodo.
 */
public class Producto implements Descontable {

    // --- ATRIBUTOS
    private String nombre;
    private double precio;
    private String categoria;

    // --- CONSTRUCTOR
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }
        this.categoria = categoria;
    }

    // --- GETTERS
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    // --- SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto: ");
        sb.append("Nombre = ").append(nombre);
        sb.append(", Precio = ").append(String.format("%.2f", precio)).append(" €");
        sb.append(", Categoría = ").append(categoria);
        return sb.toString();
    }

    /**
     * IMPLEMENTACIÓN de la interfaz Descontable.
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}