package EXAMENPARCIAL;

import java.util.Scanner;
/**
 * Ejercicio01-02-03-04BLPC
 */

public class Pregunta04BLPC {
    static Scanner lt=new Scanner(System.in);
    public static void pregunta03BLPC() {
        //Variables
        double n1, n2, p, r;
        System.out.println("Ingrese el primer valor");
        n1=lt.nextInt();
        System.out.println("Ingrese el segundo valor (Para hallar el modulo 2do valor no cuenta)");
        n2=lt.nextInt();
        System.out.println("Ingrese el signo");
        char operador=lt.next().charAt(0);
        p=Math.pow(n1, n1);
        r=Math.sqrt(n1);

        //Proceso 

        switch (operador) {
            case '+': System.out.println(n1+n2);  break;
            case '-': System.out.println(n1-n2);  break;
            case '*': System.out.println(n1*n2);  break;
            case '/': System.out.println(n1/n2);  break;
            case 'p': System.out.println(+p);  break;
            case 'R': System.out.println(+r);  break;
            case '%': System.out.println(n1%2);  break;
           default: break;
        }
    }
    public static void pregunta02BLPC() {
        //Variables
       
        double mb, descuento, IT;

        System.out.println("Ingresar Monto Base");
        mb=lt.nextDouble();
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("+ El Descuento Dependiento Del monto con IGV");

        //Proceso
        double MBIGV = (mb * 18)/100;
        double IGV = (mb + MBIGV);

        if (IGV>2000) {
            descuento=IGV*10/100; 
        } else if(IGV<=2000 && IGV>1000){
            descuento=IGV*5/100;
        } else if(IGV<=1000 && IGV>500){
            descuento=IGV*2/100;
        } else {
            descuento=IGV*0;
        }
        if (IGV>2000){
            IT = (mb - IGV*10/100);
        } else if(IGV<=2000 && IGV>1000){
            IT = (mb - IGV*5/100);
        } else if(IGV<=1000 && IGV>500){
            IT = (mb- IGV*2/100);
        } else {
            IT = (mb + IGV - descuento);
        }
        
        //Datos de Salida
        System.out.println("El descuento es:"+descuento);
        System.out.println("El importe Total es:"+IT);
        System.out.println("El IGV:"+MBIGV);
    }
    public static void pregunta01BLPC() {
        //Variables

        String EstudianteNv;
        double ECres, EPres, TPres; 
        
        System.out.println("Ingrese la nota del Examen de Conocimiento");
        ECres=lt.nextDouble();
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese la nota de la Entrevista Personal");
        EPres=lt.nextDouble();
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese la nota del Test Psicologico");
        TPres=lt.nextDouble();
        
    
        //Proceso

        double ECpuntuacion = (ECres * 40)/100;
        double EPpuntuacion = (EPres * 35)/100;
        double TPpuntuacion = (TPres * 25)/100;
        double promedio = (ECpuntuacion + EPpuntuacion + TPpuntuacion);

        if (promedio>=17 && promedio<=20) {
            EstudianteNv="Su nivel es 4";
        } else if(promedio<17 && promedio>=14){
            EstudianteNv="Su nivel es 3";
        } else if(promedio<14 && promedio>=11){
            EstudianteNv="Su nivel es 2";
        } else if(promedio<11){
            EstudianteNv="No obtiene vacante porque su nivel es 1";
        } else {
            EstudianteNv="Ingrese notas en la escala vigesimal";
        }
        // Datos de Salida
        System.out.println(EstudianteNv);
    }
    public static void pregunta04BLPC() {
        //Variables
          int edad;
          String g;
          String c; 
          //Datos de Entrada
          System.out.print("Ingrese la edad:");
          edad=lt.nextInt();
          System.out.println("----------------------------------------------------");
          System.out.println("Ingrese el genero (F=femenino y M=masculino)");
          g=lt.next();
          //Proceso
          if (g=="M") {
              System.out.println("Eres un hombre");
          } else if(g=="F"){
              System.out.println("Eres una mujer");
          }
          if (edad>69) {
              c="Se le aplica la vacuna C";
          } else if(edad>16 && edad<69){
              c="Se le aplica  la vacuna  B"; 
          } else if(edad>16 && edad<70){
              c="Se le aplica  la vacuna  A";
          } else {
              c="Se le aplica  la vacuna A";
          }    
          //Datos de Salida 
          System.out.println(c);
        
    }
    
    public static void main(String[] args) {
        System.out.println("Ingrese la pregunta");
            int pregunta = lt.nextInt();
            switch (pregunta) {
              case 1:
                pregunta01BLPC(); break;
              case 2:
                pregunta02BLPC(); break;
              case 3:
                pregunta03BLPC(); break;  
              case 4:
                pregunta04BLPC(); break;          
            }      
    }
}
