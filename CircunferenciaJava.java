import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class CircunferenciaJava {
    public static void main(String[] args) {
        //2.19
        //Definir variables
        double pi=3.14, r, c;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor del radio:");
        r=lt.nextDouble();
        //proceso
        c=2*pi*r;
        //Datos de salida 
        System.out.print("La longitud de la circunferencia es:"+c);
    }
}
