/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.docentes;
import java.util.Scanner;
/**
 *
 * @author SANTIAGO CARDOZO
 */
public class main {
    public static void main(String[] args) {
        Scanner oji = new Scanner(System.in);
        System.out.println("Bienvenidos a nuestra calculadora de sueldos");
        System.out.println("Ingrese cuantos docentes de catedra son");
        int num = oji.nextInt();
        for(int i = 0; i < num; i++){
            System.out.println("Ingrese el nombre del docente");
            String nombre = oji.next();
            System.out.println("Ingrese la facultad a la que pertenece");
            String Facu = oji.next();
            System.out.println("Ingrese a que cadi pertenece");
            String Cadi = oji.next();
            System.out.println("Para docente " + (i + 1));
            System.out.println("Ingrese la cantidad de horas trabajadas ");
            int horas = oji.nextInt();
            System.out.println("Ingrese el valor de cada una de ellas ");
            int valor = oji.nextInt();
            Catedra cat = new Catedra(nombre, Facu, Cadi, horas, valor);
            cat.Estaca();
            System.out.println("El sueldo para el doncente : " + cat.getNombre() + " De la facultad de " +  cat.getFacu() + " Perteneciente al cadi " +  cat.getCadi() + " Es de: " + cat.getTotalca());
        }
        System.out.println("ingrese cuentos docentes de tiempo completo son");
        int num2 = oji.nextInt();
        for(int i = 0; i < num2; i++){
            System.out.println("Ingrese el nombre del docente");
            String nombre = oji.next();
            System.out.println("Ingrese la facultad a la que pertenece");
            String Facu = oji.next();
            System.out.println("Ingrese a que cadi pertenece");
            String Cadi = oji.next();
            System.out.println("Para docente " + (i + 1));
            System.out.println("Ingrese su sueldo mensual");
            int sueldo = oji.nextInt();
            System.out.println("Ingrese cuantos trabajos de grado realizo");
            int trabajo = oji.nextInt();
            ICO Ico = new ICO(nombre, Facu, Cadi, sueldo, trabajo);
            Ico.EstaIco();
            System.out.println("El sueldo para el docente : " + Ico.getNombre() + " De la facultad de " + Ico.getFacu() + " Perteneciente al cadi " + Ico.getCadi() + " Es de: " + Ico.getTotalico());
        }
    }
}
