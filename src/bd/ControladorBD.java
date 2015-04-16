/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
import com.db4o.*;
import uml.Acontecimiento;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import exc.DatoErroneo;
        
/**
 *
 * @author Mikel
 */

public class ControladorBD {

private static ObjectContainer db;
    
    //Alta Evento
    public static void AltaEvento(Acontecimiento Acont) {
        //Abrir conexion
        db=Db4o.openFile("EjercicioDB4O"); 
   
        //Añadir
        db.store(Acont);
    
        //Cerrar Conexion
        db.close(); 
    }
    
    //Baja Evento
    public static String BuscarEventoBJ (String Nombre) throws Exception{
       String EventoB = " ";
  
       db=Db4o.openFile("EjercicioDB4O"); 
       
       Acontecimiento Proto = new Acontecimiento();
       Proto.setNombre(Nombre);
       ObjectSet Resultado= db.queryByExample(Proto);
        if(Resultado.isEmpty()){
            db.close();
            throw new DatoErroneo();}
       
       while(Resultado.hasNext()){
           Acontecimiento objeto = (Acontecimiento) Resultado.next();
           
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = objeto.getFecha().getTime();
           String Fecha = sdf.format(date);
           
           sdf = new SimpleDateFormat("kk:mm:ss");
           date = objeto.getHoraI().getTime();
           String HoraI = sdf.format(date);
           
           date = objeto.getHoraF().getTime();
           String HoraF = sdf.format(date);
           
           EventoB = " Nombre: "+objeto.getNombre()+"\n Lugar: "+objeto.getLugar()+"\n Fecha: "+Fecha+"\n Hora Inicio: "+HoraI
                   +"\n Hora Fin: "+HoraF+"\n Aforo: "+objeto.getAforo(); 
       }
       db.close();
       return EventoB;
    }
    public static void EventoBaja(String nombre) throws Exception {
        Acontecimiento Proto = new Acontecimiento();
        Proto.setNombre(nombre);
        
        db=Db4o.openFile("EjercicioDB4O"); 
       
        ObjectSet result=db.queryByExample(Proto);

        Acontecimiento found=(Acontecimiento)result.next();
        
        db.delete(found);
        db.close();
    }
            
}
