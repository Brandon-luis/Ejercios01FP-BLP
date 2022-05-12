package EstRepetitivas;

import java.util.Scanner;

public class EjerciciosRepetitivas {
    
   static Scanner lt=new Scanner(System.in);

    public static void ejer41While() {
        int contador=1;
        int suma=0;
        while (contador<=20) {
            if (contador%2==0) {
                suma=suma+contador;
            }
            contador++;
        }
        System.out.println("La respuesta es:"+suma);
    }


    public static void pregunta2DMP() {
        System.out.println("Ingrese el operador:");
        char operador=lt.next().charAt(0);
        switch (operador) {
            case '+': System.out.println("debes sumar"); break;
            case '%': System.out.println("debes sacar el modulo"); break;        
            default: break;
        }
    }

    public static void main(String[] args) {
       pregunta2DMP(); 
    }



}