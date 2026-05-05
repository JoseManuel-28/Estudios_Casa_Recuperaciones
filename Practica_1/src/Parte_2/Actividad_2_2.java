package Parte_2;

import java.util.Scanner;

public class Actividad_2_2 {
    Scanner scanner = new Scanner(System.in);

    public Actividad_2_2(){
        Init();
    }

    public void cabecera(){
        System.out.println("----------------");
        System.out.println("Actividad 2.2");
        System.out.println("----------------");
    }

    public void pie(){
        System.out.println("\n");
    }

    public void Init(){
        cabecera();

        System.out.println("Introduzca un dia de la semana ");
        int dia = scanner.nextInt();

        if ( dia == 1){
            System.out.println("Estamos a lunes todavia ");
        } else if (dia == 2) {
            System.out.println("Sigue siendo martes");
        } else if (dia == 3) {
            System.out.println("Ya es miercoles, mitad de semana");
        }else if (dia == 4 ){
            System.out.println("Es juernes ya queda na");
        } else if (dia == 5) {
            System.out.println("PORFIN ES VIERNES DE BEREBER");
        } else if (dia == 6) {
            System.out.println("Sabado de fiestuqui");
        } else if (dia == 7) {
            System.out.println("Ya es domingo y mañana ya es lunes otra vez");
        }else {
            System.out.println("Introduzca un número valido ( 1 - 7)");
        }
        pie();
    }
}
