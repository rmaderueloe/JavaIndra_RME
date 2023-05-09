
public class Program {

	public static void main(String[] args) {
		System.out.println("Hola mundo!"); 
		System.out.println();  //Syso + (ctrl + barra espacio)
		System.out.println("Syso + (ctrl + barra espacio)");

		//DATOS PRIMITIVOS
		
		int num_entero = 20;
		
		double medio = 0.5;
		System.out.println(medio);
		
		boolean verdadero = true;
		System.out.println(verdadero);
		
		// DATOS OBJETOS (peticion memoria implicita) (new)
		
		String name = "rafael";
		System.out.println(name);
		
		@SuppressWarnings("removal")
		Integer num2 = new Integer (2);
		System.out.println(num2);
		
		System.out.println(num2 + 4);
		System.out.println(Integer.toString(num2) + 4 +"\n");
		
		// CAST (fuertemente tipado)
		//num_entero = (int) medio;   // explicit (cast)
		//medio = num_entero;			// implicit
		
		String enLetras = Integer.toString(num_entero);
		System.out.printf("bla bla %s \n", enLetras); 	//string
		System.out.printf("bla bla %d \n", num_entero);	//integer
		
		enLetras = "22";
		System.out.println(Integer.parseInt(enLetras));
		System.out.println();
		
		//Captura de excepciones
		
		try {
			enLetras = "22Ed";
			System.out.println(Integer.parseInt(enLetras));
		} catch (Exception e) {
			System.out.println("Exception: " + e.toString() + "\nNo se puedo hacer la conversion de " + enLetras + " a 'int' \n");
		}
		
		// Cnvertir string en una variable flotante (float)

		try {
			enLetras = "22.44";
			Float num_float = Float.parseFloat(enLetras);  //Double.valueOf(enLetras)
			System.out.println(num_float);
		} catch (Exception e) {
			System.out.println("Exception: " + e.toString() + "\nNo se puedo hacer la conversion de " + enLetras + " a 'float' \n");
		}
	
	}

}
