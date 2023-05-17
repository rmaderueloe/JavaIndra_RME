import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		//Dada una lista de objetos Estudiante con propiedades de nombre y calificación,
		//utiliza una expresión lambda para obtener todos los estudiantes 
		//que tienen una calificación superior a 90.
		List<Estudiante> estudiantes = new ArrayList<>();
		estudiantes.add(new Estudiante("Juan", 85));
		estudiantes.add(new Estudiante("María", 95));
		estudiantes.add(new Estudiante("Carlos", 92));
		estudiantes.add(new Estudiante("Ana", 88));
		estudiantes.add(new Estudiante("Pedro", 98));

		List<Estudiante> estudiantesConCalificacionSuperiorA90 = estudiantes.stream()
                .filter(estudiante -> estudiante.getCalificacion() > 90)
                .toList();

        System.out.println(estudiantesConCalificacionSuperiorA90);
        
        
        //Dado un arreglo de enteros, utiliza una expresión lambda para encontrar el número más grande.
		List<Integer> numeros = Arrays.asList(4,5,6,7,8,45,3,56);
		Optional<Integer> maximo = numeros.stream().max(Integer::compareTo);
		
		//Dada una lista de números enteros, utiliza una expresión lambda
		//para obtener la suma de todos los números pares.
		int sumaNumerosPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
		System.out.println("La suma de los números pares es: " + sumaNumerosPares);
		
		//Dada una lista de objetos Producto con propiedades de nombre y precio,
		//utiliza una expresión lambda para obtener el producto más caro.
		
		
	}
}



