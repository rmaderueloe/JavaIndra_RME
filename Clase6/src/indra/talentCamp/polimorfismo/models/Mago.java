package indra.talentCamp.polimorfismo.models;

public class Mago extends Player{
	
	private int ap;
	private int mana;

	public Mago(String name) {
		super(name);
		this.ap = 20;
		this.mana = 100;
	}
	
	public void action(Player enemy) {
		System.out.format("%s tira un hechizo a %s y modifica sus stats.\n",
				this.getName(), enemy.getName());
		
		if (mana > ap) {
			enemy.setModStrength(-this.ap);
			this.mana -= ap;
		}
	}
	
	@Override
	public void endShift() {	//extiende el comportamiento al finlazar el turno para los magos
		super.endShift();
		++this.mana;
	}
}
