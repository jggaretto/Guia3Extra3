package Negocio;
import entidades.Cliente;
import entidades.Producto;
import entidades.Vendedor;

public class Venta {
    private Cliente cliente;
    private Vendedor vendedor;
    private Producto[] productos;

    public Venta(Cliente cliente, Vendedor vendedor, Producto[] productos) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.productos = productos;
    }

    public double calcularTotal() {
        double subtotal = 0;
        for (Producto p : productos) {
            subtotal += p.calcularPrecioPublico();
        }
        double descuento = 0;
        if (cliente.getCiudad().equals("San Luis")) {
            descuento = subtotal * 0.1;
        } else {
            descuento = subtotal * 0.15;
        }
        return subtotal - descuento;
    }
}
