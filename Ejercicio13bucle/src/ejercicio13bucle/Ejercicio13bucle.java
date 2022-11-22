/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13bucle;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejercicio13bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int random = r.nextInt(100)+1;
        Scanner sc = new Scanner (System.in);
        int num;
        
           do{
               System.out.println("Escribe un numero ");
               num= sc.nextInt();
           }
           
           if (num>random){
           System.out.println("El numero es mas grande ");
           num= sc.nextInt();
           }
            
           if (num<random){
           System.out.println("El numero es mas pequeño ");  
           
           }
            
           else if (random==num){
               System.out.println("Has acertado ");
           }
        
    }
}
