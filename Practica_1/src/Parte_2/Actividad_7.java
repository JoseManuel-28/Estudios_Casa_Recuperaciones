package Parte_2;

import java.util.Scanner;

public class Actividad_7 {
    Scanner scanner = new Scanner(System.in);


    public Actividad_7(){
        Init();
    }

    public void cabecera(){
        System.out.println("-----------");
        System.out.println("Ejercicio 7");
        System.out.println("-----------");
    }

    public void separador(){
        System.out.println("\n");
    }

    public void Init(){
        cabecera();
        separador();
        System.out.println("Introduce un número");
        int i = scanner.nextInt();
        separador();

        for (int j = 0; j <= 10; j++) {
            System.out.println(i * j);
        }
        separador();
    }
}
