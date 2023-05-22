package indra.talentCamp.banco;

public class SaldoInsuficiente extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficiente() {
		super("No posee saldo para realizar la operacion");
	}

}
