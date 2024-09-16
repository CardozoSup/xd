/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docentes;

/**
 *
 * @author SANTIAGO CARDOZO
 */
 class Catedra extends Docentes {
    private int horas;
    private int valor;
    private int totalca;
    public Catedra(String nombre, String Facu, String Cadi, int horas, int valor) {
        super(nombre, Facu, Cadi);
        this.horas = horas;
        this.valor = valor;
    }
    public void Estaca(){
        System.out.println("Trabajo  " + horas + " Horas ");
        System.out.println("Cada hora suya valen " + valor);
        totalca = (valor * horas);
    }
    public int getTotalca() {
        return totalca;
    }
}
