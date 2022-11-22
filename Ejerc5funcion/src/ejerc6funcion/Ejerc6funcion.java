/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc6funcion;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejerc6funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double iva;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un precio");
        double precio;
        precio = sc.nextInt();
        double precioiva = precioConIVA(precio);
        
        System.out.println("Escribe un precio");
        double precio2;
        precio2 = sc.nextInt();
        
    }
    


    public static double precioConIVA(double precio)
    {
        double precioiva = 0 ;
        int precio2 = 0;
        if(precio>0 && precio2>0)
            {
            double iva = precio*0.21;
            double descuento= precio+iva;
            double total= descuento;
              System.out.println("El precio con el IVA es: "+total);  
            }
        
        
        return precioiva ;
      
    
}

    
}