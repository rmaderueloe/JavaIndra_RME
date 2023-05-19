package indra.talentCamp.relaciones.composite;

public class Multiplicacion  extends OperacionBinaria{

	public Multiplicacion(double operandoIzq, double operandoDer) {
		super(operandoIzq, operandoDer);
	}

	public Multiplicacion(double operandoIzq, Operacion operandoDer) {
		super(operandoIzq, operandoDer);
	}

	public Multiplicacion(Operacion operandoIzq, double operandoDer) {
		super(operandoIzq, operandoDer);
	}

	public Multiplicacion(Operacion operandoIzq, Operacion operandoDer) {
		super(operandoIzq, operandoDer);
	}
	
	@Override
	public double calcular() {
		return this.operandoDer.calcular() * this.operandoIzq.calcular();
	}

}
