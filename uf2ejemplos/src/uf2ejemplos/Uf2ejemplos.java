/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2ejemplos;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Uf2ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);       
        int num;
        int count_impar= 0;
        int count_num= 0;
        int sum_acum = 0;
        
        do{
        System.out.println("Fica numero?");
        num=sc.nextInt();
        ++count_num;
        
        if (num%3==0) 
            {
            ++count_impar;
            sum_acum= num+sum_acum;
            }
        
        
        }while(count_impar<3);
       
        System.out.println("Has introduit en total: " +count_num+" numeros");
        System.out.println("La suma de tots els divisibles entre 3 sumen: " +sum_acum);
    
        
        }
}

