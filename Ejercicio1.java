/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author famil
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Escriba el Segundo numero");
        int num2 = leer.nextInt();
        System.out.println("La suma de los dos numero es: " + (num2+num1) );
    }
}
