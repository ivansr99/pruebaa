/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class encontrarmaximoenfuncion {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double valor1;
        System.out.print("Escribe un valor ");
        valor1= sc.nextDouble();
        double valor2;
        System.out.print("Escribe un segundo valor ");
        valor2= sc.nextDouble();
        double max=maximo (valor1,valor2);
        System.out.println("Maximo "+max);
        
        double min=minimo (valor1,valor2);
        System.out.println("Minimo "+min);
    }
    
    
    public static double maximo(double valor1, double valor2) {
    double max;
    if (valor1 > valor2)
            max = valor1;
    else
            max = valor2;
    return max;
    }
    
    public static double minimo(double valor1, double valor2) {
    double min;
    if (valor1 < valor2)
            min = valor1;
    else
            min = valor2;
    return min;
    }
}
