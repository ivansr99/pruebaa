/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        float num1;
        System.out.println("Escribe un numero");
        num1= sc.nextFloat();
    
        if (num1>=0){
            System.out.println("El numero es positivo");
        }
        else
            System.out.println("El numero es negativo");
    }
    
}
