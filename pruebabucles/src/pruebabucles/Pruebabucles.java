/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebabucles;


/**
 *
 * @author ivsa8544
 */
public class Pruebabucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        for (i = 0; i < 6; i++) {
             System.out.print("-->"+i);   
        }
        
        System.out.println("");
        System.out.println("bucle en un while");
        i=0;
        while (i<6)
        {
           System.out.println("*"+i); 
           i++;
        }
        
        do
        {
            System.out.println("*"+i);
            i++;
        }
        
       
        
