package pe.edu.upeu.blcp.examen;
import java.util.Scanner;
public class ResolucionDeExamen {
    static int n=5;
    public void preguntaexamen02BLCP() {
        Scanner leerT = new Scanner(System.in);
        String claveV, hayMas="S";
        int cantVC1=0, cantVC2=0, cantVC3=0;
        double precioVC1=0, precioVC2=0, precioVC3=0,
        impVC1=0, impVC2=0, impVC3=0, totalImpV=0;

        while (hayMas.equals("S")) {
            System.out.println("Ingrese la clave del Vehiculo (VC1,VC2,VC3):");
            claveV=leerT.next().toUpperCase();
            if (claveV.equals("VC1")) {
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC1=cantVC1+leerT.nextInt();
                if(precioVC1==0){
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC1=leerT.nextDouble();
                }
                impVC1=(precioVC1*12)/100;
            }else if (claveV.equals("VC2")){
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC2=cantVC2+leerT.nextInt();
                if(precioVC2==0){
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC2=leerT.nextDouble();
                }
                impVC2=(precioVC2*8)/100;                
            }else if(claveV.equals("VC3")){
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC3=cantVC3+leerT.nextInt();
                if(precioVC3==0){
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC3=leerT.nextDouble();
                }
                impVC3=(precioVC3*5)/100;   
            }else{ System.out.println("La clave de vehiculo es incorrecto"); }
            System.out.println("Hay mas vehiculos?: S=SI, N=NO");
            hayMas=String.valueOf(leerT.next().toUpperCase().charAt(0));            
        }
        totalImpV=(impVC1*cantVC1)+(impVC2*cantVC2)+(impVC3*cantVC3);
        System.out.println("Impuesto de Vehiculo VC1 es:"+impVC1);
        System.out.println("Impuesto de Vehiculo VC2 es:"+impVC2);
        System.out.println("Impuesto de Vehiculo VC3 es:"+impVC3);
        System.out.println("----------------------------------");
        System.out.println("Impuesto Total de Vehiculo VC1 es:"+(impVC1*cantVC1));
        System.out.println("Impuesto Total de Vehiculo VC2 es:"+(impVC2*cantVC2));
        System.out.println("Impuesto Total de Vehiculo VC3 es:"+(impVC3*cantVC3));        
        System.out.println("-----------------------------------------------------");
        System.out.println("Total impuesto a pagar de "+(cantVC1+cantVC2+cantVC3)+" es:"+totalImpV);
        System.out.println("-----------------------------------------------------");
        System.out.println("Pago de todos los vehiculos mas los impuestos correspondientes:" +(precioVC1+precioVC2+precioVC3+totalImpV));
                }
    
    public void preguntaexamen03BLCP() {
        
        Scanner lt=new Scanner(System.in);
        int cola=n;
        int punta=0;
        for ( int i=0; i < n ;i++){
            for (int j=0;  j<n;j++){
              if(j==cola-1 || j==punta) 
              {System.out.print('*');}
              else
              {System.out.print("_");}
            }
            System.out.println();
            cola--;
            punta++;
          }
  }

    public void preguntaexamen04BLCP() {
        
        int i, j;
        int suma;
        System.out.println("Primeros Numeros Perfectos: ");
        for(i=1;i <= 10000;i++){      
            suma = 0;
            for(j = 1;j < i;j++){                          
                 if(i % j==0){ suma = suma + j; }
            }
          if(i == suma){ System.out.println(i); }
        }
    }

    public void preguntaexamen05BLCP() {
        Scanner leert= new Scanner(System.in);
        int n;
        do {
            System.out.println("INTRODUZCA UN NUMERO POSITIVO : ");
            n = leert.nextInt();
        } while (n < 0);
        System.out.println("---------");
        System.out.print("A Sistema Binario es : ");
        decBin(n);
        System.out.println("..");
    }

            public static void decBin(int n) {
        if (n < 2) { System.out.print(n); return;} 
        else { decBin(n / 2); System.out.print(n % 2); return;}
    }  
}

