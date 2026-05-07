package Parte_1;

public class Ejercicio_2 { // Declara la clase pública llamada Ejercicio_2.

    // Declara e inicializa un array de números enteros llamado "notas" con 10 valores ya predefinidos.
    int[] notas = {7, 5, 9, 6, 8, 4, 7, 10, 3, 8};

    // Constructor de la clase. Se ejecuta automáticamente en cuanto creas el objeto con "new Ejercicio_2()".
    public Ejercicio_2(){
        Init(); // Llama al mét0do Init() para arrancar la lógica del ejercicio.
    } // Cierra el constructor.

    // Mét0do que imprime un diseño visual para el título del ejercicio.
    public void cabecera(){
        System.out.println("--------------");
        System.out.println(" Ejercicio 2");
        System.out.println("--------------");
    } // Cierra el mét0do cabecera.

    // Mét0do auxiliar para imprimir un salto de línea y dar aire a la consola.
    public void separador(){
        System.out.println("\n");
    } // Cierra el mét0do separador.

    // Mét0do que muestra un mensaje introductorio en la pantalla.
    public void introduccion(){
        System.out.println("Los elementos del array son: ");
    } // Cierra el mét0do introduccion.

    // Mét0do principal donde se coordina la ejecución de las funciones y se muestran las notas.
    public void Init() {
        cabecera(); // Llama al mét0do que dibuja la cabecera del ejercicio.

        separador(); // Llama al mét0do que mete el espacio en blanco.

        introduccion(); // Llama al mét0do que muestra el texto introductorio.

        // Bucle "for" que recorre el array.
        // Empieza en el índice 0 (i = 0) y sigue mientras "i" sea menor que la longitud del array (10 elementos).
        // En cada vuelta, incrementa "i" en 1 (i++).
        for (int i = 0; i < notas.length; i++) {
            // Muestra en consola la posición amigable para el usuario (i + 1, para que empiece en 1 en vez de 0)
            // y concatena el valor de la nota correspondiente a ese índice: notas[i].
            System.out.println("Posicion " + (i + 1 ) + ": " + notas[i]);
        } // Cierra el bucle for.
    } // Cierra el mét0do Init.
} // Cierra la clase Ejercicio_2.