package Parte_2;

public class Actividad_2_4 {
    int inicio = 5;
    public Actividad_2_4(){
        Init();
    }

    public void cabecera(){
        System.out.println("-----------");
        System.out.println("Ejercicio 2.4");
        System.out.println("-----------");
    }

    public void separador(){
        System.out.println("\n");
    }
    
    public void Init(){
        cabecera();
        separador();
        while (inicio < 100){
            System.out.println(inicio);
            inicio = inicio + 5;

        }


        separador();
    }
}
