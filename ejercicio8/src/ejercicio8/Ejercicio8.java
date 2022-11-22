/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        float edad;
        System.out.println("Escribe tu edad");
        edad= sc.nextFloat();
        
        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }
        else
            System.out.println("Eres menor de edad");
        System.out.println("Programa terminado");
    }
        
}
