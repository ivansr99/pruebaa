/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjPiedraPapelTijera;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Ivan
 */
public class EjPiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int player1 = jugada();
        int player2 = jugada_ordenador();

        imp_jugada(player1);

//        jugada_ordenador();0

        int ganador = ganador(player1, player2);

        imp_ganador(ganador);
        marcador(ganador, ganador);

    }

    public static int jugada() {
        int num = 0;
        do {
            System.out.println("Elige un numero entre 0 y 2: ");
            Scanner sc = new Scanner(System.in);

            num = sc.nextInt();

        } while (num > 2);

        return num;

    }

    public static int jugada_ordenador() {
        Random rd = new Random();
        int aleatorio = rd.nextInt(3);
        System.out.println("El jugador dos ha elegido: " + aleatorio);
        return aleatorio;

    }

    public static void imp_jugada(int player) {

        if (player == 0) {
            System.out.println("Has elegido piedra");
        } else if (player == 1) {
            System.out.println("Has elegido papel.");
        } else if (player == 2) {
            System.out.println("Has elegido tijera.");
        } else {
            System.out.println("Has introducido un numero incorrecto.");
        }

    }

    public static int ganador(int choose_player1, int choose_player2) {
        int victoria = 0;
        if (choose_player1 == choose_player2) {
            victoria = 0;
        } else if (choose_player1 == 1 && choose_player2 == 0) {
            victoria = 1;
        } else if (choose_player1 == 2 && choose_player2 == 0) {
            victoria = 1;
        } else if (choose_player1 == 2 && choose_player2 == 1) {
            victoria = 1;
        } else if (choose_player1 == 0 && choose_player2 == 1) {
            victoria = 2;
        } else if (choose_player1 == 0 && choose_player2 == 2) {
            victoria = 1;
        } else if (choose_player1 == 1 && choose_player2 == 2) {
            victoria = 2;
        }
        return victoria;

    }

    public static void imp_ganador(int ganador) {

        if (ganador == 0) {
            System.out.println("EMPATE.");
        } else if (ganador == 1) {
            System.out.println("HAS GANADO.");
        } else if (ganador == 2) {
            System.out.println("TE HA GANADO LA MAQUINA.");
        }

    }
    public static void marcador (int point_player1, int point_player2){
        
        
        System.out.println("Puntuación del jugador 1 = "+ point_player1);
        System.out.println("Puntuación del jugador 2 = "+ point_player2);
        if(point_player1 == 1 && point_player2 == 1){
            point_player1 = 0;
            point_player1++;
            if(point_player2 ==0 ) {
            }
        }

    }
        
        
}
