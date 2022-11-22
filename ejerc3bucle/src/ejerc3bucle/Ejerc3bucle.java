/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc3bucle;

/**
 *
 * @author ivsa8544
 */
public class Ejerc3bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero= 1;
        int suma_acum=2 ;
        for (numero= 1; numero <= 200; numero=numero+2) {
        System.out.println("Numero "+numero);    
        }
        
        numero=1;
        while (numero<=200)   
        {
        suma_acum = suma_acum + numero;
        System.out.println("numero "+numero);
        numero = numero+2;
        }
    }
    
}
