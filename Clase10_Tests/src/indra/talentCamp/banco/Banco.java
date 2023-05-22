package indra.talentCamp.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
    private List<CuentaBancaria> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
        Collections.unmodifiableList(cuentas);
    }
    
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

	public void mostrarCuentas() {
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }
}
