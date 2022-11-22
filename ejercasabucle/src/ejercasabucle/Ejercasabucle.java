/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercasabucle;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejercasabucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int contador_pos= 0;
        int contador_neg= 0;
        Scanner sc=new Scanner(System.in);
        
        do
            {
            System.out.print("Escribe numeros , para terminar escribe 0 ");
            num=sc.nextInt();
          
            if (num>0)
                {
                    System.out.println("Has escrito -> " + num);
                    
                }
        
            if (num >0){ contador_pos++; 
                System.out.println("Contador numeros positivos " +contador_pos);
                }
        
            if (num <0){ contador_neg++; 
                System.out.println("Contador numeros negativos " +contador_neg);
                }
            
            }while(num!=0);
        
            System.out.println("Programa terminado"); 
    }
    
}
