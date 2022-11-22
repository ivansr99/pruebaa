/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double lado;
        System.out.println ("Pon la longitud del lado");
        lado= sc.nextDouble();
        System.out.println ("El lado mide "+lado);
        double area= lado*lado;
        System.out.println ("El area mide "+area);
    }
    
}
