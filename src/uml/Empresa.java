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
public class Empresa {
    private String Nif;
    private String Nombre;
    private String RazonSocial;
    private int Cnae;

    public Empresa() {
    }

    public Empresa(String Nif, String Nombre, String RazonSocial, int Cnae) {
        this.Nif = Nif;
        this.Nombre = Nombre;
        this.RazonSocial = RazonSocial;
        this.Cnae = Cnae;
    }

    public String getNif() {
        return Nif;
    }

    public void setNif(String Nif) {
        this.Nif = Nif;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public int getCnae() {
        return Cnae;
    }

    public void setCnae(int Cnae) {
        this.Cnae = Cnae;
    }
    
    
}
