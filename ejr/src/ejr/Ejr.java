/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejr;


/**
 *
 * @author ivsa8544
 */
public class Ejr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador;
        int contador_imp;
        int suma = 0;
        int suma_imp = 0;
        
        for (contador=100;contador<=200;contador++)
            
        
            if(contador%2==0){
            suma= contador+suma;
            System.out.println("Par "+suma);
            
        }
        
        for (contador_imp=101;contador_imp<=200;contador_imp++)
        {
            if(contador_imp%2==1){
            suma_imp= contador_imp+suma_imp;
            System.out.println("Impar "+suma_imp);
            } 
         
        }
    }
    
}
