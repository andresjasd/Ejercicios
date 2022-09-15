/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int num = leer.nextInt();
        System.out.println("El doble de su numero es:" + 2*num);
        System.out.println("El triple de su numero es: " + 3*num);
        System.out.println("La raiz cuadrada de su numero es " + Math.sqrt(num));
    }
    
}
