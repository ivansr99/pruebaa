/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.ejem1;

import static java.lang.System.console;
import java.util.Scanner;

/**
 *
 * @author ivsa8544
 */
public class StringEjem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase="Bienvenido";
        System.out.println (frase);
        System.out.println("Escribe una frase");
        Scanner sc=new Scanner (System.in);
        frase=sc.next();
        
        char letra=frase.charAt(4);
        System.out.println ("La letra en la posicion 3 es "+letra);
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.println ("-"+frase.charAt(i));
        }
    }
    
    
}
