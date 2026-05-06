package Parte_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Actividad_8 {

    Scanner scanner = new Scanner(System.in);
    int[]numeros = new int[10];


    public Actividad_8(){
        Init();
    }

    public void cabecera(){
        System.out.println("-------------------");
        System.out.println("   Actividad 8");
        System.out.println("-------------------");
    }

    public void separador(){
        System.out.println("\n");
    }

    public void Init(){
        cabecera();
        separador();
        System.out.println("Introduzca 10 números");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1 ) + "º");
            System.out.println("");
            numeros[i] = scanner.nextInt();
            System.out.println("");
        }


        separador();

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(" Posicion " + (i + 1 ) + " : " + numeros[i]);

        }

        separador();

    }
}
