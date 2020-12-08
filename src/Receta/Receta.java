
package Receta;

import Producto.DetalleProducto;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Guerrero
 */
public class Receta {
    private String nomReceta;
    private ArrayList<DetalleProducto> ingredientes = new ArrayList<DetalleProducto>();

    public Receta(String nomReceta) {
        this.nomReceta = nomReceta;       
        
    }
    public String getNomReceta() {
        return nomReceta;
    }
    public void setNomReceta(String nomReceta) {
        this.nomReceta = nomReceta;
    }
    public ArrayList<DetalleProducto> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(ArrayList<DetalleProducto> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
}
