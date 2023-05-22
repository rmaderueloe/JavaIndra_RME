package indra.talentCamp.banco;

public class CajaAhorro extends CuentaBancaria {
	
    public CajaAhorro(String numeroCuenta, double saldoDisponible, Cliente cliente) {
        super(numeroCuenta, saldoDisponible, cliente);
    }

    @Override
    public void extraer(double cantidad) throws SaldoInsuficiente {
        if (cantidad <= saldoDisponible) {
        	saldoDisponible = saldoDisponible - cantidad;
            movimientos.add(new Extraccion(cantidad));
        } else {
        	throw new SaldoInsuficiente();
        	//System.out.println("No hay saldo suficiente para realizar la extracción.");
        }
    }
}