package indra.talentCamp.encapsulamiento.models;

public class Person {
	private String name;
	private String doc;
	private String address;
	/**
	 * @param name
	 * @param doc
	 * @param address
	 */
	public Person(String name, String doc, String address) {
		super();
		this.name = name;
		this.doc = doc;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
