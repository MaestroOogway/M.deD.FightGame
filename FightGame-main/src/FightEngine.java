import java.util.Scanner;

public class FightEngine {
	public FightEngine() {
		Luchador player1CP = null;
		String luchadorPlayer1;
		String accionLuchadorIn;
		int accionLuchador;
		int escogerLuchador;

		CreateVariant[] variants = new CreateVariant[2];

		variants[0] = new Tank();
		variants[1] = new Assasin();

		variants[0].CreateVariant();
		variants[1].CreateVariant();

		EstadoBajo estadobajo = new EstadoBajo();

		// Main menu
		System.out.println("Menu de personajes");
		for (CreateVariant variant : variants) {
			System.out.println("\n" + variant.getClass().getName() + "--");
			for (Luchador luchador : variant.getListaluchador()) {

				System.out.println(" " + luchador.getClass().getName() + "\nHealth:" + luchador.health + "\nArmor:"
						+ luchador.armor + "\nPower:" + luchador.power + "\nManá:" + luchador.mana + "\nAtack:"
						+ luchador.atack);
			}
		}

		System.out.println("Empieza el juego!!!");
		System.out.println("Selecciona tu luchador: 1-Choro Portenho 2-Minero Warrior");

		Scanner seleccion = new Scanner(System.in);

		luchadorPlayer1 = seleccion.nextLine();

		escogerLuchador = Integer.parseInt(luchadorPlayer1);

		switch (escogerLuchador) {
		case 1:
			player1CP = new ChoroPortenho(0, 0, 0, 0, 0);
			break;
		case 2:
			player1CP = new MineroWarrior(0, 0, 0, 0, 0);
			break;
		}

		System.out.println("Ingresa tu accion! :1-Golpe 2-Patada 3-Salto 4-Golpe Bajo 5-Patada Baja 6-LANZAR PODER");
		accionLuchadorIn = seleccion.nextLine();
		accionLuchador = Integer.parseInt(accionLuchadorIn);

		switch (accionLuchador) {
		case 1:
			System.out.println(player1CP.golpear());
			break;
		case 2:
			System.out.println(player1CP.patear());
			break;
		case 3:
			System.out.println(player1CP.saltar());
			break;
		case 4:
			System.out.println(estadobajo.golpear());
			break;
		case 5:
			System.out.println(estadobajo.patear());
			break;
		case 6:
			System.out.println(player1CP.LanzarPoder());
			break;
		case 21:
			MakeCombo.IsEligible(player1CP);
			break;
		case 123:
			MakeCombo.IsEligible2(player1CP);
			break;
		}

		System.out.println("FIN DEL JUEGO. 2...");

	}

}
