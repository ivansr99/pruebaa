/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3examen;

import java.util.Scanner;

import java.util.Random;
/**
 *
 * @author ivsa8544
 */
public class Exercici3Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int contador;
        int multi;
        Random rd =new Random();
        Scanner sc = new Scanner (System.in);
        num= rd.nextInt(9)+1;
        System.out.println("Tabla de multiplicar del numero: "+num);
        
        for (contador = 1;  contador < 11; contador++) {
            
            System.out.print(+num+"*"+contador+"= ");
            multi= sc.nextInt();
            
        }
    }
    
}
