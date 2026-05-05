package Parte_2;

import java.util.Scanner;

public class Actividad_2_1 {

    Scanner scanner = new Scanner(System.in);

    public Actividad_2_1(){
        Init();
    }

    public void mostrarCabecera(){
        System.out.println("-------------------");
        System.out.println("  Actividad 2.1 ");
        System.out.println("-------------------");
        System.out.println("\n");
    }

    public void Init(){
        mostrarCabecera();
        int contador = 0;
        int numeroLimite = 3;

        while (contador < numeroLimite){

            System.out.println("Introduzca un hora -> ");
            int horaIntroducida = scanner.nextInt();

            if (horaIntroducida >= 6 && horaIntroducida <= 12){
                System.out.println("Buenos dias");
                System.out.println("\n");

            } else if (horaIntroducida >= 13 && horaIntroducida <= 20) {
                System.out.println("Buenas tardes");
                System.out.println("\n");

            } else if (horaIntroducida >= 21 && horaIntroducida <= 24 || horaIntroducida >= 0 && horaIntroducida <= 5) {
                System.out.println("Buenas noches");
                System.out.println("\n");
            }else {
                System.out.println("Introduzca una hora valida");
            }

            contador ++;
        }

    }
}
