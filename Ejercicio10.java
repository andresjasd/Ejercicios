/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Digite el limite de la suma");
      float max = leer.nextFloat();
       float sum;
       sum=0;
      do{
        System.out.println("Digite el numero a sumar");
        float num = leer.nextFloat();
        sum=sum+num;
      }while(sum<=max);
        System.out.println("Su suma fue:" + sum);
    }
    
}
