
public abstract class Luchador {
	
	private int health;
	private int mana;
	private int armor;
	private int atack;
	
	
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getAtack() {
		return atack;
	}

	public void setAtack(int atack) {
		this.atack = atack;
	}

	public String golpear(){
		return null;
	}
	
	public String patear(){
		return null;
	}

	public String saltar(){
		return null;
	}
	
	public String LanzarPoder(){
		return null;
	}
	
}
