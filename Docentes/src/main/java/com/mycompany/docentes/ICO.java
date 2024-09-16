/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docentes;

/**
 *
 * @author SANTIAGO CARDOZO
 */
class ICO extends Docentes{
    private int sueldo;
    private int trabajo;
    private int extra;
    private int hora;
    private int totalico;
    public ICO(String nombre, String Facu, String Cadi, int sueldo, int trabajo) {
        super(nombre, Facu, Cadi);
        this.sueldo = sueldo;
        this.trabajo = trabajo;
    }
    public void EstaIco(){
        System.out.println("Su sueldo es de: " + sueldo);
        System.out.println("Usted realizo  " + trabajo + " trabajos de grado" );
        hora = (sueldo /30) / 8;
        extra = (hora * 2) * trabajo ;
        totalico =  (sueldo + extra);
    }
    public int getTotalico() {
        return totalico;
    }
}
