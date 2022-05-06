package EstCondicional;

import java.util.Scanner;

public class Ejercicio319 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables

        int edad;
        String genero, aplica;
         
        //Datos de Entrada
        System.out.print("Ingresar edad de la persona:");
        edad=lt.nextInt();
        System.out.println("Igresar el genero de la persona ");
        genero=lt.next();
        //Proceso

        if (genero=="M") {
            System.out.println("Es una mujer");
        } else if(genero=="H"){
            System.out.println("Es un hombre");
        }

        if (edad>70) {
            aplica="Se le aplica la vacuna tipo C";
        } else if(edad>16 && edad<70){
            aplica="Se le aplica la vacuna tipo B"; 
        } else if(edad>16 && edad<70){
            aplica="Se le aplica la vacuna tipo C";
        } else {
            aplica="Se le aplica la vacuna tipo A";
        }    
        //Datos de Salida 
        System.out.println(aplica);
    }
}
    