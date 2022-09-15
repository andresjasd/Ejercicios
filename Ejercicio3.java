/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la frase");
        String frase = leer.next();
        System.out.println("Su fase en mayuscula es:" +  frase.toUpperCase());
        System.out.println("Su fase en mayuscula es:" +  frase.toLowerCase());
    }
}

