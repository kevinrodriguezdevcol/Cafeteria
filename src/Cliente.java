/**
 * CLASE Client
 * --------------------------------------------------------------
 * Representa al cliente de la cafetería.
 */
public class Cliente {

    // --- ATRIBUTOS
    private String nombre;
    private String telefono;

    // --- CONSTRUCTOR
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // --- GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " - Teléfono: " + telefono;
    }
}