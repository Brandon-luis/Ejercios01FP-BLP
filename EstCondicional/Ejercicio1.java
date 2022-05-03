package EstCondicional;

import java.util.Scanner;

/**
 * Ejercicio1
 */
public class Ejercicio1 {

  static  Scanner lt=new Scanner(System.in);

    public static void main(String[] args) {
        //Declarar Variable
        int edad;
        String mensaje;
        //Datos de entrada 
        System.out.print("Ingrese la edad:");
        edad=lt.nextInt();
        //Proceso
        if (edad>=18) {
            mensaje="Puede votar porque su edad es "+edad;
        } else {
            mensaje="No puede votar por que su edad es "+edad;
        }
        //Datos de Salida 
        System.out.print(mensaje);  
    }
}