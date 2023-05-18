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

    public Cliente(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
    }

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numeroIdentificacion=" + numeroIdentificacion + "]";
	}

}


