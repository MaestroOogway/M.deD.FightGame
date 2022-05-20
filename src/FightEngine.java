import java.util.Scanner;

public class FightEngine {
	public FightEngine() {
		Luchador player1CP = null;
		String luchadorPlayer1;
		String accionLuchadorIn;
		int accionLuchador;
		int escogerLuchador;


		System.out.println("Empieza el juego!!!");
		System.out.println("Selecciona tu luchador: 1-Choro Portenho 2-Minero Warrior 3-ProfeMeto 4-ReneNoel");

		Scanner seleccion = new Scanner(System.in);

		luchadorPlayer1 = seleccion.nextLine();

		System.out.println(luchadorPlayer1);

		escogerLuchador = Integer.parseInt(luchadorPlayer1);

		
		 switch(escogerLuchador){ 
		 case 1: 
		 	 player1CP = new ChoroPortenho();
		 	 break; 
		 case 2:
			 player1CP = new MineroWarrior(); 
			 break; 
		 case 3:
			 player1CP = new ProfeMeto(); 
			 break; 
		 case 4: 
			 player1CP = new
			 ReneNoel(); break; }
		 
		System.out.println("Ingresa tu accion! :1-Golpe 2-Patada 3-Salto 4-LANZAR PODER");
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
			System.out.println(player1CP.LanzarPoder());
			break;
		}

		System.out.println("FIN DEL JUEGO. 2...");

	}

}
