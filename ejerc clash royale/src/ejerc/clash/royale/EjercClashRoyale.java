/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc.clash.royale;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class EjercClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int cartas;
        
        System.out.print("Quina carta vols Mago electrico o esbirro Mega? ");
        
        cartas = sc.nextInt();
        
        switch (cartas) {
            case 1:
                System.out.print("Has escollit Mago electrico ");
                break;
                
                case 2:
                System.out.print("Has escollit Esbirro Mega");
                break;
                
         default:
                System.out.print("Opcion no valida");       
                
        }
    }
}
