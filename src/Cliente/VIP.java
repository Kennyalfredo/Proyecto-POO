package Cliente;
public class VIP extends Cliente {
    private double peso;
    private double estatura;
    private double tiempoEntrenamiento;
    private String profesion;

    public VIP(double peso, double estatura, double tiempoEntrenamiento, String profesion,String cedula, String nombre, String apellido, String telefono, String correo, String direccion, String fechaIni, int diasSuscripcion) {
        super(cedula, nombre, apellido, telefono, correo, direccion, fechaIni, diasSuscripcion);
        this.peso = peso;
        this.estatura = estatura;
        this.tiempoEntrenamiento = tiempoEntrenamiento;
        this.profesion = profesion;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public double getTiempoEntrenamiento() {
        return tiempoEntrenamiento;
    }
    public void setTiempoEntrenamiento(double tiempoEntrenamiento) {
        this.tiempoEntrenamiento = tiempoEntrenamiento;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
   
    
    
    
}
