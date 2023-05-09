package indra.utils;

import java.util.Scanner;

public class Consola {
	public static boolean esNumerico(String entrada) {
		//comprobar si el string ingresado es numerico
		try{
			int num = Integer.parseInt(entrada);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static int readInt(){
        // lea un entero de la entrada estandar
        // si el user ingresa otra cosa que no sea un numero se lo vuelve a preguntar
        // usar while...
        String numero = null;
        
    	@SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
    	
        while(!esNumerico(numero)) {
            System.out.println("Ingrese un numero");
            numero = in.nextLine();
        }
        
        return Integer.parseInt(numero);  
    }
	
	public static int readInt(String prompt){	//SOBRECARGA de metodo
        String numero = null;
        
    	@SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
    	
        while(!esNumerico(numero)) {
            System.out.println(prompt);
            numero = in.nextLine();
        }
        
        return Integer.parseInt(numero);  
    }
	
	public static boolean esPrimo(int numero) {
		  // El 0, 1 y 4 no son primos
		  if (numero == 0 || numero == 1 || numero == 4) {
		    return false;
		  }
		  for (int i = 2; i < numero / 2; i++) {
		    // Si es divisible por cualquiera de estos números, no
		    // es primo
		    if (numero % i == 0)
		      return false;
		  }
		  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
		  return true;
		}
}
