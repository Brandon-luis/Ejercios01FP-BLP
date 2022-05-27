package WhileForTarea;
import java.util.Scanner;
/**
 * Ejercicio413
 */
public class Ejercicio413 {
    static Scanner lt=new Scanner(System.in);
    public static void NAprobadosReprobados() {
        int Reprobado=0, Aprobado=0;
        String Nota="",  seguir="S";
        //Entrada - Proceso
        while (seguir.equals("S")) {
            System.out.println("Ingresa los alumnos que aprobaron y reprobaron:\nR=Reprobado\nA=Aprobado");
            Nota=lt.next().toUpperCase();
            if (Nota.charAt(0)=='R') {Reprobado++;}
            else if(Nota.charAt(0)=='A'){Aprobado++;}
            else{ System.err.println("ERROR¡¡Ingresar LETRA CORRECTA (A=Aprobado,R=Reprobado)");}
            System.out.println("Tiene mas Calificaciones?:\nS=Si\tN=No");
            seguir=lt.next().toUpperCase().equals("S")?"S":"N";
        }
        System.out.println("Los REPROBADOS son:" +Reprobado);
        System.out.println("-----------------------------");
        System.out.println("Los APROBADOS son:" +Aprobado);
    }
    public static void main(String[] args) {
        NAprobadosReprobados();
    }
}
