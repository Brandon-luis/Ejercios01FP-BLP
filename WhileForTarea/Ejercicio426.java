package WhileForTarea;
import java.util.Scanner;
/**
 * Ejercicio426
 */

public class Ejercicio426 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {

    System.out.println("Introduzca un numero");
    int numero=lt.nextInt();

    for (int i = numero + 1; i <= numero + 5; i++) {
        System.out.println(i + " Las operaciones son:" + " Cuadrado = " + i*i + " Cubo = " + i*i*i );
        
    }
        
    }
}
