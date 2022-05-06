package EstCondicional;

import java.util.Scanner;

public class Ejercicio315 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables
        int numero;
        String diasemana;
        System.out.println("Ingresar el numero");
        numero=lt.nextInt();
        //Proceso
        if (numero == 1) {
            diasemana="El dia es lunes";
        } else if(numero == 2){
            diasemana="El dia es martes";
      
        } else if(numero == 3){
            diasemana="El dia es miercoles";

        } else if(numero == 4){
            diasemana="El dia es jueves";

        } else if(numero == 5){
            diasemana="El dia es viernes";
        } else if(numero == 6){
            diasemana="El dia es sabado";
        } else {
            diasemana="El dia es domingo";
        }
        //Datos de Salida
        System.out.println(diasemana);
    }
}