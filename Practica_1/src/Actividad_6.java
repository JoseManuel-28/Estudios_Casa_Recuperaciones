import java.util.Scanner;

public class Actividad_6 {
    Scanner scanner = new Scanner(System.in);

    public Actividad_6 (){
        Init();
    }

    public void Init(){

        System.out.println(" Actividad 1.6 " +
        "\n");


        System.out.println("introduzca un número ->");
        int num1 = scanner.nextInt();
        System.out.println("introduzca otro número ->");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println("La suma de los números es - " + suma);
        System.out.println("La resta de los números es - " + resta);
        System.out.println("La multiplicacion de los números es - " + multiplicacion);
        System.out.println("La division de los números es - " + division);

        System.out.println("\n");
    }
}
