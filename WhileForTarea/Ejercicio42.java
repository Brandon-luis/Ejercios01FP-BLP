package WhileForTarea;
import java.util.Scanner;
/**
 * Ejercicio42
 */
public class Ejercicio42 {
    static Scanner lt=new Scanner(System.in);
    public static void BEMBOSHamburguesas() {
        double costoS=10, costoD=12, costoT=14, PrecioFinal=0, totalTC=0, impTC=0;
        int cS=0, cD=0, cT=0;
        String THamburguesa, seguir="S";
        while (seguir.equals("S")) {
            System.out.println("Tipo de Hamburguesa:\nS=Sencilla\nD=Doble\nT=Triple");   
            THamburguesa=lt.next().toUpperCase();
            if (THamburguesa.equals("S")) {
                System.out.println("Ingresar cantidad de Hambuguesas Sencillas");
                cS=cS+lt.nextInt();
            } else if(THamburguesa.equals("D")){
                System.out.println("Ingresar cantidad de Hambuguesas Dobles");
                cD=cD+lt.nextInt();
            } else if(THamburguesa.equals("T")){
                System.out.println("Ingresar cantidad de Hambuguesas Triples");
                cT=cT+lt.nextInt();
            } else { System.out.println("ERROR¡¡ no existe el tipo de hamburguesa");}
            System.out.println("Tiene mas hambuguesas que pedir?:\nS=Si\tN=No");
            seguir=String.valueOf(lt.next().toUpperCase().charAt(0));
        }
        System.out.println("Precio total de HAMBURGUESAS SIMPLES es:" +(costoS*cS));
        System.out.println("***************************************");
        System.out.println("Precio total de HAMBURGUESAS DOBLES es:" +(costoD*cD));
        System.out.println("***************************************");
        System.out.println("Precio total de HAMBURGUESAS TRIPLES es:" +(costoT*cT));
        System.out.println("---------------------------------------");
        PrecioFinal=(costoS*cS)+(costoD*cD)+(costoT*cT);
        System.out.println("El total a pagar es:" + PrecioFinal);
        System.out.println("---------------------------------------");
        impTC=PrecioFinal*0.05;
        totalTC=(costoS*cS)+(costoD*cD)+(costoT*cT)+impTC;
        System.out.println("CON TARJETA DE CREDITO ES:" +totalTC);
    }
    public static void main(String[] args) {
        BEMBOSHamburguesas();
    }
}