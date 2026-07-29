package main.java;

/**
 * CLASE main.java.Comida
 * --------------------------------------------------------------
 * Segunda clase HIJA de main.java.Producto ("extends main.java.Producto"). Añade su atributo
 * propio: "esCaliente".
 */
public class Comida extends Producto {

    // Atributo PROPIO
    private boolean esCaliente;

    // CONSTRUCTOR.
    public Comida(String nombre, double precio, String categoria, boolean esCaliente) {
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    public boolean isEsCaliente() {
        return esCaliente;
    }

    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    @Override
    public String toString() {
        String estado;
        if (esCaliente) {
            estado = "caliente";
        } else {
            estado = "frío";
        }
        return super.toString() + ", Estado = " + estado + " (main.java.Comida)";
    }
}