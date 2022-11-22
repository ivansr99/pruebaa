/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

import java.util.Scanner;


/**
 *
 * @author ivsa8544
 */
public class mayoredad {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print("Escribe tu edad ");
        edad= sc.nextInt();
        int may=mayor (edad);
        
        
        if (edad>=18){
            System.out.println("Es mayor de edad "+may);
        }
        
        else {
            System.out.println("Es menor de edad "+may);
        }
        
    }
    
    public static int mayor(int edad) {
    int may;
    if (edad>=18)
            may = edad;
    else
            may = edad;
    
    return may;
    }
    
}
