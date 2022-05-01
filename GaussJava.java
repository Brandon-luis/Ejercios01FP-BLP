import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class GaussJava {
    public static void main(String[] args) {
        //2.23
        //Definir variables
        double n, s;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor n");
        n=lt.nextDouble();
        //proceso
        s=n*n+1;
        //Datos de salida 
        System.out.print("La suma de los n numeros pares es:"+s);
    }
}