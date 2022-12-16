import java.awt.Color;

abstract class Luchador { // Product Abstract Class

	protected int health;
	protected int mana;
	protected int armor;
	protected int atack;
	protected int power;

	public Luchador(int health, int mana, int armor, int atack, int power) {
		super();
		this.health = health;
		this.mana = mana;
		this.armor = armor;
		this.atack = atack;
		this.power = power;
	}

	public abstract String golpear();

	public abstract String patear();

	public abstract String saltar();

	public abstract String LanzarPoder();

}
