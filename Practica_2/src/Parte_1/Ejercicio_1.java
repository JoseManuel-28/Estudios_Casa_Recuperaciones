package Parte_1;

import java.util.Scanner;

public class Ejercicio_1 {
    Scanner scanner = new Scanner(System.in);
    int [] arrayList = new int [10];

    public Ejercicio_1(){
        Init();
    }

    public void Cabecera(){
        System.out.println("-------------");
        System.out.println("Ejercicio 1");
        System.out.println("-------------");
    }

    public void Separador(){
        System.out.println("\n");
    }

    public void Init(){
        Cabecera();
        Separador();
        System.out.println("Introduce 10 números por teclado");

        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i]= scanner.nextInt();
        }

        Separador();

        for (int i = 0; i < arrayList.length; i++) {
            System.out.println("Indice " + (i + 1 ) +" : " +  arrayList[i]);
        }

        Separador();


    }
}
