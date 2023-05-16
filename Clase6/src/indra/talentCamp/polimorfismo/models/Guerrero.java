package indra.talentCamp.polimorfismo.models;

public class Guerrero extends Player{

	public Guerrero(String name) {
		super(name);
	}

	public void action(Player enemy) {
		System.out.format("%s ataca a %s y hace %d de daño.\n",
				this.getName(), enemy.getName(), this.getStrength());
		enemy.setHp(enemy.getHp()-this.getStrength());
	}
}
