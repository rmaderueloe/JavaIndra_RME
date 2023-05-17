package indra.talentCamp.generics;

public class CajaFuerte<T> {
	private String password;
	private T valor;
	
	public CajaFuerte(String password) {
		this.password = password;
	}
	
	public void guardarValor(T valor) {
		this.valor = valor;
	}
	
	public T leerValor(String password) throws Exception {
		if (password.equals(this.password)) {
			return valor;
		}
		throw new Exception("Acceso no autorizado."); //usar Error para situacion muy remotas
	}
	
}
