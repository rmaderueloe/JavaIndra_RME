package indra.talentCamp.relaciones;

import java.util.*;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import indra.talentCamp.relaciones.composite.*;
import org.mozilla.javascript.*;		// RHINO JAR

public class Program {

	public static void main(String[] args) {
		//2+2*3
		Operacion calculo = new Suma(
				new Valor(2),
				new Multiplicacion(new Valor(2), new Valor(3)));
		System.out.println("2+2*3= " + calculo.calcular());
		
		//6*5+3*8
		Operacion calculo2 = new Suma(
				new Multiplicacion(new Valor(6), new Valor(5)),
				new Multiplicacion(new Valor(3), new Valor(8)));
		System.out.println("6*5+3*8= " + calculo2.calcular());
		
		//5+(3*8)+(4*3)
		Operacion calculo3 = new Suma(5, new Suma( new Multiplicacion(3, 8), new Multiplicacion(4, 3)));
		System.out.println("5+(3*8)+(4*3)= " + calculo3.calcular());
		
		/*String expresion = "5+(3*8)+(4*3)";
		ScriptEngineManager manager = new ScriptEngineManager();   // factory
		ScriptEngine engine = manager.getEngineByName("");
		try {
			System.out.println(engine.eval(expresion));
		} catch (ScriptException e) {
			e.printStackTrace();
		}*/
		
		// ejecucion de javascript en java con libreria RHINO
		Context jsContext = Context.enter();
		String expresion = "5+(3*8)+(4*3)";
		try {
			// var (no es tipado)
			String resultado = jsContext.evaluateString(jsContext.initSafeStandardObjects(), expresion, "calculo", 1, null).toString();
			System.out.println(expresion + " = " + resultado);
		} finally {
			Context.exit();
		}
		
		
		//coleccion inmodificable
		List<String> names = new ArrayList<>();
		names.add("pepe");
		names.add("a");
		names.add("b");
		names = Collections.unmodifiableList(names);
		//names.add("c");		// error de insercion
		

	}

}
