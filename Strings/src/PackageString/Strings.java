/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PackageString;

import java.util.Scanner;

/**
 *
 * @author ivsa8544
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=3;
        String frase="Hola que tal";
        System.out.println (frase);
        Scanner sc=new Scanner (System.in);
        System.out.println("Escribe una frase");
        frase=sc.next();
        frase=sc.next("frase con next "+frase);
        frase=sc.nextLine();
        frase=sc.next("frase con nextline "+frase);
        if(frase.isEmpty())
            
        {
            System.out.println ("string vacio");
        }
        else{
            System.out.println ("String no vacio");
        }
        
        char letra=frase.charAt(3);
        System.out.println ("La letra en la posicion 3 es "+letra);
        System.out.println ("La frase tiene "+frase.length());
        for (int i = 0; i < frase.length(); i++) {
            System.out.println ("-"+frase.charAt(i));
            
        }
        String f1="Hola que tal";
        String f2="Hola que tal.";
        if(f1.equals(f2))
        {
            System.out.println ("Frase igual");
        }
        else{
            System.out.println ("Frase diferente");
        }
        
    }
    
}
