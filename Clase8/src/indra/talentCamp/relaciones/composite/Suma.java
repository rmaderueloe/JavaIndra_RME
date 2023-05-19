package indra.talentCamp.relaciones.composite;

public class Suma extends OperacionBinaria {

	public Suma(Operacion operandoIzq, Operacion operandoDer) {
		super(operandoIzq, operandoDer);
	}

	public Suma(double operandoIzq, double operandoDer) {
		super(operandoIzq, operandoDer);
	}

	public Suma(double operandoIzq, Operacion operandoDer) {
		super(operandoIzq, operandoDer);
	}

	public Suma(Operacion operandoIzq, double operandoDer) {
		super(operandoIzq, operandoDer);
	}

	@Override
	public double calcular() {
		return this.operandoDer.calcular() + this.operandoIzq.calcular();
	}

}
