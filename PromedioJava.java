import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class PromedioJava {
    public static void main(String[] args) {
        //2.16
        //Definir variables
        double n1, n2, n3, p;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la nota n1");
        n1=lt.nextDouble();
        System.out.println("Ingrese la nota n2");
        n2=lt.nextDouble();
        System.out.println("Ingrese la nota n3");
        n3=lt.nextDouble();
        //proceso
        p=n1*0.25+n2*0.25+n3*0.50;
        //Datos de salida 
        System.out.print("El promedio de las 3 notas es:"+p);
    }
}