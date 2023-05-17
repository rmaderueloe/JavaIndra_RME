package indra.talentCamp.generics;

@FunctionalInterface
public interface Operacion<T> {
	T operar(T a, T b);	
}
