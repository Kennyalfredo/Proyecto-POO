
package Cliente;

/**
 *
 * @author Emanuel Guerrero
 */
public class Fresh extends Cliente{
    private String eleccion;

    public Fresh(String eleccion, String cedula, String nombre, String apellido, String telefono, String correo, String direccion, String fechaIni, int diasSuscripcion) {
        super(cedula, nombre, apellido, telefono, correo, direccion, fechaIni,diasSuscripcion);
        this.eleccion = eleccion;
    }
    public String isEleccion() {
        return eleccion;
    }
    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
    }
    
    
    
}
