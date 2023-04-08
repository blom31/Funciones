/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática y 
deben devolver sus resultados para imprimirlos en el main. 
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opc, num1=0, num2=0, sum, res, mul, div;
       String resp;
        
        /*System.out.println("Ingrese dos números para operar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();*/
        
        do {
            
            System.out.println("Ingrese dos números para operar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
            System.out.println("  ** MENÚ **  ");
            System.out.println(" 1. SUMAR");
            System.out.println(" 2. RESTAR");
            System.out.println(" 3. MULTIPLICAR");
            System.out.println(" 4. DIVIDIR");
            System.out.println(" 5. SALIR");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("SUMA");
                   sum = sumar(num1,num2);
                    System.out.println("El resultado es " + sum);
                break;
                    
                case 2:
                    System.out.println("RESTA");
                    res = restar(num1,num2);
                    System.out.println("El resultado es " + res);
                break;
                    
                case 3:
                    System.out.println("MULTIPLCACIÓN");
                    mul = mult(num1, num2);
                    System.out.println("El resultado es " + mul);
                break;
                
                case 4:
                    System.out.println("DIVISIÓN");
                    div = divi(num1, num2);
                    System.out.println("El resultado es " + div );
                    
                break;    
                            
                case 5:
                    System.out.println("SALIR");
                    System.out.println("Está seguro que desea salir  S / N ?");
                    resp = leer.next();
                    if (resp.equalsIgnoreCase("S")) {
                        System.out.println("Adios");
                    } else {
                        opc = 1 ;
                    } 
            }  
        } while (opc <= 4) ;
        
    }
    

    public static int sumar(int num1, int num2) {

        int suma;

        suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta;

        resta = num2 - num1;
        return resta;
    }

    public static int mult(int num1, int num2) {
        int mult;

        mult = num1 * num2;
        return mult;
    }

    public static int divi(int num1, int num2) {
        int div;

        div = num1 / num2;
        return div;
    }

        
    }
