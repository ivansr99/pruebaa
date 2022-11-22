/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc18;

import java.util.Scanner;
/**
 *
 * @author ivsa8544
 */
public class Ejerc18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int horas,h_extra;
        double precio_horas;
        double salario_neto, salario_hnormales, salario_extra;
        double impuestos_libres, impuestos, salario_final;
        final int HORAS_NORMALES = 35;
        Scanner sc = new Scanner(System.in); //recoger datos teclado
        System.out.print("Posa les hores treballades? ");
        horas = sc.nextInt();
        System.out.print("Posa el preu que et paguen cada hora? ");
        precio_horas = sc.nextDouble();
        if (horas > HORAS_NORMALES)
        { //calclare horas y horas extra
            salario_hnormales = HORAS_NORMALES*precio_horas;
            h_extra = horas - HORAS_NORMALES;
            salario_extra = precio_horas*h_extra*1.5;
            salario_neto = salario_hnormales+salario_extra;
        }
        else
        { //no hay horas extra
            salario_neto = horas * precio_horas;
        }
        if (salario_neto>500)
        {
            impuestos_libres = salario_neto - 500;
            impuestos = impuestos_libres*0.25;
            salario_final = salario_neto - impuestos;
        }
        else
        {
            salario_final = salario_neto;
        }
        System.out.println("Et pagaran " + salario_final + " Euros");
    }
}
