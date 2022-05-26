package SubProgramas;

import java.util.Scanner;

public class ClaseGeneral {
  
    static Scanner leerT=new Scanner(System.in);
    static Aritmetica obj=new Aritmetica();

    public static void main(String[] args) {
        System.out.println("Ingrese el Primer Valor:");
        int aX=leerT.nextInt();
        System.out.println("Ingrese el Segundo Valor:");
        int bX=leerT.nextInt();        
        int result=obj.sumar(aX, bX);
        System.out.println("La Suma es:"+result);
    }

}