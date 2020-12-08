
package Cliente;

/**
 *
 * @author Emanuel Guerrero
 */
public class Cliente {
    protected String cedula; 
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String correo;
    protected String direccion;
    protected String fechaIni;
    protected int diasSuscripcion;

    public Cliente(String cedula, String nombre, String apellido, String telefono, String correo, String direccion, String fechaIni, int diasSuscripcion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fechaIni = fechaIni;
        this.diasSuscripcion = diasSuscripcion;
    }          
}
