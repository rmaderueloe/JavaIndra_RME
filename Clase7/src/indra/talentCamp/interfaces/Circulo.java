package indra.talentCamp.interfaces;

public class Circulo extends Figura{
	
	private double radio;

	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}

	@Override
	public double calcularPerimetro() {
		return Math.PI * 2 * this.radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", Area=" + calcularArea() + "]";
	}
}
