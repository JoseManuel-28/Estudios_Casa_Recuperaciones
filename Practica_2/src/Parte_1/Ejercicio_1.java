package Parte_1;

import java.util.Scanner;

public class Ejercicio_1 {
    // Definimos el lector de teclado para toda la clase
    Scanner scanner = new Scanner(System.in);
    // Creamos un contenedor (array) con 10 huecos para números enteros
    int [] arrayList = new int [10];

    // Constructor: es el disparador que ejecuta el ejercicio al nacer el objeto
    public Ejercicio_1(){
        Init();
    }

    // Mét0do decorativo para identificar el ejercicio en la consola
    public void Cabecera(){
        System.out.println("-------------");
        System.out.println("Ejercicio 1");
        System.out.println("-------------");
    }

    // Mét0do para imprimir espacios en blanco y que no todo esté pegado
    public void Separador(){
        System.out.println("\n");
    }

    // Mét0do principal donde reside la lógica de control
    public void Init(){
        Cabecera(); // Llama al título
        Separador(); // Llama al espacio
        System.out.println("Introduce 10 números por teclado");

        // BUCLE DE LLENADO: Controla la entrada de datos
        // Empezamos en 0 y paramos antes de llegar a 10 (longitud del array)
        for (int i = 0; i < arrayList.length; i++) {
            // El número tecleado se asigna a la posición 'i' del array
            // La primera vuelta será arrayList[0], la segunda [1], etc.
            arrayList[i]= scanner.nextInt();
        }

        Separador();

        // BUCLE DE MUESTRA: Recorre el array para enseñar qué hay dentro
        for (int i = 0; i < arrayList.length; i++) {
            // Imprimimos el índice (i+1 para que el usuario vea de 1 a 10)
            // Luego accedemos al valor guardado en esa posición con arrayList[i]
            System.out.println("Indice " + (i + 1 ) +" : " +  arrayList[i]);
        }

        Separador();
    }
}