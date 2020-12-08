
package Receta;

import Receta.Receta;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Guerrero
 */
public class Recetario {
    private ArrayList<Receta> recetas;

    public Recetario( ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }
    
    
}
    