/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado
a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y 
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        convertidor();
    }
    
    public static void convertidor(){
        
        Scanner leer = new Scanner(System.in);
        int euros, resp;
       double cambio, libras = 0.86, dolar = 1.28611, yen = 129.852 ;
        
        System.out.print("Ingrese la cantidad de Euros a convertir: ");
        euros = leer.nextInt();
        
        System.out.println("A qué divisa desea hacer la  conversión");
        System.out.println("1. LIBRAS ");
        System.out.println("2. DÓLAR ");
        System.out.println("3. YEN ");
        
        resp = leer.nextInt();
        
        switch (resp) {
            case 1:
                    cambio=euros*libras;
                    System.out.println("El cambio es de "+ cambio + " €");                    
                break;
            case 2:
                cambio=euros*dolar;
                System.out.println("El cambio es de "+ cambio + " €");
                break;
            default:    
                cambio=euros*yen;
                System.out.println("El cambio es de "+ cambio + " €");
                
        }
    }
}
