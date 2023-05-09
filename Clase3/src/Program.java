import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

	public static void main(String[] args) throws IOException {
		ejemloBufferedReader();
	}

}


