package course.java.talentCamp;

import java.util.ArrayList;  // ctrl  + shift + O
import java.util.Iterator;
import java.util.List;

//import java.util.*;

public class Program {
	
	public static void cambiarValor(int n) {				//no cambia
		n = 20;
	}
	
	public static void cambiarRectangulo(Rectangulo rec) { 	//si cambia
		rec.setBase(30);
	}
	
	public static void main(String[] args) {
		System.out.println("Bienvenido a la clase 2.\n");
		
		int altura = 10;
		int base = 20;
		
		//num = base;
		
		System.out.println(altura);
		
		Rectangulo r = new Rectangulo(base, altura);
		Rectangulo r2 = new Rectangulo(base, altura);
		System.out.println(r.toString());
		//System.out.println(r2.getAltura());
		
		r = r2;
		r2.setBase(444);

		System.out.println("Cambia la base al cambiar la referencia: " + r.getBase()+"\n");
		
		//System.gc(); //garbage collector
		
		int a = 555;
		cambiarValor(a);
		System.out.println(a);
		
		r.setBase(888);
		cambiarRectangulo(r);
		System.out.println(r.getBase()+"\n");

		List<String> names = new ArrayList<String>();
		names.add("rafa");
		names.add("pepe");
		names.add("manolo");
		names.add("wessal");
		names.add("paco");
		
		String jedi = null;
		
		for (int i = 0; i < names.size(); i++) {
			jedi = names.get(i);
			System.out.println(jedi);
		}
		
		/*for (String jedi2 : names) {
			
		}*/
	}
}
