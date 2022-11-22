/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadoc;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ivsa8544
 */
public class Javadoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int caidaBola(){
        Random rd = new Random();
        int aleatorio = rd.nextInt(37);
        System.out.println("La maquina ha elegido: " +aleatorio);
        return aleatorio;
    }
    
    public static int comprobarResultado (int bola, int num_apostado){
        int victoria = 0;
       
            if (bola==num_apostado ){ 
                
            }
            else if (bola%2==1 && num_apostado==37){
                
            }
            else if (bola%2==0 && num_apostado==38){
                
            }
        return victoria;
    }
    
    static char continuarJugando (char respuesta, int dinero){
        System.out.print("Quieres seguir jugando?");
        char juega = sc.next().charAt(0);
        
            switch (juega){
            case 'S':
                if (dinero>0)
                {
                     System.out.println("Puedes seguir jugando");
                }
                else{
                    System.out.println("Opcion no valida ");
                }
                break;
                
            case 's':
                if (dinero>0)
                {
                    System.out.println("Puedes seguir jugando ");
                }
                else{
                    System.out.println("Opcion no valida");
                }
                break;

    }


    static int ganancias (int dinero_apostado, int num_apostado){
        if (num_apostado>=1 && num_apostado<=36){
            dinero_apostado
        }
        return dinero_ganado;
        
    }
}