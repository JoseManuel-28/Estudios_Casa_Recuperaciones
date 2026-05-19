package Parte_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_5 {
    Scanner sc = new Scanner(System.in);

    public Ejercicio_5(){
        Init();
    }

    public void cabecera(){
        System.out.println("----------------");
        System.out.println("  Ejercicio 5");
        System.out.println("----------------");
    }

    public void separador(){
        System.out.println("\n");
    }

    public void Init(){
        cabecera();
        separador();

        System.out.println("Introduzca el número que desee -> ");
        int tamano = sc.nextInt();
        int[] arrayInt = new int[tamano];
        Random dado = new Random();

        separador();

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = dado.nextInt(10);
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("En la posicion " + (i + 1) + " El valor es -> " + arrayInt[i] );
        }
        int suma = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            suma = suma + arrayInt[i];
        }
        separador();
        System.out.println("La suma total de los números es = " + suma);

    }
}
