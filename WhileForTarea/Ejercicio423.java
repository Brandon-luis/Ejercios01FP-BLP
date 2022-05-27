package WhileForTarea;
import java.util.Scanner;
/**
 * Ejercicio423
 */
public class Ejercicio423 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 320; i >=160; i--) {
            if (i%20==0) {
                System.out.println(i);
            }
        }
    }
}