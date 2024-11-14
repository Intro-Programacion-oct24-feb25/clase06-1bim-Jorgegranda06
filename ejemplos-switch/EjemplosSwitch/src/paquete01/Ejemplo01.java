/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();
        
        switch(cadena){
            case "Lunes":
            case "lunes":
            case "LuNes":
            case "luNes":
            case "LUNES":
                System.out.printf("%s", cadena);
                break;
            
            case "Martes":
            case "martes":
            case "MarTes":
            case "marTes":
            case "MARTES":
                System.out.printf("%s", cadena);
                break;
            
            case "Jueves":
            case "jueves":
            case "JueVes":
            case "jueVes":
            case "JUEVES":
                System.out.printf("%s", cadena);
                break;
            
            case "Miercoles":
            case "miercoles":
            case "MierColes":
            case "mierColes":
            case "MIERCOLES":
                System.out.printf("%s", cadena);
                break;
            
            case "Viernes":
            case "VIERNES":
            case "viernes":
            case "VierNes":
            case "vierNes":
                System.out.printf("%s", cadena);
                break;
            
            case "Sabado":
            case "sabado":
            case "SabaDo":
            case "sabaDo":
            case "SABADO":
                System.out.printf("%s", cadena);
                break;
                
            case "Domingo":
            case "domingo":
            case "DoMingo":
            case "domiNgo":
            case "DOMINGO":

                System.out.printf("%s, es el séptimo día "
                        + "de la semana", cadena);
                break;
                
            default:
                System.out.println("ninguna de las anteriores");
                break;
        }
        
    }
}
