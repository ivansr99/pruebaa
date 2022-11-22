/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebametodospropios;

import java.util.Scanner;

/**
 *
 * @author ivsa8544
 */
public class Pruebametodospropios {

    public static int pedirValorPositivo (){
        Scanner sc=new Scanner (System.in);
        int valor;
        
        do{
            System.out.println("Pon un valor positivo");
            valor=sc.nextInt();
        }while(valor<=0);
        return valor;
    
        }
    public static int pedirValorEntreDosNumeros(int n1, int n2){
        int valor;
        Scanner sc=new Scanner (System.in);
        int min,max;
        if(n1>n2){
            max=n1;
            min=n2;
        }
        else{
            max=n2;
            min=n1;
        }
        
        do{
            System.out.println("Pon un valor entre "+min+ " y "+max);
            valor=sc.nextInt();
        }while(valor<min || valor>max);
        return valor;
        }
    
}
