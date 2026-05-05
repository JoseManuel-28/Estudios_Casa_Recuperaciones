package Parte_1;

public class Actividad_1 {

    int x = 144;
    int y = 999;

    public Actividad_1() {
        Init();
    }

    public void Init(){
        System.out.println("Actividad 1.1");

        System.out.println("Suma : " + suma() +
                " \nResta : " + resta() +
                " \nDivision : " + division() +
                " \nMultiplicacion : "+ Multipicacion() +
                "\n");
    }

    public int suma (){
       return x + y;
    }

    public int resta (){
        return x - y;
    }

    public double division(){
        return  x / y;
    }

    public double Multipicacion(){
        return x * y;
    }
}
