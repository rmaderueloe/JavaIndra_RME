package indra.talentCamp.polimorfismo.models;

public class Sacerdote extends Player{

	public Sacerdote(String name) {
		super(name);
	}
	
	public void action(Player enemy) {
		System.out.format("%s cura a %s, %d puntos de vida.\n",
				this.getName(), enemy.getName(), this.getDexterity());
		enemy.setHp(enemy.getHp() - this.getDexterity());
	}

}
