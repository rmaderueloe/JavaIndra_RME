package indra.talentCamp.generics;

// no incluir la plabra generica en proyecto real
public abstract class FiguraGenerica<T extends Number> {	// condicion de tipo de entrada
	public abstract T calcularArea();
	public abstract T calcularPerimetro();
}
