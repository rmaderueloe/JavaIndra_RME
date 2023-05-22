package indra.talentCamp.banco;

/*
Además, se debe implementar una clase Cliente que permita 
el registro de los clientes del banco. La clase Cliente debe tener los siguientes atributos:

Nombre del cliente
Número de identificación (puede ser un número de documento)
én se debe implementar un programa principal que permita la interacción con el sistema.
 El programa debe ofrecer las siguientes opciones
*/

public class Cliente {

	private String nombre;
    private String numeroIdentificacion;

    //public Cliente(String nombre, String numeroIdentificacion) {
      //  this.nombre = nombre;
      //  this.numeroIdentificacion = numeroIdentificacion;
    //}
    
    //constructor privado, solo el builder puede generar clientes
    private Cliente() {
    	super();
    }

    //Inner class
    public static class ClienteBuilder{
        private String nombre = null;
        private String numeroIdentificacion = null;
        
        // setters con fluent interfaces
		public ClienteBuilder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}
		public ClienteBuilder setNumeroIdentificacion(String numeroIdentificacion) {
			this.numeroIdentificacion = numeroIdentificacion;
			return this;
		}
		
		public Cliente build() {
			//prog defensiva (assertions)
			assert this.nombre != null;
			assert this.numeroIdentificacion != null;
			// tip: comprobar que no se repita el ID y si es numerico validar el rango
			
			Cliente c = new Cliente();
		    c.nombre = this.nombre;
		    c.numeroIdentificacion = this.numeroIdentificacion;
			return c;
		}
    }
    
    public static ClienteBuilder builder() {
    	return new ClienteBuilder();
    }
    
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numeroIdentificacion=" + numeroIdentificacion + "]";
	}

}


