package indra.talentCamp.polimorfismo.models;

public abstract class Player {	//mago, guerrero, sacerdote
	private String name;
	private int hp;
	private int strength;
	private int dexterity;
	private int modStrength;

	private int playerType;	//guerrero 1, sacerdote 2, mago 3
	
	/**
	 * @param name
	 * @param hp
	 * @param strength
	 * @param dexterity
	 */
	public Player(String name) {
		this.name = name;
		this.hp = 50;
		this.strength = 50;
		this.dexterity = 50;
		this.modStrength = 0;
	}

	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/

	public int getHp() {
		return hp;
	}

	protected void setHp(int hp) {
		this.hp = hp;
	}

	public int getStrength() {
		return strength;
	}

	protected void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	protected void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	
	protected void setModStrength(int modStrength) {
		this.modStrength = modStrength;
	}
	
	public void action(Player enemy) {
		if (playerType == 1) //guerrero
			enemy.setHp(enemy.hp - this.getStrength());
		else if(playerType == 2)	//sacerdote 
			enemy.setHp(enemy.hp - this.getDexterity());
		else if(playerType == 3)	//mago
			enemy.setStrength(enemy.strength - this.getDexterity());
	}
	
	public boolean isAlive() {
		return this.hp > 0;
	}

	public void endShift() {  // finalizar turno
		this.modStrength = 0;
	}
	
	//@Override
	public String toStringBase() {
		return "Player [name=" + name + ", hp=" + hp + ", strength=" + strength + ", dexterity=" + dexterity
				+ ", playerType=" + playerType + "]";
	}
	
	@Override
	public String toString() {
        return String.format("Nuestro personaje %s, llamado %s \n Tiene salud: %d \n "
        		+ "Tiene destreza: %d \n Tiene fuerza : %d"  ,
                this.getClass().getSimpleName(),
                this.name,
                this.hp,
                this.dexterity,
                this.strength);
    }
	
	
}
