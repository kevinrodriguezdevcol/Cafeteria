/**
 * CLASE Main
 * --------------------------------------------------------------
 * Pasos que debemos seguir:
 *
 *  1. Crear al menos un cliente.
 *  2. Crear al menos un camarero.
 *  3. Crear varios productos (incluyendo objetos de las clases hijas).
 *  4. Crear un ticket.
 *  5. Añadir productos al ticket.
 *  6. Mostrar el ticket completo por pantalla.
 *  7. Calcular y mostrar el total.
 *  8. Aplicar al menos un descuento usando la interfaz Descontable.
 */
public class Main {

    public static void main(String[] args) {

        // 1) Creamos un CLIENTE.
        Cliente cliente = new Cliente("Kevin Rodríguez", "633147042");

        // 2) Creamos un CAMARERO.
        Camarero camarero = new Camarero("José", "CLL05");

        // 3) Creamos varios PRODUCTOS.
        //    Aquí la idea es usar Bebida y Comida. Así pues se usa la herencia.
        Bebida cafe = new Bebida("Café", 1.80, "Cafés", "mediano");
        Comida bocadillo = new Comida("Bocadillo", 3.50, "Comidas", true);
        Bebida zumo = new Bebida("Zumo", 2.20, "Zumos", "grande");

        // 4) Creamos el TICKET (composición: le pasamos cliente y camarero / aunque no me quedó claro el tema composición y agregación).
        Ticket ticket = new Ticket(cliente, camarero);

        // 5) Añadimos los productos al ticket.
        ticket.agregarProducto(cafe);
        ticket.agregarProducto(bocadillo);
        ticket.agregarProducto(zumo);

        // 6) y 7) Mostramos el ticket completo (incluye ya el total calculado).
        ticket.mostrarTicket();

        // 8) Aplicamos un DESCUENTO usando la interfaz Descontable.
        //    aplicarDescuento() devuelve el precio final ya rebajado.
        double porcentaje = 10;
        double precioFinalCafe = cafe.aplicarDescuento(porcentaje);

        System.out.println("Descuento aplicado al café: "
                + String.format("%.0f", porcentaje) + "%");
        System.out.println("Precio final del café: "
                + String.format("%.2f", precioFinalCafe) + " €");
    }
}