import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class CostoBoletoJava {
    public static void main(String[] args) {
        //2.7
        //Definir variables
        double k, c, t;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el costo por kilometro c");
        c=lt.nextDouble();
        System.out.println("Ingrese la cantidad de kilometros k");
        k=lt.nextDouble();
        //proceso
        t=c*k;
        //Datos de salida 
        System.out.print("El precio del boleto en es:"+t);
    }
}