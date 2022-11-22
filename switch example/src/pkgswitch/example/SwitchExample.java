/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch.example;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class SwitchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int mes;
        
        System.out.print("Escribe un numero entre 1 y 12  ");
        
        mes = sc.nextInt();
        
        switch (mes) {
            case 1:
                System.out.print("Enero");
                break;
                
                case 2:
                System.out.print("Febreo");
                break;
                
                case 3:
                System.out.print("Marzo");
                break;
                
                case 4:
                System.out.print("Abril");
                break;
                
                case 5:
                System.out.print("Mayo");
                break;
                
                case 6:
                System.out.print("Junio");
                break;
                
                case 7:
                System.out.print("Julio");
                break;
                
                case 8:
                System.out.print("Agosto");
                break;
                
                case 9:
                System.out.print("Septiembre");
                break;
                
                case 10:
                System.out.print("Octubre");
                break;
                
                case 11:
                System.out.print("Noviembre");
                break;
                
                case 12:
                System.out.print("Diciembre");
                break;
                
            default:
                System.out.print("Opcion no valida");
                    
        }
        
    } 
}
