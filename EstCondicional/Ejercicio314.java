package EstCondicional;

import java.util.Scanner;

public class Ejercicio314 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables
        int calificacion;
        String Resultado;
        System.out.println("Ingresar la tu calificacion");
        calificacion=lt.nextInt();
        //Proceso
        if (calificacion == 10){
            Resultado="Tu calificacion es A";
        } else if(calificacion == 9){
            Resultado="Tu calificacion es B";
      
        } else if(calificacion == 8){
            Resultado="Tu calificacion es C";

        } else if(calificacion == 7){
            Resultado="Tu calificacion es D";

        } else if(calificacion == 6){
            Resultado="Tu calificacion es D";
        } else {
            Resultado="Tu calificacion es F";
        }
        //Datos de Salida
        System.out.println(Resultado);
    }
}