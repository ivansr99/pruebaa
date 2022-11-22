/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1examen;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Exercici1Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Quin tipus de dia es laborable(L), dissabte(S) o festiu(F)? ");
        char opcion = sc.next().charAt(0);
        int tipus = 0;
        
            switch (opcion){
            case 'L':
                System.out.println("Dia laborable ");
                System.out.println("Quin esmorzar  vols tipus(1) o tipus(2)? ");
                tipus = sc.nextInt();
                if (tipus==1)
                {
                     System.out.println("El esmorzar costa 2,00€ ");
                }
                else if (tipus==2)
                {
                     System.out.println("El esmorzar costa 2,50€ ");
                }
                else{
                    System.out.println("Opcion no valida ");
                }
                break;
                
                case 'S':
                System.out.println("Dissabte ");
                System.out.println("Quin esmorzar  vols tipus(1) o tipus(2)? ");
                tipus = sc.nextInt();
                if (tipus==1)
                {
                     System.out.println("El esmorzar costa 2,20€ ");
                }
                else if (tipus==2)
                {
                     System.out.println("El esmorzar costa 2,70€ ");
                }
                else{
                    System.out.println("Opcion no valida ");
                }
                break;
                
                case 'F':
                System.out.println("Festiu ");
                System.out.println("Quin esmorzar  vols tipus(1) o tipus(2)? ");
                tipus = sc.nextInt();
                if (tipus==1)
                {
                     System.out.println("El esmorzar costa 2,30€ ");
                }
                else if (tipus==2)
                {
                     System.out.println("El esmorzar costa 2,80€ ");
                }
                else{
                    System.out.println("Opcion no valida ");
                }
                break;
                
                case 'l':
                System.out.println("Dia laborable ");
                System.out.println("Quin esmorzar  vols tipus(1) o tipus(2)? ");
                tipus = sc.nextInt();
                if (tipus==1)
                {
                     System.out.println("El esmorzar costa 2,00€ ");
                }
                else if (tipus==2)
                {
                     System.out.println("El esmorzar costa 2,50€ ");
                }
                else{
                    System.out.println("Opcion no valida ");
                }
                break;
                
                case 's':
                System.out.println("Dissabte ");
                System.out.println("Quin esmorzar  vols tipus(1) o tipus(2)? ");
                tipus = sc.nextInt();
                if (tipus==1)
                {
                     System.out.println("El esmorzar costa 2,20€ ");
                }
                else if (tipus==2)
                {
                     System.out.println("El esmorzar costa 2,70€ ");
                }
                else{
                    System.out.println("Opcion no valida ");
                }
                break;
                
                case 'f':
                System.out.println("Festiu ");
                System.out.println("Quin esmorzar  vols tipus(1) o tipus(2)? ");
                tipus = sc.nextInt();
                if (tipus==1)
                {
                     System.out.println("El esmorzar costa 2,30€ ");
                }
                else if (tipus==2)
                {
                     System.out.println("El esmorzar costa 2,80€ ");
                }
                else{
                    System.out.println("Opcion no valida ");
                }
                break;
                
                default: 
                System.out.println("Opcion no valida ");
            }
    }
    
}
