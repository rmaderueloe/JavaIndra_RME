import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Documented;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import indra.utils.Consola;

public class Program {
	
	public static void ejemloBufferedReader() throws IOException {
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

		try {
			System.out.println("Inserte su nombre y su edad:");
			String nombre = reader.readLine();
			String edad = reader.readLine();
			//int edadNum = Integer.parseInt(edad);
			System.out.println("Hola " + nombre + " y tu edad es " + edad);
		//} catch (IOException e) {
			//System.err.println(e.getMessage());
		} finally {
			//si hay una excepcion no se llega a ejecutar el cierre del bufferreader
			System.out.println("Asegurar que el cierre se realiza");
			reader.close();
		}
	}
	
	public static void ejemloBufferedReaderSinThrows() {
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

		try {
			System.out.println("Inserte su nombre y su edad:");
			String nombre = reader.readLine();
			String edad = reader.readLine();
			//int edadNum = Integer.parseInt(edad);
			System.out.println("Hola " + nombre + " y tu edad es " + edad);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			//si hay una excepcion no se llega a ejecutar el cierre del bufferreader
			System.out.println("Asegurar que el cierre se realiza");
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void ejemloScanner() {	//lanza runtimeException
		try (Scanner input = new Scanner(System.in)){ //similar a try ... finally con close
			System.out.println("Enter username");

			String userName = input.nextLine();  // Read user input
			int edad = input.nextInt();
			System.out.println("Username is: " + userName + " y tiene " + edad + " años.");  // Output user input
		} //implementa un close implicito
	}
	
	static final int CANTIDAD_OPORTUNIDADES = 5;
	static final int MAX_VALUE = 100;
	
	public static void juegoAdivinanzas() {
		Random r = new Random();
		int secreto = r.nextInt(1, MAX_VALUE);
		boolean adivino = false;
		int turnoActual = 1;

		System.out.println("Bienvenidos al juego. Tiene 5 oportunidades para adivinar el numero secreto.");

		while((!adivino) && (turnoActual <= CANTIDAD_OPORTUNIDADES)) {
			int adivinanza = Consola.readInt(turnoActual + " .Ingrese un numero");

			if (adivinanza < secreto) {
				System.out.println("MAL, es menor el numero ");
			} else if (adivinanza > secreto){
				System.out.println("MAL, es mayor el numero ");
			} else {
				System.out.println("Correcto!!");
				adivino = true;
			}

			if(!adivino) {
				System.err.println("lo siento, el nnumero secreto era: " + secreto);
			}

		}

	}
	
	public static void main(String[] args) throws IOException {
		//ejemloBufferedReader();
		//ejemloBufferedReaderSinThrows();
		//ejemloScanner();

		/*System.out.println("Ingrese un dato: ");
		Scanner in = new Scanner(System.in);
		String entrada = in.nextLine();
		if(esNumerico(entrada))
			System.out.println("OK");
		else
			System.out.println("KO");*/
		
		//int num = Consola.readInt();
		//System.out.println("Numero insertado: " + num);
		
		/*Random r = new Random();
		for (int i = 0; i < 5; i++) {
			int azar =r.nextInt(36, 42);
			System.out.println(azar);
		}*/
		
		// JUEGO ADIVINAR NUMERO 1-100
		/*Random numero = new Random();
		int intentos = Consola.readInt("Intentos para adivinarlo: ");
		int azar = numero.nextInt(1, 100);
		System.out.println("TRAMPA para probar:  " + azar);
		for (int i = 0; i < intentos; i++) {
			int posibleNum = Consola.readInt();
			if (posibleNum < azar) {
				System.out.println("MAL, es mayor el numero ");
			} else if (posibleNum > azar) {
				System.out.println("MAL, es menor el numero ");
			} else {
				System.out.println("Correcto!!");
				break;
			}
		}

		juegoAdivinanzas();*/
		

		if(Consola.esPrimo(5)) System.out.println("OK, es primo");
		else System.out.println("KO, no es primo");

	}
}


