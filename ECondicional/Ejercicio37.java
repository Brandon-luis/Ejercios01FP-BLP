package ECondicional;

import java.util.Scanner;

/**
 * Ejercicio37
 */
public class Ejercicio37 {
    static Scanner lt=new Scanner(System.in);

    public static void maín (String[] args) {
    //Declarar variable
    int edad;
    double promedio;
    String resBeca;
    //Datos de Entrada
    System.out.println("Ingrese la edad");
    edad=lt.nextInt();
    System.out.println("Ingrese la edad");
    promedio=lt.nextDouble();
    //Proceso
    lf (edad>18) {
        if (promedio>18) {
            resBeca="Le corresponde el monto de s/ 2000";
        }else if (promedio>15){
            resBeca="Le corresponde el mnto de s/ 1000";         
        }else if (promedio<15) && promedio>=12){
            resBeca="Le corresponde el monto de s/ 500";
        }else {
            resBeca="Enviar una carta para que estudie";
            }
        }else {
            if(promedio>=18){
                resBeca="Le corrsponde el monto de s/ 3000";
            }else if(promedio<18 && promedio>=16){
                resBeca="Le corresponde el monto de S/ 2000";
            }else if(promedio<16 && promedio>=12){
                resBeca="Le corresponde el monto de S/ 100";
            }else{
                resBeca="Enviar una carta para que estudie";
            }
        }
        //Datos de Salida
        System.out.println(resBeca);    
