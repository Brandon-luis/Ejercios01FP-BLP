package WhileForTarea;
import java.util.Scanner;
/**
 * Ejercicio43
 */
public class Ejercicio43 {
    static Scanner lt=new Scanner(System.in);
    public static void NCantidades() {
        int NMayorcero=0, NIgualCero=0, NMenorCero=0;
        double numN=0;
        String seguir="S";
        while (seguir.equals("S")) {
            System.out.println("Ingrese un numero:");
            numN=lt.nextDouble();
            if (numN<0) {NMenorCero++;}
            else if(numN>0){NMayorcero++;}
            else{NIgualCero++;}
            System.out.println("Hay mas numeros?:\nS=Si\tN=No");
            seguir=lt.next().toUpperCase().equals("S")?"S":"N";
        }
        System.out.println("Numeros Mayores a cero: "+NMayorcero);
        System.out.println("Numeros iguales a cero: "+NIgualCero);
        System.out.println("Numeros Menores a cero: "+NMenorCero);
    }
    public static void main(String[] args) {
        NCantidades();
    }
}
