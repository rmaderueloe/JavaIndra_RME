package indra.talentCamp.banco;

import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente1 = new Cliente("John Doe", "12345");
        CajaAhorro cajaAhorro1 = new CajaAhorro("CA001", 1000.0, cliente1);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("CC001", 2000.0, 1000.0, cliente1);

        banco.agregarCuenta(cajaAhorro1);
        banco.agregarCuenta(cuentaCorriente1);

        cajaAhorro1.depositar(5000.0);
        cajaAhorro1.extraer(2500.0);

        cuentaCorriente1.depositar(8888.75);
        cuentaCorriente1.extraer(8888.76);

        banco.mostrarCuentas();
    }
}

