package indra.talentCamp.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import indra.talentCamp.banco.*;

class CuentaBancariaTest {
	
	Banco banco;
	Cliente c;
	
	@BeforeEach
	public void before() {
		banco = new Banco();
		
		c = Cliente.builder()
				.setNombre("Rafael")
				.setNumeroIdentificacion("123")
				.build();
	}

	@Test
	void testAutoIncrementCuentaCorriente() {  		// variable estatica OK el funcionamiento asignar a otra variable 							
													// en la clase si se quiere usar el valor
		// instanciar las clases hijas directamente
		// CuentaBancaria cuenta1 = new CuentaBancaria("CA001", 1000.0, c);
        CajaAhorro cajaAhorro = new CajaAhorro("CA001", 1000.0, c);
        //assertEquals(1, CuentaBancaria.getCONTADOR());
        CuentaCorriente cuentaCorriente = new CuentaCorriente("CC001", 2000.0, 1000.0, c);
        //assertEquals(2, CuentaBancaria.getCONTADOR(), "La cuenta dos no tiene numero 2");
        //System.out.println(CuentaBancaria.getCONTADOR());
        //assertTrue(CuentaBancaria.getCONTADOR() == CuentaBancaria.getCONTADOR(), "ERROR");   
	}
	
	
	@Test
	void testExtraccionCajaDeAhorro() {
        CajaAhorro cajaAhorro = new CajaAhorro("CA001", 1000.0, c);
        cajaAhorro.depositar(500);
        
        assertTrue(cajaAhorro.getSaldo() > 0);
        //assertThrows(SaldoInsuficiente.class, ()->cajaAhorro.extraer(200));
        
	}
	 
	@Test
	void testExtraccionCorrecta() throws SaldoInsuficiente {	
        CajaAhorro cajaAhorro = new CajaAhorro("CA001", 0, c);
        cajaAhorro.depositar(500);
        cajaAhorro.extraer(250);
        
        assertEquals(250, cajaAhorro.getSaldo(), "Extraccion correcta");
	}
	
	
}
