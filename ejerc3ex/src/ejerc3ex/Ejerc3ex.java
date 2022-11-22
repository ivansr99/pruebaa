/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc3ex;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejerc3ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int anchura;
        int longitud;
        int otras;
        int area;
        int suma_acum=0;
        
        
        do{
        System.out.print("Introduce la anchura ");
        anchura = sc.nextInt();
        System.out.print("Introduce la longitud ");
        longitud = sc.nextInt();
        area= anchura*longitud;
        System.out.println("El area es: "+area);
        suma_acum = area+suma_acum;
        
        System.out.println("Existen otras estancias? SI=1/NO=0 ");
        otras = sc.nextInt();
        
        if (otras==0){ 
                System.out.println("El area total de la casa es: "+ suma_acum);
                }
        
        }while(otras==1);
    }
    
}
