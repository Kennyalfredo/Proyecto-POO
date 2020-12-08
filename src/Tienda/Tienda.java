
package Tienda;
import Cliente.Cliente;
import Cliente.Fresh;
import Cliente.Suscripciones;
import Cliente.VIP;
import Menu.Dias;
import Menu.Menu;
import Producto.DetalleProducto;
import Producto.Producto;
import Receta.Receta;
import Receta.Recetario;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import com.csvreader.CsvWriter;

/**
 *
 * @author Emanuel Guerrero
 **/
public class Tienda {        
   public static void main(String[] args) {       
        System.out.println("Bienido a NUTRIFIT");
        System.out.println("Elija una de las siguites suscripciones:");   
        System.out.println("1. Registro de Cliente.");
        System.out.println("2. Registro de Receta.");  
        System.out.println("3. Consultar Suscripcion.");
        System.out.println("4. Creación Automática de Menú Semanal.");
        System.out.println("5. Envio de Menu a Cliente Por Correo Electronico.");
        System.out.println("6. Subir Productos.");
        System.out.println("7. Salir.");
        System.out.print("Digite su eleccion: ");
        Scanner sc = new Scanner (System.in);
        String eleccion = sc.nextLine();
        switch (eleccion){
            case "1":          
                RegistrarCliente();
                break;
            case "2":                
                crearReceta(CrearListProd());        
            case "3":
                //selecionarMenuDia();
        }            
    }
    public static void RegistrarCliente(){
       System.out.println("Elija el tipo de suscripcion:");
       System.out.print("VIP O FRESH:");
       Scanner sc2 = new Scanner (System.in);
       String eleccion = sc2.nextLine();
       Cliente c1;        
       if ((eleccion.toUpperCase()).equals("VIP")){
            System.out.println("Escriba su Cedula:");
            Scanner sc3 = new Scanner (System.in);
            String cedula = sc3.nextLine();
            while(isTel_Cel(cedula)== false){
                System.out.println("Escriba su Cedula:");
                Scanner sc = new Scanner (System.in);
                cedula = sc.nextLine();
            }
            System.out.println("Escriba su Nombre:");
            Scanner sc4 = new Scanner (System.in);
            String nombre = sc4.nextLine(); 
            while (isNombre(nombre) == false){
                System.out.println("Escriba su Nombre:");
                sc4 = new Scanner (System.in);
                nombre = sc4.nextLine();
            }
            System.out.println("Escriba su Apellido:");
            Scanner sc5 = new Scanner (System.in);
            String apellido = sc5.nextLine();
            while (isNombre(apellido) == false){
                System.out.println("Escriba su Nombre:");
                sc5 = new Scanner (System.in);
                apellido = sc5.nextLine();}
            System.out.println("Escriba su telefono:");
            Scanner sc6 = new Scanner (System.in);
            String te = sc6.nextLine();
            while(isTel_Cel(te)== false){
                System.out.println("Escriba su Cedula:");
                Scanner sc = new Scanner (System.in);
                te = sc.nextLine();}
            System.out.println("Escriba su correo:");
            Scanner sc7 = new Scanner (System.in);
            String correo = sc7.nextLine();
            while(isCorreo(correo)== false){
                System.out.println("Escriba su correo:");
                sc7 = new Scanner (System.in);
                correo = sc7.nextLine();
            }
            System.out.println("Escriba su direccion:");
            Scanner sc8 = new Scanner (System.in);
            String dirr = sc8.nextLine();
            System.out.println("Escriba la fecha de inicio de suscripcion(d-mes-año):");
            Scanner sc9 = new Scanner (System.in);
            String fechaini = sc9.nextLine();
            System.out.println("Escriba el numero de dias de suscripción:");
            Scanner sc10 = new Scanner (System.in);
            int suscrip = sc10.nextInt();
            System.out.println("Escriba su peso:");
            Scanner sc11 = new Scanner (System.in);
            double peso = sc11.nextInt();
            System.out.println("Escriba su estatura:");
            Scanner sc12 = new Scanner (System.in);
            double est = sc12.nextInt();
            System.out.println("Escriba su tiempo de entrenamiento:");
            Scanner sc13 = new Scanner (System.in);
            double entre = sc13.nextInt();
            System.out.println("Escriba su profesion:");
            Scanner sc14 = new Scanner (System.in);
            String prof = sc14.nextLine();
            c1 = new VIP(peso,est,entre, prof,cedula,nombre,apellido,te,correo,dirr,fechaini,suscrip);
       } 
       else if (eleccion.equals("FRESH")){
            System.out.println("Escriba su Cedula:");
            Scanner sc3 = new Scanner (System.in);
            String cedula = sc3.nextLine();
            while(isTel_Cel(cedula)== false){
                System.out.println("Escriba su Cedula:");
                Scanner sc = new Scanner (System.in);
                cedula = sc.nextLine();
            }
            System.out.println("Escriba su Nombre:");
            Scanner sc4 = new Scanner (System.in);
            String nombre = sc4.nextLine(); 
            while (isNombre(nombre) == false){
                System.out.println("Escriba su Nombre:");
                sc4 = new Scanner (System.in);
                nombre = sc4.nextLine();
            }
            System.out.println("Escriba su Apellido:");
            Scanner sc5 = new Scanner (System.in);
            String apellido = sc5.nextLine();
            while (isNombre(apellido) == false){
                System.out.println("Escriba su Nombre:");
                sc5 = new Scanner (System.in);
                apellido = sc5.nextLine();}
            System.out.println("Escriba su telefono:");
            Scanner sc6 = new Scanner (System.in);
            String te = sc6.nextLine();
            while(isTel_Cel(te)== false){
                System.out.println("Escriba su Cedula:");
                Scanner sc = new Scanner (System.in);
                te = sc.nextLine();}
            System.out.println("Escriba su correo:");
            Scanner sc7 = new Scanner (System.in);
            String correo = sc7.nextLine();
            while(isCorreo(correo) == false){
                System.out.println("Escriba su correo:");
                sc7 = new Scanner (System.in);
                correo = sc7.nextLine();
            }
            System.out.println("Escriba su direccion:");
            Scanner sc8 = new Scanner (System.in);
            String dirr = sc8.nextLine();
            System.out.println("Escriba la fecha de inicio de suscripcion(d-mes-año):");
            Scanner sc9 = new Scanner (System.in);
            String fechaini = sc9.nextLine();
            System.out.println("Escriba su el numero de dias de suscripción:");
            Scanner sc10 = new Scanner (System.in);
            int suscrip = sc10.nextInt();
            System.out.println("¿Desa que se le envie su orden por $30 adiconales?");
            Scanner sc11 = new Scanner (System.in);
            String elec = sc11.nextLine();
            c1 = new Fresh(elec,cedula,nombre,apellido,te,correo,dirr,fechaini,suscrip);
       }
   }
    
