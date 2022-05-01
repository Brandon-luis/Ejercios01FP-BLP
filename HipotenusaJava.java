import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class HipotenusaJava {
    public static void main(String[] args) {
        //2.6
        //Definir variables
        double c, a, b;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el lado a:");
        a=lt.nextDouble();
        System.out.println("Ingrese ell lado b:");
        b=lt.nextDouble();
        //proceso
        c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        //Datos de salida 
        System.out.print("La hipotenusa es:"+c);
    }
}