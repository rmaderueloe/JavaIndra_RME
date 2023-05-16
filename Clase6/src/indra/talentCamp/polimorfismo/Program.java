package indra.talentCamp.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import indra.talentCamp.polimorfismo.models.*;

public class Program {

	public static void main(String[] args) {
		Guerrero kelsier = new Guerrero("Kelsier");  // declaracion con clase padre o hija 
		Player batman = new Guerrero("Batman");
		Player thanos = new Mago("Thanos");

		List<Player> players = new ArrayList<>();	
		players.add(kelsier);
		players.add(batman);
		players.add(thanos);
		
		//comienzo del turno
		System.out.println("Comienzo del turno!");
		System.out.println("--------------------");
		players.forEach(System.out::println);
		System.out.println("--------------------");
		
		//acciones
		batman.action(kelsier);
		thanos.action(batman);
		
		//fin del turno
		System.out.println("--------------------");
		players.forEach(System.out::println);
		System.out.println("--------------------");
		System.out.println("Reset de stats!");
		players.forEach(p -> p.endShift());
		System.out.println("--------------------");
		System.out.println("Fin del turno!");
		System.out.println("--------------------");
		System.out.println("Personajes con vida:");
		players.stream().filter(n -> n.isAlive()).forEach(System.out::println);
		
		// thanos.setXXX  no permitimos la llamada a los setter desde el main "PROTECTED METHOD"
	}

}
