/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

/**
 *
 * @author Mikel
 */
public class Persona {
    
    private String Dni;
    private String Nombre;
    private String Apel1;
    private String Apel2;
    private String Telefono;

    public Persona() {
    }

    public Persona(String Dni, String Nombre, String Apel1, String Apel2, String Telefono) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.Apel1 = Apel1;
        this.Apel2 = Apel2;
        this.Telefono = Telefono;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApel1() {
        return Apel1;
    }

    public void setApel1(String Apel1) {
        this.Apel1 = Apel1;
    }

    public String getApel2() {
        return Apel2;
    }

    public void setApel2(String Apel2) {
        this.Apel2 = Apel2;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}
