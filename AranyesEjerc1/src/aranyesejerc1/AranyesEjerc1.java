/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aranyesejerc1;

import java.util.Scanner;

/**
 *
 * @author ivsa8544
 */
public class AranyesEjerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un dia");
        int dia = sc.nextInt();
        int comida = trozos (dia);
        System.out.println("Has comido: "+comida+" trozos");
    }
    public static int trozos (int dia){
        if (dia%3==0){   
        return 1;
        }
        else if (dia%3>0){
        return 4;
        }
        return -1;
    }
}