    public static void consultarSuscripcion(int diasSuscripcion, String fechaIni){       
    
    }
    //Hay que construir un arraylist de tipo menu
    public static Menu seleccionarMenuDia(Dias dias,Recetario recetario,String dia){
        ArrayList<Receta> recetasMenu = new ArrayList<Receta>();        
        while(recetasMenu.size()<3){
            for(String day:dias.dias){            
                if (day.equals(dia)){
                    for(Receta recipe:recetario.getRecetas()){
                        if (recetasMenu.contains(recipe)== false)
                            recetasMenu.add(recipe);
                            recetasMenu.remove(recetasMenu.indexOf(recipe));
                    } } } }         
        Menu menuDia = new Menu(recetasMenu.get(0),recetasMenu.get(1),recetasMenu.get(2));
        System.out.println("El desayuno del dias es: "+menuDia.getDesayuno());
        System.out.println("El almuerzo del dias es: "+menuDia.getAlmuerzo());
        System.out.println("La cena del dias es: "+menuDia.getCena());
        return menuDia;
        }    
    public static boolean isTel_Cel(String num){
        if (num.length()== 10){
            return true;
        }
        return false;
    }
    public static boolean isCorreo(String correo){
        if( (correo.indexOf('@') != -1) && (0<(correo.indexOf('@')))&& (correo.length()>(correo.indexOf('@')))){
            return true;
    }
        return false;   }     
    public static boolean isNombre(String nombre){
        try {
            Integer.parseInt(nombre);
            return false;
        }   
        catch (NumberFormatException nfe){
            return true; 
    }
    }
    public static ArrayList<Producto> CrearListProd(){
        String line="";
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        try{
        BufferedReader br = new BufferedReader(new FileReader("Ingredientes.csv"));
        br.readLine();
        while((line=br.readLine())!= null){          ;  
          Producto p1 = new Producto();
          String[] datosDeLinea= line.split(",");
          ArrayList<String> DatosTemporales=new ArrayList<String>();
          for(String dato: datosDeLinea){
            DatosTemporales.add(dato);
          }
          p1.setNombre(DatosTemporales.get(0));
          p1.setCalorias(Integer.parseInt(DatosTemporales.get(1)));
          p1.setCarbohidratos(Double.valueOf(DatosTemporales.get(2)));
          p1.setProteinas(Double.valueOf(DatosTemporales.get(3)));
          p1.setGrasas(Double.valueOf(DatosTemporales.get(4)));
          p1.setFibras(Double.valueOf(DatosTemporales.get(5)));
          listaProductos.add(p1);
        }
        br.close();
        } 
        catch(FileNotFoundException e){
          e.printStackTrace(); } 
        catch (IOException e){
          e.printStackTrace();}
        catch(NumberFormatException e){
          e.printStackTrace();
          }        
        return listaProductos;
        }
    public static Receta crearReceta(ArrayList<Producto> lista){ 
        ArrayList<DetalleProducto> ingredientes = new ArrayList<DetalleProducto>();
        System.out.print("Escriba el nombre de la receta a ingresar: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();     
        Receta rc1 = new Receta(name.toUpperCase());
        while(name.equals("cerrar")==false){            
            System.out.print("Escriba un ingrediente de la receta: ");             
            sc = new Scanner(System.in);
            name = sc.nextLine();
            if (name.equals("cerrar")){
                break;
            }
            System.out.print("Escriba la cantidad del producto: ");            
            Scanner cn = new Scanner(System.in);
            int cant = cn.nextInt();
            DetalleProducto dt = new DetalleProducto(cant);
            for(Producto pro:lista)
                if(pro.getNombre().equals(name.toUpperCase())){
                    dt.setProducto(pro);
                    ingredientes.add(dt);}                
            System.out.println("Para finalizar el ingreso de ingredientes escriba 'cerrar'.");         
               }
        rc1.setIngredientes(ingredientes);
        return rc1;       }
    public void CrearReceta(){
        
    
}
    
    
                }   
