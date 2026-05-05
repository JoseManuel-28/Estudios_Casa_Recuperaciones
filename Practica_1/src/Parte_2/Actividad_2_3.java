package Parte_2;

import java.util.Scanner;

public class Actividad_2_3 {

    Scanner scanner = new Scanner(System.in);

    public Actividad_2_3(){
        Init();
    }

    public void cabecera(){
        System.out.println("-----------");
        System.out.println("Actividad 2.3");
        System.out.println("-----------");
    }

    public void pie(){
        System.out.println("\n");
    }

    public void Init(){
        cabecera();
        System.out.println("Introduzca un número ");
        int num1 = scanner.nextInt();
        int aux;
        System.out.println("Introduzca otro número ");
        int num2 = scanner.nextInt();
        System.out.println("Introduzca el ultimo número ");
        int num3 = scanner.nextInt();

        if ( num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num2 > num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        if (num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        System.out.println(num1 + " < " + num2 + " < " + num3);

        pie();
    }
}
