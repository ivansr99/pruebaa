/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.imc;

import java.util.Scanner;

/**
 *
 * @author ivsa8544
 */
public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu estatura");
        double estatura = sc.nextDouble();
        System.out.println("Introduce tu peso");
        double pes = sc.nextDouble();
        double calculo;
        if(estatura>2.75){
            System.out.println("Estatura No valida");
        }
        else if(pes>635){
            System.out.println("Peso No valida");
        }
        else {
        }
        calculo= calculoIndiceIMC(estatura, pes);
        double clasi;
        clasi= interpretarIndiceIMC(calculo);
    }
    public static double calculoIndiceIMC(double estatura, double pes){
        double IMC;
        double elevado = estatura*2;
        IMC= pes/elevado;
        System.out.println("El IMC es "+IMC);
        return IMC;
    }
    public static double interpretarIndiceIMC(double IndiceIMC){
        if (IndiceIMC<18.5){
            System.out.println("Baix Pes");
        }
        else if (IndiceIMC>=18.5 && IndiceIMC<=24.99){
            System.out.println("Normal");
        }
        else if (IndiceIMC>25){
            System.out.println("SobrePes");
        }
        return IndiceIMC;
        
    }
    
}
