package indra.talentCamp.banco;

/*
 * Las CuentaCorrientes permiten saldo en descubierto 
 * y tener un saldo negativo hasta cierto punto 
 * y las cajas de ahorro no.  (cambia el extraer)
*/

public class CuentaCorriente extends CuentaBancaria {
	
    private double saldoDescubierto;

    public CuentaCorriente(String numeroCuenta, double saldoDisponible, double saldoDescubierto, Cliente cliente) {
        super(numeroCuenta, saldoDisponible, cliente);
        this.saldoDescubierto = saldoDescubierto;
    }

    @Override
    public void extraer(double cantidad) {
        if (cantidad <= saldoDisponible + saldoDescubierto) {
            saldoDisponible = saldoDisponible - cantidad;
            movimientos.add(new Extraccion(cantidad));
        } else {
            System.out.println("No hay saldo suficiente para realizar la extracción.");
        }
    }
}
