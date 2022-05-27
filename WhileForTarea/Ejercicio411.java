package WhileForTarea;
import java.util.Scanner;
/**
 * Ejercicio411
 */
public class Ejercicio411 {
    static Scanner lt=new Scanner(System.in);
    public static void CajaRegistradoraAlmacen() {
        String haymas="S", MB="";
        int vB=0, cB=0;
        double vM=0, cM=0, total;
        while (haymas.equals("S")) {
            System.out.println("Ingresar si es moneda o billete:\nM=moneda\nB=billete");
            MB=lt.next().toUpperCase();
            if (MB.equals("B")) {
                System.out.println("Ingresar cantidad de billetes");
                cB=lt.nextInt();
                if (vB==0) { System.out.println("Ingresar VALOR del billete");
                vB=lt.nextInt();}

            } else if (MB.equals("M")) {
                System.out.println("Ingresar cantidad de monedas");
                cM=lt.nextInt();
                System.out.println("Ingresar VALOR de monedas");
                vM=lt.nextInt();
            } else { System.out.println("Ingresar si es moneda o billetes");}

            System.out.println("HAY MAS EN LA CAJA REGISTRADORA?: S=SI, N=No");
            haymas=String.valueOf(lt.next().toUpperCase().charAt(0));
        }
        System.out.println("Total en BILLETES ES:"+(cB*vB));
        System.out.println("Total en MONEDAS ES:"+(cM*vM));
        total=(cB*vB)+(cM*vM);
        System.out.println("Total BILLETES Y MONEDAS ES:"+total); 
    }
    public static void main(String[] args) {
        CajaRegistradoraAlmacen();
    }
}
