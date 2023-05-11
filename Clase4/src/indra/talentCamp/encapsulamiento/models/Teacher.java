package indra.talentCamp.encapsulamiento.models;

public class Teacher extends Person{
	
	private String prefLanguage;
	
	/**
	 * @param name
	 * @param doc
	 * @param address
	 * @param prefLanguage
	 */
	
	public Teacher(String name, String doc, String address) {
		super(name, doc, address);
		this.prefLanguage = "Java";
	}
	
	public Teacher(String name, String doc, String address, String prefLanguage) {
		super(name, doc, address);
		this.prefLanguage = prefLanguage;
	}

	public String getPrefLanguage() {
		return prefLanguage;
	}

	public void setPrefLanguage(String prefLanguage) {
		this.prefLanguage = prefLanguage;
	}

	@Override
	public String toString() {
		return "Teacher [prefLanguage=" + prefLanguage + ", getName()=" + getName() + ", getDoc()=" + getDoc()
				+ ", getAddress()=" + getAddress() + "]";
	}
	
	

}
