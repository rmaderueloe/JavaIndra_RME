package indra.talentCamp.dependencyInjection;

import indra.talentCamp.dependencyInjection.contructor.ConstructorInjectionDemo;
import indra.talentCamp.dependencyInjection.field.FieldInjectionDemo;
import indra.talentCamp.dependencyInjection.ioc.IocInjectionDemo;
import indra.talentCamp.dependencyInjection.reflection.ReflectionInjectionDemo;
import indra.talentCamp.dependencyInjection.reflection.ReflectionInjectionDemo2;

public class App {

	public static void main(String[] args) {
		System.out.println("Constructor");
		ConstructorInjectionDemo.aTodoGas();
		System.out.println("\nField");
		FieldInjectionDemo.aTodoGas();
		System.out.println("\nReflection");
		ReflectionInjectionDemo.aTodoGas();
		System.out.println("\nReflection2");
		ReflectionInjectionDemo2.aTodoGas();
		System.out.println("\nIOC");
		IocInjectionDemo.aTodoGas();
	}

}
