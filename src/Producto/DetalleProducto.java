
package Producto;

import Producto.Producto;

/**
 *
 * @author Emanuel Guerrero
 */
public class DetalleProducto {
    private Producto producto;
    private int cantidad;

    public DetalleProducto(int cantidad){         
        this.cantidad = cantidad;
    }    

    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    

}

