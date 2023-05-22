package indra.talentCamp.diccionario;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
        // Crear el diccionario
        // Dividir el texto en palabras utilizando el método split()
        // Contar la ocurrencia de cada palabra
        // Mostrar la ocurrencia de cada palabra
		
        String txt = "hola rafa coche pepe auto auto rafa pepe pepe pepe agua";
        Map<String, Integer> countWords = new HashMap<>();
        String[] words = txt.split(" ");

        for (String word : words) {
            if (countWords.containsKey(word)) {
                int counter = countWords.get(word);
                countWords.put(word, counter + 1);
            } else {
            	countWords.put(word, 1);
            }
        }

        for (var entry : countWords.entrySet()) {	//Map.Entry<String, Integer> == var
            String word = entry.getKey();
            int amount = entry.getValue();
            System.out.println("Palabra: " + word + ", Cantidad: " + amount);
        }
	}
}
