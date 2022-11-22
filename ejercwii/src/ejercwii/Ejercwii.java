/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercwii;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ivsa8544
 */
public class Ejercwii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int petardo;
        System.out.print("Escoje un petardo de los tres ");
        petardo= sc.nextInt();
        Random rd = new Random();
        int petardo1;
        int petardo2 = 0;
        int petardo3 = 0;
        System.out.print("Has escojido el petardo "+petardo);
        
        
        petardo1 = rd.nextInt(10)+1;
        petardo2 = rd.nextInt(10)+1;
        petardo3 = rd.nextInt(10)+1;
        
        if (petardo>=1 && petardo<=3){
            }
        
        
        if (petardo1>=petardo2 && petardo1>=petardo3){
                System.out.print("Has ganado ");
                
            }
        
        else{ 
            System.out.print(" Has perdido "+petardo1);
        }        
        
        
        if (petardo2>=petardo1 && petardo2>=petardo3){
                System.out.print(" Petardo2 has ganado "+petardo2);
                
            }
        
        else{ 
            System.out.print(" Petardo2 has perdido "+petardo2);
        }  
        
        if (petardo3>=petardo1 && petardo3>=petardo2){
                System.out.print(" Petardo3 has ganado "+petardo3);
                
            }
        
        else{ 
            System.out.print(" Petardo3 has perdido "+petardo3);
        }  
    }
    
}
