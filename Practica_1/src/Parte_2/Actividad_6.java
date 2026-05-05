package Parte_2;

public class Actividad_6 {


    public Actividad_6(){
        Init();
    }

    public void cabecera(){
        System.out.println("-----------");
        System.out.println("Ejercicio 6");
        System.out.println("-----------");
    }

    public void separador(){
        System.out.println("\n");
    }

    public void Init(){

        cabecera();

    for (int i = 320; i >= 160; i-=20) {
        System.out.println(i);
        }
    separador();

    }
}
