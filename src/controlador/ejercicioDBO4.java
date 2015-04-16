/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import vista.*;
import javax.swing.JOptionPane;
import uml.Acontecimiento;
import bd.ControladorBD;
import exc.*;




/**
 *
 * @author Mikel
 */

public class ejercicioDBO4 {
    
private static VentanaPrincipal VPrincipal;
private static VentanaAltaEvent VAltaEvent;
private static VentanaModEvent VModEvent;
private static VentanaAltaPerson VAltaAsis;
private static VentanaEmpresa VAltaEmp;
private static VentanaList VList;
private static Calendar c;
private static String NombreSM;



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Sig_VPrincipal();   
        
    }
    
    private static void Sig_VPrincipal(){
        VPrincipal = new VentanaPrincipal();
        VPrincipal.setVisible(true);
    }

    //Alta Eventos
    public static void Sig_VAltaEVT(){
        VPrincipal.setVisible(false);
        VAltaEvent = new VentanaAltaEvent();
        VAltaEvent.setVisible(true);
        
    }
    public static void EventoAlta(String Nombre, String Lugar, String Fecha, String HoraI, String HoraF, int Aforo) throws Exception{   
       Acontecimiento Acont = new Acontecimiento();
       
       //Nombre
       Acont.setNombre(Nombre.toLowerCase());
       
       //Lugar
       Acont.setLugar(Lugar);
       
       //Fecha
       //Convertir Fecha a Calendar
            c = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(Fecha);
            c.setTime(date);
       Acont.setFecha(c);
       
       //HoraI
       //Convertir HoraI a Calendar
            c = Calendar.getInstance();
            sdf = new SimpleDateFormat("kk:mm:ss");
            date = sdf.parse(HoraI);
            c.setTime(date); 
       Acont.setHoraI(c);
       
       //HoraF
       //Convertir HoraF a Calendar
            c = Calendar.getInstance();
            sdf = new SimpleDateFormat("kk:mm:ss");
            date = sdf.parse(HoraF);
            c.setTime(date);
       Acont.setHoraF(c);
       
       //Aforo      
       Acont.setAforo(Aforo);
       
       ControladorBD.AltaEvento(Acont);
             
    }
    public static void VAltaEVT_Ant(){
        VAltaEvent.dispose();
        VPrincipal.setVisible(true);
    } 
    
    //Baja Eventos
    public static void BajaEvento(){
        boolean dok = true; 
        try{
        String NombreEvent = JOptionPane.showInputDialog(VPrincipal,"Escriba el nombre del evento que desea dar de baja:").toLowerCase();
        
        if(JOptionPane.showConfirmDialog(VPrincipal,"Desea dar de baja este evento:\n"
                +ControladorBD.BuscarEventoBJ(NombreEvent))==0){
            ControladorBD.EventoBaja(NombreEvent);
        }else{
            dok = false;
        }
        
        }catch(NullPointerException Ex){dok=false;
        }catch(DatoErroneo Ex){JOptionPane.showMessageDialog(VPrincipal,"Error:\nEl evento introducido no existe."); dok = false;
        }catch(Exception Ex){JOptionPane.showMessageDialog(VPrincipal, "Error:\n"+Ex.getMessage()); dok=false;}
        
        if(dok==true){
            JOptionPane.showMessageDialog(VPrincipal,"Evento dado de baja.");
        }
        
    }
    
    //Modificacio Eventos
    public static void Sig_VModEVT(){        
        boolean dok = true;
        Acontecimiento Acont;
        try{
        String nombre = JOptionPane.showInputDialog(VPrincipal,"Introduzca el nombre del evento que desea modificar:").toLowerCase();
        NombreSM = nombre;
        Acont = ControladorBD.BuscarEventoMod(nombre);
        if(dok==true){
            //Nombre
            String Nombre = Acont.getNombre();
            //Lugar
            String Lugar = Acont.getLugar();
            //Fecha
            c = Calendar.getInstance();
            c = Acont.getFecha();           
            Date date = c.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String Fecha = sdf.format(date);
            //HoraI
            c = Calendar.getInstance();
            c = Acont.getHoraI();
            date = c.getTime();
            sdf = new SimpleDateFormat("kk:mm:ss");
            String HoraI = sdf.format(date);
            //HoraF
            c = Calendar.getInstance();
            c = Acont.getHoraF();
            date = c.getTime();
            sdf = new SimpleDateFormat("kk:mm:ss");
            String HoraF = sdf.format(date);
            //Aforo
            String Aforo = Integer.toString(Acont.getAforo());
            
            VPrincipal.setVisible(false);
            VModEvent = new VentanaModEvent(Nombre,Lugar,Fecha,HoraI,HoraF,Aforo);
            VModEvent.setVisible(true);}
        
        }catch(NullPointerException Ex){dok = false;
        }catch(DatoErroneo Ex){JOptionPane.showMessageDialog(VPrincipal,"Error:\nEl evento introducido no existe.");dok = false;
        }catch(Exception Ex){JOptionPane.showMessageDialog(VPrincipal, "Error:\n"+Ex.getMessage());dok = false;}
                     
    }
    public static void EventoMod(String Nombre,String Lugar, String Fecha, String HoraI, String HoraF, int Aforo)throws Exception{
         Acontecimiento Acont = new Acontecimiento();
       
       //Nombre
       Acont.setNombre(Nombre);
       
       //Lugar
       Acont.setLugar(Lugar);
       
       //Fecha
       //Convertir Fecha a Calendar
            c= Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(Fecha);
            c.setTime(date);
       Acont.setFecha(c);
       
       //HoraI
       //Convertir HoraI a Calendar
            c = Calendar.getInstance();
            sdf = new SimpleDateFormat("kk:mm:ss");
            date = sdf.parse(HoraI);
            c.setTime(date); 
       Acont.setHoraI(c);
       
       //HoraF
        //Convertir HoraF a Calendar
            c = Calendar.getInstance();
            sdf = new SimpleDateFormat("kk:mm:ss");
            date = sdf.parse(HoraF);
            c.setTime(date);
       Acont.setHoraF(c);
       
       //Aforo
       Acont.setAforo(Aforo);
       
       ControladorBD.EventoMod(Acont, NombreSM);
    }
    public static void VModEVT_Ant(){
        VModEvent.dispose();
        VPrincipal.setVisible(true);
    }
    
    //Alta Asistentes
    public static void Sig_VAltaASIS(){
    try{
        VPrincipal.setVisible(false);
       
        VAltaAsis = new VentanaAltaPerson();
        VAltaAsis.setVisible(true);
    }catch(Exception Ex){JOptionPane.showMessageDialog(null,"Error:\n"+Ex.getMessage()); VPrincipal.setVisible(true);}
    }
    public static void VAltaASIS_Ant(){
        VAltaAsis.dispose();
        VPrincipal.setVisible(true);
    }
    //Listado
    public static void GenerarListado(boolean ListaB)throws Exception{
        String lista="";
        if(ListaB==true){
          lista = ControladorBD.ListadoEvent();
           
        }else{
            
        }
        VList = new VentanaList(lista);
        VList.setVisible(true);
        
    }
    public static void VList_Ant(){
        VList.dispose();
    }
    
    //Empresa Alta
    public static void Sig_VAltaEmp(){
        VAltaAsis.setVisible(false);
        VAltaEmp = new VentanaEmpresa();
        VAltaEmp.setVisible(true);
    }
    
    public static void VAltaEmp_Ant(){
        VAltaEmp.dispose();
        VAltaAsis.setVisible(true);
    }
   
    public static void Salir(){
        System.exit(0);
    }
}
