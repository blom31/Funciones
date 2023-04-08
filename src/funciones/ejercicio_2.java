/* Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas 
por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al 
usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
                  
             datos();
    }
    
    public static void datos(){
        String name,resp;
        int edad;
        
        Scanner leer = new Scanner(System.in);
        do {
             System.out.println("Ingrese el nombre: ");
             name = leer.next();
             System.out.println("Ingrese su edad: ");
             edad = leer.nextInt();
             if (edad<17) {
                 System.out.println(name+" Es menor de edad");
                
            }else   {
                 System.out.println(name+" Mayor de edad");
             }
             System.out.println("Desea continuar? S/N");
             resp = leer.next();
        } while (resp.equalsIgnoreCase("s"));
       
            
        
        
       
    }
}
