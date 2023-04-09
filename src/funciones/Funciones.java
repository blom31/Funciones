/*
 * EJEMPLO DE FUNCIONES
 */
package funciones;    


/**
 *
 * @author blom3
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int retorno, num1=5 , num2=7;
        
        retorno = sumar(num1,num2);
        System.out.println("La suma de los dos números es: " + retorno);
    }
        public static int sumar(int num1, int num2){
            int suma;
            
            suma = num1+ num2;
            return suma;
            
        }
        
    }
    

