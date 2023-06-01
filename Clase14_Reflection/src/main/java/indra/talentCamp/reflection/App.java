package indra.talentCamp.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.Scanner;

public class App {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException {
		try (Scanner in = new Scanner(System.in)) {
			Class<?> clazz = null;
			boolean claseEncontrada = false;
			while (!claseEncontrada) {
				System.out.println("Ingrese el nombre completo de la clase: ");
				String className = in.nextLine();
				try {
					clazz = Class.forName(className);
					claseEncontrada = true;
				} catch (Exception e) {
					System.out.println("Clase no encontrada. Vuelva a intentar.");
				}
			}
			System.out.println("Los atributos de la clase son: ");
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				System.out.format("%s %s: %s", Modifier.toString(field.getModifiers()), field.getName(),
						field.getType().getName());
				System.out.println(" ");
			}

			System.out.println("\nLos metodos de la clase son: ");
			// Method[] methods = clazz.getDeclaredMethods();
			List<Method> methods = Arrays.asList(clazz.getDeclaredMethods());
			// filtrado de setters and getters
			methods = methods.stream().filter(m -> !m.getName().startsWith("set") && !m.getName().startsWith("get"))
					.toList();

			for (Method method : methods) {
				System.out.format("%s %s: %s", Modifier.toString(method.getModifiers()), method.getName(),
						method.getReturnType().getName().toUpperCase());
				System.out.println(" ");
			}

			System.out.println("\nInstanciando un objeto de ese tipo: ");
			Object obj = clazz.getConstructors()[0].newInstance();
			System.out.println("\nObjetos instanciados. ");
			
			//Modificacion de atributo con reflection y romper encapsulamiento

			System.out.println("\nDesea modificar algun atributo? ");
			String modifyAttr = in.nextLine();

			while (modifyAttr.equalsIgnoreCase("S")) {
				boolean atributoEncontrado = false;
				while (atributoEncontrado == false) {
					System.out.println("\nQue atributo desea modificar?. ");
					String attr = in.nextLine();
					try {
						Field field = clazz.getDeclaredField(attr);
						System.out.println("\nInserte el nuevo valor: ");
						String valor = in.nextLine();
						field.setAccessible(true);
						field.set(obj, valor);
						atributoEncontrado = true;
					} catch (NoSuchFieldException e) {
						System.out.println("Intentelo de nuevo!");
					} catch (SecurityException e) {
						e.printStackTrace();
					}
				}
				System.out.println("\nGracias!");
				System.out.println("\nDesea modificar algun otro atributo? ");
				modifyAttr = in.nextLine();
			}
			
			System.out.println("Los valores de los atributos de la clase son: ");
			for (Field field : fields) {
				field.setAccessible(true);	// name = romper encapsulamiento
				System.out.format("%s: %s", 
						field.getName(),
						field.get(obj));
				System.out.println(" ");
			}

			// Invocacion de metodo con reflection

			System.out.println("\nDesea mostrar algun metodo ");
			String modifyMethod = in.nextLine();

			while (modifyMethod.equalsIgnoreCase("S")) {
				System.out.println("\nQue metodo desea modificar?. ");
				String nameMethod = in.nextLine();
				try {
					Method method = clazz.getDeclaredMethod(nameMethod);
					method.invoke(obj);
				} catch (Exception e) {
					System.out.println("Intentelo de nuevo!");
				}
			}
			System.out.println("\nGracias!");
			System.out.println("\nDesea modificar algun otro metodo? ");
			modifyMethod = in.nextLine();
		}
	}
}
