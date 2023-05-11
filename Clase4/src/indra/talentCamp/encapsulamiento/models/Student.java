package indra.talentCamp.encapsulamiento.models;

public class Student extends Person{
	
	private boolean prefFront;
	
	/**
	 * @param name
	 * @param doc
	 * @param address
	 * @param prefFront
	 */
	public Student(String name, String doc, String address) {
		super(name, doc, address);
		this.prefFront = false;
	}
	
	public Student(String name, String doc, String address, boolean prefFront) {
		super(name, doc, address);
		this.prefFront = prefFront;
	}

	public boolean getPrefFront() {
		return prefFront;
	}

	public void setPrefFront(boolean prefFront) {
		this.prefFront = prefFront;
	}

	@Override
	public String toString() {
		//return "Student [prefFront=" + prefFront + ", getName()=" + getName() 
			//	+ ", getDoc()=" + getDoc() + ", getAddress()=" + getAddress() + "]";
		return String.format("Datos: \n %s %s %s %b",
				getName(),
				getDoc(),
				getAddress(),
				getPrefFront());
	}
	
}
