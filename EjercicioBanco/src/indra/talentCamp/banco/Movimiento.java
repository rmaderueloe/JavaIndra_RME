package indra.talentCamp.banco;

public abstract class Movimiento {
	
    protected double cantidad;

    public Movimiento(double cantidad) {
        this.cantidad = cantidad;
    }

	@Override
	public String toString() {
		return "Movimiento [cantidad=" + cantidad + ", Tipo Op.=" + 
				(getClass().getSimpleName().equals("Deposito")? "D" : "E") + "]\n";
	}

}
