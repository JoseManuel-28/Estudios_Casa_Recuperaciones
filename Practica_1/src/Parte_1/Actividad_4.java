package Parte_1;

import java.util.Scanner;

public class Actividad_4 {
    Scanner scanner = new Scanner(System.in);


    public Actividad_4(){
        Init();
    }

    public void Init(){

        System.out.println("Actividad 1.4");

        System.out.println(" Introduzca un número ");
        int num1 = scanner.nextInt();

        System.out.println( " Introduzca otro número ");
        int num2 = scanner.nextInt();

        System.out.println("El resultado de la multiplicacion es " + num1 * num2 );

        System.out.println("\n ");

    }
}
