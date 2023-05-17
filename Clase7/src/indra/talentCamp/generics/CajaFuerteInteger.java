package indra.talentCamp.generics;

public class CajaFuerteInteger<Integer> {
	private String password;
	private Integer valor;
	
	public CajaFuerteInteger(String password) {
		this.password = password;
	}
	
	public void guardarValor(Integer valor) {
		this.valor = valor;
	}
	
	public Integer leerValor(String password) throws Exception {
		if (password.equals(this.password)) {
			return valor;
		}
		throw new Exception("Acceso no autorizado."); //usar Error para situacion muy remotas
	}
	
}
