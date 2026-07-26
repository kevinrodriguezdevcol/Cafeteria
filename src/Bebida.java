/**
 * CLASE Bebida
 * ---------------------------------------------------
 * Clase HIJA de Producto ("extends Producto"). Pasa a heredar lo del padre
 * y añade su atributo propio: tamaño "tamanio".
 */
public class Bebida extends Producto {

    // Atributo PROPIO
    private String tamanio;

    // CONSTRUCTOR: super(...) reutiliza el constructor de Producto.
    public Bebida(String nombre, double precio, String categoria, String tamanio) {
        super(nombre, precio, categoria);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamaño = " + tamanio + " (Bebida)";
    }
}