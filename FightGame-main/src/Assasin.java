
public class Assasin extends CreateVariant {// Product Abstract Class

	protected int health = 90;
	protected int mana = 110;
	protected int armor = 30;
	protected int atack = 130;
	protected int power = 120;

//abstract product
	public void PoderAssasin() {
		atack += 200;
	}

	@Override
	public void CreateVariant() {
		// TODO Auto-generated method stub
		listaluchador.add(new ChoroPortenho(health, mana, armor, atack, power));
	}

}
