/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2examen;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Exercici2Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        double temperatura1;
        double temperatura2;
        double i;
        double fahrenheit;
        
        System.out.println("Escriu la temperatura minima ");
        temperatura1=sc.nextInt();
        System.out.println("Escriu la temperatura maxima ");
        temperatura2=sc.nextInt();
        
        if(temperatura1>temperatura2)
            System.out.println("La temperatura2 es menor ");
      
           for ( i = temperatura1; temperatura1 <= temperatura2; temperatura1++) {
               
           fahrenheit = 1.8*temperatura1+32;
           System.out.println("Conversio de graus Celsius a graus Fahrenheit: " +temperatura1+"C a equival a" + fahrenheit+"F");     
           
           }
        
       }
    
       
        
    }
