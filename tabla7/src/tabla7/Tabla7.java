/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabla7;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Tabla7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int contador;
        int multi;
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe un numero ");
        num= sc.nextInt();
        
        for (contador = 1;  contador < 11; contador++) {
            multi=num*contador;
             System.out.println(+num+"*"+contador+"="+multi);
            
        }
        
       
    }
    
}
