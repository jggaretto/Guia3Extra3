
package entidades;


public class Producto {
    private String descripcion;
    private double precioLista;
    private int stock;
    private String tipo;

    public Producto(String descripcion, double precioLista, int stock, String tipo) {
        this.descripcion = descripcion;
        this.precioLista = precioLista;
        this.stock = stock;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public int getStock() {
        return stock;
    }

    public String getTipo() {
        return tipo;
    }

    public double calcularPrecioPublico() {
        if (tipo.equals("Lácteo")) {
            return precioLista * 1.25;
        } else if (tipo.equals("Limpieza")) {
            return precioLista * 1.35;
        } else {
            return precioLista * 1.45;
        }
    }
}
