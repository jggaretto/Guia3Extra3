/*
En un nuevo proyecto, nos piden modelar e implementar lo siguiente:
Definir un paquete de nombre “entidades” con las clases: Cliente, Producto y Vendedor. En otro
paquete de nombre “Negocio” tendremos la clase Venta que posee como atributos: un Cliente, el
Vendedor y 3 Productos, además de un método calcularTotal que sumará los precios públicos de
los productos y hará un descuento de acuerdo a la ciudad en donde vive el Cliente: si es de San
Luis, posee un descuento del 10% y si es de otra provincia un 15% de descuento. Los Productos
tienen como atributos: descripción, precio de lista, stock y tipo de producto; además de un método
especial calcularPrecioPublico que retornará el precio de lista más un 25% si el producto es de
tipo “Lácteo”, un 35% si el producto es de tipo “Limpieza” y un 45% para cualquier otro tipo de
producto.

Desde el método main de una clase TestComercio se pide:
a) Crear 3 Productos.
b) Crear un Cliente y un Vendedor.
c) Crear una Venta del Vendedor creado en el punto b para el Cliente creado en el punto b y
con los 3 productos del punto a.
d) Solicitar a la Venta que informe el total.
 */
package guia3extra3;

import Negocio.Venta;
import entidades.Cliente;
import entidades.Producto;
import entidades.Vendedor;


public class Guia3Extra3 {
   
    public static void main(String[] args) {
     
         // Crear 3 Productos
        Producto producto1 = new Producto("Leche", 50.0, 100, "Lácteo");
        Producto producto2 = new Producto("Jabón", 20.0, 200, "Limpieza");
        Producto producto3 = new Producto("Arroz", 70.0, 50, "Alimento");
        
        // Crear un Cliente y un Vendedor
        Cliente cliente = new Cliente("Juan", "San Luis");
        Vendedor vendedor = new Vendedor("María");
        
        // Crear una Venta del Vendedor creado para el Cliente creado con los 3 productos creados anteriormente
        Producto[] productosVenta = {producto1, producto2, producto3};
        Venta venta = new Venta(cliente, vendedor, productosVenta);
        
        /* Solicitar a la Venta que informe el total, de forma simple:
        double total = venta.calcularTotal();
        System.out.println("El total de la venta es: $" + total);
*/   
        //Informe más detallista:
        double subtotal = 0;
        System.out.println("**INFORME**");
        for (Producto p : productosVenta) {
            subtotal += p.calcularPrecioPublico();
            System.out.println(p.getDescripcion() + " - $" + p.calcularPrecioPublico());
        }
        double descuento = venta.calcularTotal() - subtotal;
        double total = venta.calcularTotal();
        System.out.println("----------------------------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total: $" + total);
    }
}
