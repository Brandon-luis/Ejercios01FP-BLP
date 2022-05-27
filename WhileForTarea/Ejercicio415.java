package WhileForTarea;
import java.util.Scanner;
/**
 * Ejercicio415
 */
public class Ejercicio415 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introducir NUMERO");
        int n=lt.nextInt();

        for (int i = n; i <= 10; i++) {
            System.out.println(i + " El resultado es :" + " ----> " + " CUBO = " + i*i*i);
        }
        
    }
}
