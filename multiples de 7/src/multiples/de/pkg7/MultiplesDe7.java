/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiples.de.pkg7;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class MultiplesDe7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=12;
        int cont10=0;
        
        do{
            num++;
            if(num%7==0){
                cont10++;
                System.out.println(num);
            }
        }
        
        while(cont10<10);
    }
    
}
