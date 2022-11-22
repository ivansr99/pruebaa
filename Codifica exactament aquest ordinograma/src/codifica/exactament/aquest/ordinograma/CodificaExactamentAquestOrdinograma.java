/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codifica.exactament.aquest.ordinograma;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class CodificaExactamentAquestOrdinograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Escribe un numero ");
        num= sc.nextInt();
        
        if (num%2>0){
            System.out.print("El numero es senar ");
        }
        
        else if (num%3==0){
            System.out.print("El numero es parell i divisible entre 3 ");
        }
        else if(num%3>0) {
            System.out.print("El numero es parell i no divisible entre 3 "); 
        }
        
        
    }
    
}
