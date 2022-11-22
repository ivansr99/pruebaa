/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejercicio10 {

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
        float suma = num1+num2;
        float resta = num1-num2;
        float multi = num1*num2;
        float divi = num1/num2;
        
        System.out.println("El resultado de la "+suma);
        System.out.println("El resultado de la "+resta);
        System.out.println("El resultado de la "+multi);
        
        if (num2!=0) {
            divi = num1/num2;
            System.out.println("El resultado de la division es "+divi);
        }
        else
            System.out.println("El resultado de la division no se puede dividir ");
    }
    
}
