package indra.talentCamp.relaciones.composite;

public abstract class OperacionBinaria extends Operacion{
	
	protected Operacion operandoIzq;
	protected Operacion operandoDer;
	/**
	 * @param operandoIzq
	 * @param operacionDer
	 */
	
	// SOBRECARGA DE CONSTRUCTORES
	public OperacionBinaria(Operacion operandoIzq, Operacion operandoDer) {
		super();
		this.operandoIzq = operandoIzq;
		this.operandoDer = operandoDer;
	}
	
	public OperacionBinaria(double operandoIzq, double operandoDer) {
		super();
		this.operandoIzq = new Valor(operandoIzq);
		this.operandoDer = new Valor(operandoDer);
	}
	
	public OperacionBinaria(Operacion operandoIzq, double operandoDer) {
		super();
		this.operandoIzq = operandoIzq;
		this.operandoDer = new Valor(operandoDer);
	}
	
	public OperacionBinaria(double operandoIzq, Operacion operandoDer) {
		super();
		this.operandoIzq = new Valor(operandoIzq);
		this.operandoDer = operandoDer;
	}
	
	
}
