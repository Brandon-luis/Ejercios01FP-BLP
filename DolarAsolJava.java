import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class DolarAsolJava {
    public static void main(String[] args) {
        //2.2
        //Definir variables
        double s, d, p;
        //Datos de entrada 
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dolar:");
        d=lt.nextDouble();
        System.out.println("Ingrese el precio:");
        p=lt.nextDouble();
        //Proceso
        s=d*p;
        //Datos de salida
        System.out.println("Cantidad de dolares a soles es:"+s);
    }
}