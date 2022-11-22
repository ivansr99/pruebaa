/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc.horas;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class EjercHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        float hora;
        System.out.println("Escribe una hora");
        hora= sc.nextFloat();
        float min;
        System.out.println("Escribe los minutos");
        min= sc.nextFloat();
        float seg;
        System.out.println("Escribe los segundos");
        seg= sc.nextFloat();
        float segundos = seg+1;
        float minutos = min+1;
        if (seg<60){
            System.out.println("Mostrar"+hora +min +segundos);
        }
        else if (segundos==60){
            System.out.println("Mostrar"+hora +minutos +seg);
        }
    }
    
}
