package indra.talentCamp.banco;

/*
Número de cuenta (único para cada cuenta)
Saldo disponible
Lista de movimientos (registro de todas las transacciones realizadas en la cuenta)
Cliente al que pertenece

depositar(): permite realizar un depósito en la cuenta.
 Debe recibir como parámetro la cantidad a depositar y actualizar el saldo disponible. 
 Además, debe registrar el movimiento en la lista de movimientos.
 
extraer(): permite realizar una extracción de la cuenta. 
Debe recibir como parámetro la cantidad a extraer y verificar si hay saldo suficiente. 
Si es así, debe actualizar el saldo y registrar el movimiento correspondiente en la lista de movimientos.
*/

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	
    protected String numeroCuenta;
	protected double saldoDisponible;
	protected List<Movimiento> movimientos;
    protected Cliente cliente;
    private static int CONTADOR = 0;

    CuentaBancaria(String numeroCuenta, double saldoDisponible, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoDisponible = saldoDisponible;
        this.cliente = cliente;
        movimientos = new ArrayList<>();
        CuentaBancaria.CONTADOR++;
    }

    public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public static int getCONTADOR() {
		return CONTADOR;
	}

	public static void setCONTADOR(int cONTADOR) {
		CONTADOR = cONTADOR;
	}
	
    public double getSaldo() {
		return saldoDisponible;
	}
    
    public void depositar(double cantidad) {
        saldoDisponible += cantidad;
        movimientos.add(new Deposito(cantidad));
    }
    
    //metodo a implementar
    public abstract void extraer(double cantidad) throws SaldoInsuficiente;

	@Override
	public String toString() {
		return "CuentaBancaria(" + CONTADOR + ") [numeroCuenta=" + numeroCuenta + ", saldoDisponible = " + saldoDisponible
				+ ", \n Movimientos = " + movimientos + ", cliente = " + cliente + "]";
	}

}
