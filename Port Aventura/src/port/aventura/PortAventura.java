/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package port.aventura;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class PortAventura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int personas;
        int menors;
        int total;
        int adultos;
        double descu;
        double total_final;
        
        System.out.print("Cuantas personas soys? ");
        personas= sc.nextInt();
        System.out.print("Cuantos menores hay? ");
        menors= sc.nextInt();
        
        if (personas<=10 && personas>0){
        adultos= personas-menors;
        menors= personas-adultos;
        total= adultos*20+menors*10;
        
        System.out.print("Total: " +adultos+" adultos*20, "+menors+" menores*10 ="+total );
        }
        
        else if (personas>10 && personas<=25){
        adultos= personas-menors;
        menors= personas-adultos;
        total= adultos*20+menors*10;
        descu= total*0.25;
        total_final= total-descu;
        
        System.out.print("Total: " +adultos+" adultos*20, "+menors+" menores*10 ="+total_final);
        
        }
        
        else if (personas>25){
        adultos= personas-menors;
        menors= personas-adultos;
        total= adultos*20+menors*10-20;
        descu= total*0.25;
        total_final= total-descu;
        
        System.out.print("Total: " +adultos+" adultos*20, "+menors+" menores*10 ="+total_final);
        
        }
        
    }
    
}
