package pe.edu.upeu.blcp;


import pe.edu.upeu.blcp.examen.ResolucionDeExamen;
import pe.edu.upeu.blcp.utils.LeerTeclado;

public class MenuOpciones {

    ResolucionDeExamen blpc = new ResolucionDeExamen();
    LeerTeclado leerT = new LeerTeclado();

    public void menuPrincipal() {
        System.out.println("------------------------------------Elija una Opción------------------------------");
        int opciones = 4;
        String menu = "";
        menu += "1. ImpuestoVehiculos\n";
        menu += "2. Xen-->*\n";
        menu += "3. Primeros Numeros perfectos\n";
        menu += "4. Decimal a binario\n";
        System.out.println(menu);
        do {
            switch (opciones) {
                case 1:
                blpc.preguntaexamen02BLCP(); 
                   break;
                case 2:
                blpc.preguntaexamen03BLCP();
                   break;
                case 3: 
                blpc.preguntaexamen04BLCP();
                   break;
                case 4: 
                blpc.preguntaexamen05BLCP();
                   break;
                
    
                default: System.out.println("Opcion Invalida!"); break;
            }
            String continuar=leerT.leer("", "Desea Continuar? S=Si/N=No").charAt(0)=='S'?"S":"N";
            if (continuar.charAt(0)=='S') {
                opciones=leerT.leer(0, "Eliga una operacion:\n"+menu);
            }else{opciones=0;}
        } while (opciones != 0);
    }
}
