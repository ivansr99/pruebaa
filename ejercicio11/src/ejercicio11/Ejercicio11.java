/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejercicio11 {

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
        
        if (num1>=num2){
            System.out.println("El numero 1 es mayor");
        }
        else
            System.out.println("El numero 2 es mayor");
    }
    
}
