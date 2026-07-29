package main.java;

/**
 * CLASE main.java.Camarero
 * -----------------------
 * Representa al empleado que atiende el ticket.
 */
public class Camarero {

    // --- ATRIBUTOS
    private String nombre;
    private String codigoEmpleado;

    // --- CONSTRUCTOR
    public Camarero(String nombre, String codigoEmpleado) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    // --- GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public String toString() {
        return "main.java.Camarero: " + nombre + " - Código: " + codigoEmpleado;
    }
}