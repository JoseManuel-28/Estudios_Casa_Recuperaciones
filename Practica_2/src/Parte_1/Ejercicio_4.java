package Parte_1;

public class Ejercicio_4 {
    int[] arrayInt = new int[100];
    int suma = 0;
    double media;

    public Ejercicio_4(){
        Init();
    }

    // Crea el marco visual del Ejercicio 3
    public void cabecera(){
        System.out.println("--------------");
        System.out.println(" Ejercicio 4");
        System.out.println("--------------");
    }

    // Inserta un salto de línea decorativo
    public void separador(){
        System.out.println("\n");
    }

    public void Init(){
        cabecera();
        separador();

        for (int i = 0; i < 100; i++) {
            arrayInt[i] = i +1;
            System.out.println(arrayInt[i]);
        }

        for (int i = 0; i < arrayInt.length; i++) {
            suma = suma + arrayInt[i];
            media = suma/100;
        }


        separador();
        System.out.println("-- La suma de los numeros es = " + suma);
        System.out.println("-- La media de los números es = " + media);




    }


}
