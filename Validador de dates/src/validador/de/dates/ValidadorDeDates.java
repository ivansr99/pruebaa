/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validador.de.dates;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class ValidadorDeDates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int año;
        System.out.print("Escribe un dia ");
        dia= sc.nextInt();
        System.out.print("Escribe un mes ");
        mes= sc.nextInt();
        System.out.print("Escribe un año ");
        año= sc.nextInt();
        
        if (dia<=30 && dia>=1){   
        }
        else{ 
            System.out.print("El dia es incorrecto, tiene que ser <=30. ");
        }
        if (mes<=12 && mes>=1){   
        }
        else{ 
            System.out.print("El mes es incorrecto, tiene que ser <=12. ");
        }
        if (año>=1900){   
        }
        else{ 
            System.out.print("El año es incorrecto, tiene que ser >1900. ");
        }
        if (dia<=30 && dia>=1 && mes>=1 && mes<=12 && año>=1900){   
            System.out.print("La fecha es valida: " +dia+"/"+mes+"/"+año);
        }
        
    }
    
}
