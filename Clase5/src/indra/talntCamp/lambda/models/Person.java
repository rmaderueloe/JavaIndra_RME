package indra.talntCamp.lambda.models;

public class Person {
	private String name;
	private int height;
	
	/**
	 * @param name
	 * @param height
	 */
	public Person(String name, int height) {
		super();
		this.name = name;
		//this.height = height;
		this.setHeight(height);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		//uso error para no estar obligado a capturar la excepcion o poner throws
		if (height < 0) throw new Error("No se puede medir menos de 0 cm.");
		if (height > 300) throw new Error("No se puede medir mas de 300 cm.");
		//assert(height < 0);
		//assert(height > 300);
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}

}
