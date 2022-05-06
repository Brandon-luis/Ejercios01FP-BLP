package EstCondicional;

import java.util.Scanner;

public class Ejercicio318 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables
        double bono, anti, sueldo;
        System.out.println("Ingresar el sueldo del empleado");
        sueldo=lt.nextDouble();
        System.out.println("Ingresar la antiguedad del empleado");
        anti=lt.nextInt();
        //Proceso
        if (anti>4 || sueldo<2000) {
            bono=sueldo*0.25;    
        } else {
            bono=sueldo*0.20;
        }
        //Datos de Salida
        System.out.println("El bono que le corresponde es:"+bono);
            
    }
}
    