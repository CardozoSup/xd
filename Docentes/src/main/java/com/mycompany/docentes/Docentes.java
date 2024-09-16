/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.docentes;

/**
 *
 * @author SANTIAGO CARDOZO
 */
public class Docentes {
protected String nombre;
protected String Facu;
protected String Cadi;
public Docentes(String nombre, String Facu, String Cadi){
    this.nombre = nombre;
    this.Facu = Facu;
    this.Cadi = Cadi;
}
    public void setNombre() {
    }
    public String getNombre() {
        return nombre;
    }

    public String getFacu() {
        return Facu;
    }

    public String getCadi() {
        return Cadi;
    }
}
