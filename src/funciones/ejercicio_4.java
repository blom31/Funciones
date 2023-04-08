/*Crea una aplicación que nos pida un número por teclado y con una función se lo 
pasamos por parámetro para que nos indique si es o no un número primo, debe devolver
true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int num;
       boolean bandera;
       
        System.out.println("Ingrese un número para saber si es primo o no");
        num = leer.nextInt();
        
        bandera= primo(num);
        
        System.out.println("Es primo el número ingresado?  " + bandera);
    }
    public static boolean primo(int num){
        boolean primo= true;
        int i, cont=0;
        
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
                primo=false;
            }
        } 
        if (cont==2){
          primo=true;
        }
        return primo;
    }
}
