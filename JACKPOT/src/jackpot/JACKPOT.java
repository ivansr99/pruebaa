/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jackpot;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ivsa8544
 */
public class JACKPOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int apuesta, disc;
        int saldo=10;
        System.out.println("Quants diners vols apostar? Tens "+saldo+".");
        apuesta= Quantitat_apostada (saldo);
        disc= tirada_disc();
        mostrar_tirada();
    }
    public static int Quantitat_apostada (int saldo){
        int dinero_apuesta;
        Scanner sc = new Scanner(System.in);
        do{
        dinero_apuesta=sc.nextInt();
        
        }while(dinero_apuesta>saldo || dinero_apuesta<=0);
        return saldo;
             
} 
    public static char tirada_disc (){
        int tirada;
        Random rd = new Random();
        tirada = rd.nextInt(3)+1;
        if (tirada==1){
             System.out.println("A");
        }
        else if (tirada==2){
            System.out.println("B");
        }
        else if (tirada==3){
            System.out.println("C");
        }
        return (char) tirada;
    }

public static char mostrar_tirada(){
        int tiradas;
            Random rd = new Random();
            tiradas = rd.nextInt(3)+1;
            if (tiradas==1){
             System.out.print("A ");
        }
        else if (tiradas==2){
            System.out.print("B ");
        }
        else if (tiradas==3){
            System.out.print("C ");
        }
            tiradas = rd.nextInt(3)+1;
            
            if (tiradas==1){
             System.out.print("A ");
        }
        else if (tiradas==2){
            System.out.print("B ");
        }
        else if (tiradas==3){
            System.out.print("C ");
        }
            tiradas = rd.nextInt(3)+1;
            if (tiradas==1){
             System.out.print("A ");
        }
        else if (tiradas==2){
            System.out.print("B ");
        }
        else if (tiradas==3){
            System.out.print("C ");
        }
            return (char) tiradas; 
    
}
}
