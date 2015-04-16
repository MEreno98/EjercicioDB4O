/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

import java.util.Calendar;


/**
 *
 * @author Mikel
 */
public class Acontecimiento {
    
    private String Nombre;
    private String Lugar;
    private Calendar Fecha;
    private Calendar HoraI;
    private Calendar HoraF;
    private int Aforo;

    public Acontecimiento() {
    }

    public Acontecimiento(String Nombre, String Lugar, Calendar Fecha, Calendar HoraI, Calendar HoraF, int Aforo) {
        this.Nombre = Nombre;
        this.Lugar = Lugar;
        this.Fecha = Fecha;
        this.HoraI = HoraI;
        this.HoraF = HoraF;
        this.Aforo = Aforo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public Calendar getFecha() {
        return Fecha;
    }

    public void setFecha(Calendar Fecha) {
        this.Fecha = Fecha;
    }

    public Calendar getHoraI() {
        return HoraI;
    }

    public void setHoraI(Calendar HoraI) {
        this.HoraI = HoraI;
    }

    public Calendar getHoraF() {
        return HoraF;
    }

    public void setHoraF(Calendar HoraF) {
        this.HoraF = HoraF;
    }

    public int getAforo() {
        return Aforo;
    }

    public void setAforo(int Aforo) {
        this.Aforo = Aforo;
    }

    
    
}
