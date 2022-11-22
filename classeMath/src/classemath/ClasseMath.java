/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classemath;

/**
 *
 * @author ivsa8544
 */
public class ClasseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=5;
        int n2=7;
        
        int maxim=Math.max(1, n2);
            System.out.println("Maxim es "+maxim);
        double decimales=345.678;
            System.out.println("Decimales "+decimales);
        long parteEntera=Math.round(decimales);
            System.out.println(parteEntera);
            int numeroAleatorio=(int)(Math.random()*10);
            System.out.println("Aleatorio "+numeroAleatorio);
        int negativo=Math.negateExact(6);
            System.out.println("El negativo es "+negativo);
        double exponent=Math.pow(5, 3);
            System.out.println("5 elevado a 3 es: "+exponent);
        
    }
    
}
