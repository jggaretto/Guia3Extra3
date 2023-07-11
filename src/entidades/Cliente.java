
package entidades;

public class Cliente {
    private String nombre;
    private String ciudad;

    public Cliente(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
}
