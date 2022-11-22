/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        float num1;
        System.out.println("Escribe un numero");
        num1= sc.nextFloat();
        float num2;
        System.out.println("Escribe un segundo numero");
        num2= sc.nextFloat();
        
        if (num1>num2){
            System.out.println("orden ascendente "+num2 +num1);
        }
        else if (num1==num2){
            System.out.println("es igual "+num2);
        }
        else
            System.out.println("orden ascendente "+num1 +num2);
    }
    
}
