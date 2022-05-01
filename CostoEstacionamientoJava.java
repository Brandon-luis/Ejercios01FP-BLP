import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class CostoEstacionamientoJava {
    public static void main(String[] args) {
        //2.4
        //Definir variables
        int h, c, t;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el tiempo en h");
        h=lt.nextInt();
        System.out.println("Ingrese el costo por hora c");
        c=lt.nextInt();
        //proceso
        t=h*c;
        //Datos de salida 
        System.out.print("El cobro total es:"+t);
    }
}