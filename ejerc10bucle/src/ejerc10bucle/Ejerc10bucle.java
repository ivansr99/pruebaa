/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc10bucle;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejerc10bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int contador_pos= 0;
        Scanner sc=new Scanner(System.in);
        
        do
            {
            System.out.print("Escribe las notas , para terminar escribe -1 ");
            num=sc.nextInt();
          
            if (num>=0 && num<=10)
                {
                    System.out.println("La nota es -> " + num);
                    
                }
           
            }while(num!=-1);
        
            if (num ==10){ contador_pos++; 
                System.out.print("Has puesto un 10 "+contador_pos);
                }
            else if(num>10){ contador_pos++;
                System.out.print("No has puesto un 10 "+contador_pos);
            }
            
            
            System.out.print("Programa terminado");
            
    }
    
}
