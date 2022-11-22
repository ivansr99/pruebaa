/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc4bucle;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejerc4bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int contador= 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero");
        n = sc.nextInt();
        
        while (contador<n)   
        {
        
        System.out.println("numero "+n);
        contador= contador+1;
        }
    }
    
}
