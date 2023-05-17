package indra.talentCamp.interfaces;

import java.util.*;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		// lista definida por interfaz de Area
		List<Area> figuras = Arrays.asList(
				new Circulo(10.0),
				new Triangulo(12.0, 11.0, 11.0, 13.0),
				new Rectangulo(4.5, 5.0), 
				new Planta());
		
		System.out.println("El area total de las figuras es: ");
		System.out.printf("%.2f\n",figuras.stream().mapToDouble(fig -> fig.calcularArea()).sum());
		
		System.out.println("El perimetro total de las figuras es: ");
		//System.out.printf("%.2f\n",figuras.stream().mapToDouble(fig -> fig.calcularPerimetro()).sum());
		System.out.println("Las figuras con un area menor de 200: ");
		figuras.stream().filter(f -> f.calcularArea() < 200).forEach(System.out::println);
		
		System.out.println("Casteos: ");
		double perimetroTotal = 0.0;
		
		for (Area a : figuras) {
			if (Perimetro.class.isInstance(a)){   //(a instanceof Perimetro) {
				perimetroTotal += ((Perimetro)a).calcularPerimetro();
				//perimetroTotal += Perimetro.class.cast(a).calcularPerimetro();
			}
		}
		System.out.println("Perimetro total: " + perimetroTotal);
		
		double lambdaPerimetro = figuras.stream()
			.filter(Perimetro.class::isInstance)
			.map(Perimetro.class::cast)
			.mapToDouble(p -> p.calcularPerimetro()).sum();
		System.out.printf("Perimetro total (lambda): %.2f\n", lambdaPerimetro);
		
		List<Figura> listaFiguras = figuras.stream().filter(Figura.class::isInstance)
				.map(Figura.class::cast)
				.collect(Collectors.toList());
		
		System.out.println("tipo: " + listaFiguras.getClass());
		
		// implementar interfax comparable de la clase figura para ordenar
		Collections.sort(listaFiguras);
		listaFiguras.forEach(System.out::println);
	}
	
}
