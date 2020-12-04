/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author kenny
 */
public class Cliente {
    int cedula;
    String nombre;
    String apellido;
    int telefono;
    String correo;
    String direccion;
    int FechaIni;
    String tipo;
    public void ValidarInfo(){}
    public int CalcularFechaFin(int FechaIni){}
    public Cliente(){
        this.tipo=tipo;
    }
    public boolean CorreoElectronico(){}

}


class Fresh extends Cliente{
    boolean eleccion;
    Fresh(boolean eleccion){
        this.eleccion=eleccion;
    }
}

class Vip extends Cliente{
   double peso;
   double estatura;
   int ejercicioSemanal;
   String profesion;
   public int CalcularIMC(double peso, double estatura){
       
   
    
}

}