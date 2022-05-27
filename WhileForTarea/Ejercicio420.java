package WhileForTarea;
/**
 * Ejercicio426
 */
import java.util.Scanner;
public class Ejercicio420 {
    static Scanner lt=new Scanner(System.in);
    public static void NCantidadDinero() {
        String seguir="S", TipoMB="";
        int cM1=0, cM2=0, cM5=0, cB1=0, cB2=0, vM1=1, vM2=2, vM5=5, vB1=10, vB2=20, total=0;
        total=(cM1*vM1)+(cM2*vM2)+(cM5*vM5)+(cB1*vB1)+(cB2*vB2);
        while (seguir.equals("S")) {
            System.out.println("Moneda o Billete?:\nM1=Moneda S/1\nM2=Moneda S/2\nM5=Moneda S/5\nB10=Billete S/10\nB20=Billete S/20");   
            TipoMB=lt.next().toUpperCase();
            if (TipoMB.equals("M1")) {
                System.out.println("Ingresar cantidad de monedas de S/1");
                cM1=lt.nextInt();
            } else if (TipoMB.equals("M2")) {
                System.out.println("Ingresar cantidad de monedas de S/2");
                cM2=lt.nextInt();
            } else if (TipoMB.equals("M5")) {
                System.out.println("Ingresar cantidad de monedas de S/5");
                cM5=lt.nextInt();
            //-----------------------------------------------------------------    
            } else if (TipoMB.equals("B10")) {
                System.out.println("Ingresar cantidad de Billetes de S/10");
                cB1=lt.nextInt();
            } else if (TipoMB.equals("B20")) {
                System.out.println("Ingresar cantidad de Billetes de S/20");
                cB2=lt.nextInt();
            //----------------------------------------------------------------
            } else { System.out.println("La MONEDA O BILLETE en la billetera No se encuentra");}
            System.out.println("Hay Mas MONEDAS O BILLETES?: S=SI, N=No");
            seguir=String.valueOf(lt.next().toUpperCase().charAt(0));
        }
        System.out.println("Cantidad en MONEDAS DE S/1 es:"+(cM1*vM1));
        System.out.println("Cantidad en MONEDAS DE S/2 es:"+(cM2*vM2));
        System.out.println("Cantidad en MONEDAS DE S/5 es:"+(cM5*vM5));
        System.out.println("***************************************");
        System.out.println("Cantidad de dinero BILLETES DE S/10 es:"+(cB1*vB1));
        System.out.println("Cantidad de dinero BILLETES DE S/20 es:"+(cB2*vB2));
        System.out.println("***************************************");
        System.out.println("El dinero en total es:" +total);
    }
    public static void main(String[] args) {
        NCantidadDinero();
    }
}
