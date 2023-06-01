package indra.talentCamp.reflection.models;

public class SuperHeroe {
	private String name;
	private String hability;
	public int height;
	public double weight;
	
	public SuperHeroe() {
		
	}
	
	public String getHability() {
		return hability;
	}
	public void setHability(String hability) {
		this.hability = hability;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	
	public void deicrSuFrase() {
		System.out.println("El bien vencera siempre.");
	}
	
	public void buenaAccion() {
		System.out.println("Salvar gatito.");
	}
	
	public void saveTheWorld() {
		System.out.println("Salvar gatito.");
	}
	
}
