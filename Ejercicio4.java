/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio.pkg4;

import java.util.Scanner;

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la cantidad de grados centigrados"); 
        float grados = leer.nextFloat();
        System.out.println("Sus grados en Farenheit son:" + (32+(9*grados/5))+"°F");
    }
    
}
