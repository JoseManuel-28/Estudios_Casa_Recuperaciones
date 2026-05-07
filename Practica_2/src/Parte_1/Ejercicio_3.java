package Parte_1;

public class Ejercicio_3 {
    // Array de enteros con valores desordenados para buscar el menor
    int [] arrayInt = {5, 2, 8, 1, 10};
    // Variable para almacenar el número más pequeño encontrado
    int numMin;

    // El constructor lanza la ejecución del ejercicio
    public Ejercicio_3(){
        Init();
    }

    // Crea el marco visual del Ejercicio 3
    public void cabecera(){
        System.out.println("--------------");
        System.out.println(" Ejercicio 3");
        System.out.println("--------------");
    }

    // Inserta un salto de línea decorativo
    public void separador(){
        System.out.println("\n");
    }

    // Mét0do principal donde se busca el valor mínimo
    public void Init(){
        cabecera();
        separador();

        // PASO 1: Suponemos que el primer número (el 5) es el más pequeño
        numMin = arrayInt[0];

        // PASO 2: Recorremos t0do el array para comparar cada número
        for (int i = 0; i < arrayInt.length; i++) {
            // Si el número actual de la lista es menor que nuestro 'numMin'...
            if (numMin > arrayInt[i]) {
                // ...actualizamos 'numMin' con ese nuevo valor más pequeño
                numMin = arrayInt[i];
            }
        }

        // PASO 3: Imprimimos el resultado final tras revisar toda la lista
        System.out.println("El número más pequeño es: " + numMin);
    }
}