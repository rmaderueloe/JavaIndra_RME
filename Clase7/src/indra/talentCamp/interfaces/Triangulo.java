package indra.talentCamp.interfaces;

public class Triangulo extends Figura{
	
	private double base, altura;
	private double lado1, lado2;

	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(double base, double altura, double lado1, double lado2) {
		super();
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	@Override
	public double calcularArea() {
		return (this.base * this.altura)/2;
	}

	@Override
	public double calcularPerimetro() {
		return lado1 + lado2 + base;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}

}
