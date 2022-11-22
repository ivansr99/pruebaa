/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.clase;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejercicio2Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        float millas;
        System.out.println("Escribe las millas");
        millas= sc.nextFloat();
        final float kilometros = (float) 1852;
        float distancia = millas*kilometros;
        System.out.println ("La distancia en kilometros es "+distancia);
    }
    
}
