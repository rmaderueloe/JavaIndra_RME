package indra.talentCamp.banco;

import java.time.LocalDate;

public abstract class Movimiento {
	
    protected double cantidad;
    private LocalDate fecha;

    public Movimiento(double cantidad) {
        this.cantidad = cantidad;
        this.fecha = LocalDate.now();
    }

	@Override
	public String toString() {
		return "Movimiento [cantidad=" + cantidad + ", Tipo Op.=" + 
				(getClass().getSimpleName().equals("Deposito")? "D" : "E") + "]\n";
	}

}
