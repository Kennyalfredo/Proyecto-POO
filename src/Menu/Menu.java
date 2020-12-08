
package Menu;

import Receta.Receta;


/**
 *
 * @author Emanuel Guerrero
 */
public class Menu {
    private Receta desayuno;
    private Receta almuerzo;
    private Receta cena;

    public Menu(Receta desayuno, Receta almuerzo, Receta cena) {
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.cena = cena;
    }
    public Receta getDesayuno() {
        return desayuno;
    }
    public void setDesayuno(Receta desayuno) {
        this.desayuno = desayuno;
    }
    public Receta getAlmuerzo() {
        return almuerzo;
    }
    public void setAlmuerzo(Receta almuerzo) {
        this.almuerzo = almuerzo;
    }
    public Receta getCena() {
        return cena;
    }
    public void setCena(Receta cena) {
        this.cena = cena;
    }
    
    
}
