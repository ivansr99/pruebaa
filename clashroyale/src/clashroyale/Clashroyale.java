/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyale;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Clashroyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int copas;
        System.out.print("Cuantas copas tienes?");
        copas = sc.nextInt();
        
        
        if (copas<2000)
        {
        System.out.print("Quina carta vols Mago electrico(m) o esbirro Mega(e)? ");
        char opcion = sc.next().charAt(0);
        
            switch (opcion){
            case 'm':
                System.out.println("Has escollit Mago electrico ");
                break;
                
                case 'e':
                System.out.println("Has escollit Esbirro Mega");
                break;
                
                case 'E':
                System.out.println("Has escollit Esbirro Mega");
                break;
                
                case 'M':
                System.out.println("Has escollit Mago electrico");
                break;
                
                default:
                System.out.println("Opcion no valida");       
                
        } 
        }
        else if (copas>=2000 && copas<3000)
        {
        System.out.print("Quina carta vols Cavallero(c) o Bandida(b)? ");
        char opcion = sc.next().charAt(0);
            
           switch (opcion){
            case 'c':
                System.out.println("Has escollit Cavallero");
                break;
                
                case 'b':
                System.out.println("Has escollit Bandida");
                break;
                
                case 'B':
                System.out.println("Has escollit Bandida");
                break;
                
                case 'C':
                System.out.println("Has escollit Cavallero");
                break;
     
                default:
                System.out.println("Opcion no valida");       
                    
        }  
        }  
        else if (copas>=3000)
        {
        System.out.print("Quina carta vols Ejercito de esqueletos(e) o Gigante(g)? ");
        char opcion = sc.next().charAt(0);
            
           switch (opcion){
            case 'e':
                System.out.println("Has escollit Ejercito de esqueletos ");
                break;
                
                case 'g':
                System.out.println("Has escollit Gigante");
                break;
                
                case 'G':
                System.out.println("Has escollit Gigante");
                break;
                
                case 'E':
                System.out.println("Has escollit Ejercito de esqueletos");
                break;
     
                default:
                System.out.println("Opcion no valida");       
                    
        }  
        }  
    }
    
}
