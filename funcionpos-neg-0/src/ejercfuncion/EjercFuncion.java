/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercfuncion;

import java.util.Scanner;
/**
 *
 * @author Francisco
 */
public class EjercFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean signo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num = sc.nextInt();
        signo=dimeSigno(num);
        int Signo = 0;
        
        if(num>0)
        {
            System.out.println("Numero positivo");
        }
        else if(num<0){
            System.out.println("Numero negativo");
        }
        else if(num==0)
        {
            System.out.println("Numero cero");            
        }
    }
    
    
     public static boolean dimeSigno(int a)
    {
        boolean Signo = false;
        if(a>0)
            {
              System.out.println("1");  
            }
        else if (a==0)
            {
                System.out.println("0");
            }
        else{
            System.out.println("-1");
        }
        
        return Signo;
}

    
}
