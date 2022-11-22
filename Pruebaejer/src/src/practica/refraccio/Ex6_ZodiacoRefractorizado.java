package practica.refraccio;

import java.util.Scanner;

public class Ex6_ZodiacoRefractorizado {

    /**
     *  6) Obre la classe Ex6_Zodiaco i aplica les següents refraccions:
        1. Canvia el nom de la classe per Ex6_ZodiacoRefractorizado
        2. Canvia el nom de dues variables, les que vulguis.
        3. Converteix el número 31 i el número 12 en constants.
        4. Ubica el codi al voltant de la fase 3 en un mètode apart.
     */
    public static void main(String[] args) {
        //Fase uno (Coge los datos del usuario)
        System.out.println("Adivina tu signo del Zodiaco.");
        Scanner sc = new Scanner(System.in);
        boolean respuestasOK = true;
        
        System.out.println("¿Que dia naciste?(1-31)");
        int DIA = sc.nextInt();

        System.out.println("¿En que mes naciste?(1-12)");
        int MES = sc.nextInt();

        //Fase dos (Verifica los datos del usuario)
        respuestasOK = DIA > 0 && DIA <= treintayuno;
        respuestasOK = respuestasOK && MES > 0 && MES <= doce;

        System.out.println();
        String Signo="";
        if (respuestasOK) {
            Signo = metodoFase3(DIA, MES, Signo);

            //Fase cuatro, mostrar resultado.
            System.out.println("Tu signo es " + Signo);
        } else {
            System.out.println("El mes o el dia no son correctos.");
        }
    }

    public static String metodoFase3(int DIA, int MES, String Signo) {
        //Fase tres (Calculando datos)
        System.out.println("Calculando");
        if (DIA >= 21 && MES == 3 || DIA <= 20 && MES == 4) {
            Signo="Aries";
        }
        if (DIA >= 21 && MES == 4 || DIA <= 21 && MES == 5) {
            Signo="Tauro";
        }
        if (DIA >= 22 && MES == 5 || DIA <= 21 && MES == 6) {
            Signo="Geminis";
        }
        if (DIA >= 21 && MES == 6 || DIA <= 27 && MES == 7) {
            Signo="Cancer";
        }
        if (DIA >= 24 && MES == 7 || DIA <= 23 && MES == 8) {
            Signo="Leo";
        }
        if (DIA >= 24 && MES == 8 || DIA <= 23 && MES == 9) {
            Signo="Virgo";
        }
        if (DIA >= 24 && MES == 9 || DIA <= 23 && MES == 10) {
            Signo="Libra";
        }
        if (DIA >= 24 && MES == 10 || DIA <= 22 && MES == 11) {
            Signo="Escorpio";
        }
        if (DIA >= 23 && MES == 11 || DIA <= 21 && MES == 12) {
            Signo="Sagitario";
        }
        if (DIA >= 22 && MES == 11 || DIA <= 20 && MES == 1) {
            Signo="Capricornio";
        }
        if (DIA >= 21 && MES == 1 || DIA <= 19 && MES == 2) {
            Signo="Acuario";
        }
        if (DIA >= 20 && MES == 2 || DIA <= 20 && MES == 3) {
            Signo="Picis";
        }
        //Fin fase tres (Calculando datos)
        return Signo;
    }
    public static final int doce = 12;
    public static final int treintayuno = 31;
}
