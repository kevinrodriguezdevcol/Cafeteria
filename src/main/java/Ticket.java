package main.java;

/**
 * CLASE main.java.Ticket
 * --------------------
 * Representa una venta.
 */
public class Ticket {

    private static final int MAX_PRODUCTOS = 20;

    // --- ATRIBUTOS
    private Cliente cliente;
    private Camarero camarero;
    private Producto[] productos;
    private int contadorProductos;

    // --- CONSTRUCTOR
    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[MAX_PRODUCTOS]; // se reserva el array
        this.contadorProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (producto == null) {
            System.out.println("Aviso: no se puede añadir un producto vacío.");
            return;
        }
        if (contadorProductos >= MAX_PRODUCTOS) {
            System.out.println("Aviso: el ticket está lleno.");
            return;
        }
        productos[contadorProductos] = producto;
        contadorProductos++;
    }

    /**
     * Aquí calculo el total con un bucle for
     * */
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total = total + productos[i].getPrecio();
        }
        return total;
    }

    /**
     * Aquí muestro el ticket
     */
    public void mostrarTicket() {
        System.out.println("===============================");
        System.out.println("     CAFETERÍA MI COLOMBIA");
        System.out.println("===============================");

        System.out.println(cliente);
        System.out.println(camarero);

        System.out.println("-------------------------------");
        System.out.println("Productos:");

        for (int i = 0; i < contadorProductos; i++) {
            System.out.println((i + 1) + ". " + productos[i]);
        }

        System.out.println("-------------------------------");
        System.out.println("Total: " + String.format("%.2f", calcularTotal()) + " €");
        System.out.println("===============================");
    }

    // --- GETTERS
    public Cliente getCliente() {
        return cliente;
    }

    public Camarero getCamarero() {
        return camarero;
    }

    public int getContadorProductos() {
        return contadorProductos;
    }
}