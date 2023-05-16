package indra.talntCamp.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import indra.talntCamp.lambda.models.Person;

public class Program {

	public static void main(String[] args) {
		String frase = "Que la fuerza " + "te acompañe."; // 3 strings en memoria
		String frase2 = "Que la fuerza";
		frase2 += " te";
		frase2 += " acompañe.";
		System.out.println(frase);
		System.out.println(frase2);
		
		StringBuilder builder = new StringBuilder();
		builder.append("Que la fuerza");
		builder.append(" este");
		builder.append(" contigo.\n");
		System.out.println(builder.toString());
		
		List<Person> jedis = new ArrayList<>();
		//List<Person> jedis2 = new LinkedList<>();
		jedis.add(new Person("Annakin", 178));
		jedis.add(new Person("Yoda", 80));
		jedis.add(new Person("Asoka", 165));
		jedis.add(new Person("Wessal", 169));
		
		List<Person> jedis3 = Arrays.asList(
				new Person("Annakin", 178),
				new Person("Yoda", 80),
				new Person("Asoka", 165),
				new Person("Luke", 169));
		
		//for (Person jedi : jedis3) {
		//	System.out.println(jedi.getName());
		//}
		
		//LAMBDA EXPRESSION
		//jedis.forEach(jedi -> System.out.println(jedi.toString()));
		jedis.forEach(System.out::println);
		
		List<Integer> numeros = Arrays.asList(4,5,6,7,8,45,3,56);
		
		int max = 0;
		for (int numero: numeros) {
			//if(numero > max) {
			if (Integer.compare(numero, max) > 0) {
				max = numero;
			}
		}
		System.out.println("Max: " + max);
		
		Optional<Integer> maximo = numeros.stream().max(Integer::compareTo);
		
		int maximoV2 = numeros.stream()
	            .mapToInt(Integer::intValue)
	            .max()
	            .orElse(0);  //(Integer.MIN_VALUE);
		
		int maximoV3 = numeros.stream().max((a,b) -> Integer.compare(a, b)).orElse(0);
		
		System.out.println("Version1: " + maximo);
		System.out.println("Version2: " + maximoV2);
		System.out.println("Version3: " + maximoV3);

		//int jediMasAlto = jedis3.stream().max((a, b) -> Integer.compare(a, b)).orElse(0);
		//Person jediMasAlto = jedis3.stream().max((a,b) -> Comparator.comparingInt(Person::getHeight)).orElse(null);
		System.out.println(jedis3.stream().max((a,b) -> Integer.compare(a.getHeight(), b.getHeight())));
		
		//sumatoria de los numero de un array
		List<Integer> numbers = Arrays.asList(4,5,6,7,8,45,3,56);
		
		int suma = 0;
        for(int num: numbers) {
        	suma += num;
        }
        System.out.println(suma);
        System.out.println("suma: " + numbers.stream().mapToInt(n -> n).sum());
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
        System.out.println("count: " + numbers.stream().mapToInt(Integer::intValue).count());
        
        //sumatoria altura de jedis
        System.out.println(jedis3.stream().mapToInt(jedi -> jedi.getHeight()).sum());
        
        // referencia a la clase para simplificar
        System.out.println("suma de las alturas:" + jedis3.stream().mapToInt(Person::getHeight).sum());	
        System.out.println("media de las alturas:" + jedis3.stream().mapToInt(Person::getHeight).average().orElse(0));
        
        /*int sumatorio = 0;
        for(int num: numeros) {
            sumatorio += num;
        }
        int media = sumatorio / numeros.size();
        */
        System.out.println("media numeros: " + numbers.stream().mapToDouble(n -> n).average().orElse(0));	
        System.out.printf("media numeros: %.1f", numbers.stream().mapToDouble(n -> n).average().orElse(0));	
        System.out.println("\n");
        
        //FILTER
        System.out.println("numeros >> 100: " + numbers.stream().filter(n -> n > 100).collect(Collectors.toList()));
        //System.out.println("\n");
        numbers.stream().filter(n -> n > 100).forEach(System.out::println);
        
        List<Person> jedisAltos = jedis3.stream().filter(jedi -> jedi.getHeight() > 100).collect(Collectors.toList());
        jedisAltos.forEach(System.out::println);
        
        //MAP
        //numbers.stream().map(n -> n*2).forEach(System.out::println);
        
        //jedis3.stream().map(jedi -> jedi.getHeight()).forEach(System.out::println);
        List<Integer> jedisAlistDeInt = jedis3.stream().map(jedi -> jedi.getHeight()).collect(Collectors.toList());
        jedisAlistDeInt.forEach(System.out::println);
        //jedis3.stream().mapToInt(jedi -> jedi.getHeight()).forEach(System.out::println);
        
        // REDUCE
        int suma2 = numbers.stream().reduce(0,(acumulado, valorActual) -> acumulado+valorActual);
        System.out.println(suma2);
	}

}



























