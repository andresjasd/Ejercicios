/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package ejercicio.pkg6;

import java.util.Scanner;

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el numero");
        float numero = leer.nextFloat();
        if (numero%2==0){
            System.out.println("Su numero es par");
        }else{
            System.out.println("Su numero es impar");
        }
    }  
    
}
