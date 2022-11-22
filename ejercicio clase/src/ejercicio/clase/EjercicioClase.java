/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.clase;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class EjercicioClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        float radio;
        System.out.println("Escribe el radio");
        radio= sc.nextFloat();
        final float pi = (float) 3.14;
        float diametro = radio+radio;
        float longitud = 2*pi*radio;
        float area = pi*radio*radio;
        System.out.println ("El diametro es "+diametro);
        System.out.println ("La longitud es "+longitud);
        System.out.println ("El area es "+area);
    }
    
}
