/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc10funcion;

import java.util.Scanner;

/**
 *
 * @author ivsa8544
 */
public class Ejerc10funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int dia;
        System.out.print("Escribe un dia ");
        dia= sc.nextInt();
        int mes;
        System.out.print("Escribe un mes ");
        mes= sc.nextInt();
        int año;
        System.out.print("Escribe un año ");
        año= sc.nextInt();
        boolean fecha;
        fecha= fechaCorrecta (dia, mes, año);
        System.out.print("La fecha es: "+dia+"/"+mes+"/"+año);
        
    }
    public static boolean fechaCorrecta(int dia, int mes, int año)
    {
        boolean fecha = false;
        if (dia>30 && dia<1){
        System.out.println("Dia no valido");
        if (mes<12 && mes<1){
        System.out.println("Mes no valido");  
        if (año>1900){
        System.out.println("Año no valido");
        }
                
        }
        
        }
        return fecha;
    }
}