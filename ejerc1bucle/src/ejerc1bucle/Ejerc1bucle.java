/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc1bucle;

/**
 *
 * @author ivsa8544
 */
public class Ejerc1bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int suma_acum = 0;
        for (numero= 1; numero <= 20; numero++) {
        System.out.println("Numero "+numero);    
        }
        
        numero=0;
        while (numero<=20)   
        {
        suma_acum = suma_acum + numero;
        System.out.println("numero "+numero);
        numero = numero+1;
        }
    }
    
    
}
