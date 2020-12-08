
package Producto;

/**
 *
 * @author Emanuel Guerrero
 */
public class Producto {
    private String nombre;
    private int calorias;
    private double carbohidratos;
    private double proteinas;
    private double grasas;
    private double fibras;
   

    public Producto() {
    }
    public Producto(String nombre, int calorias, double carbohidratos, double proteinas, double grasas, double fibras) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.carbohidratos = carbohidratos;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.fibras = fibras;
        
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCalorias() {
        return calorias;
    }
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    public double getCarbohidratos() {
        return carbohidratos;
    }
    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }
    public double getProteinas() {
        return proteinas;
    }
    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }
    public double getGrasas() {
        return grasas;
    }
    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }
    public double getFibras() {
        return fibras;
    }
    public void setFibras(double fibras) {
        this.fibras = fibras;
    }

    }   
    

