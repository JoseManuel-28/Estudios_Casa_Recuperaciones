package Parte_1;

import java.util.Scanner;

public class Actividad_8 {
    Scanner scanner = new Scanner(System.in);


    public Actividad_8(){
        Init();
    }

    public void Init(){
        System.out.println(" Introduce un día de la semana -> ");
        String diaIndicado = scanner.next();

        if ( diaIndicado.equalsIgnoreCase("Lunes")){
            System.out.println("A primera hora tienes Digitalizacion");
        }else if (diaIndicado.equalsIgnoreCase("Martes")){
            System.out.println("A primera hora tienes Digitalizacion");
        } else if (diaIndicado.equalsIgnoreCase("Miercoles")) {
            System.out.println("A primera hora tienes Digitalizacion");
        }else if (diaIndicado.equalsIgnoreCase("Jueves")){
            System.out.println("A primera hora tienes Digitalizacion");
        }else if (diaIndicado.equalsIgnoreCase("Viernes ")){
            System.out.println("A primera hora tienes Digitalizacion");
        }

        System.out.println("\n");
    }
}
