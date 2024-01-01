package desafios.jogo_da_velha;

import desafios.jogo_da_velha.modelo.Grid;
import desafios.jogo_da_velha.modelo.Player;

public class App {
	private Grid fillData() {
		Player[] players    = new Player[2];
				 players[0] = new Player("Josuáres",88);
				 players[1] = new Player("Jamaldi", 79);
		
		Grid jogoDaVelha = new Grid();
			 jogoDaVelha.setPlayers(players);
			 
		return jogoDaVelha;
	}
	
	static boolean checkGrid(Grid g, int index) {
		int player = g.getPlayerId(index);
		return g.getCanvas(0,0) == player &&
			   g.getCanvas(1,1) == player &&
			   g.getCanvas(2,2) == player ||
			   g.getCanvas(0,0) == player &&
			   g.getCanvas(1,0) == player &&
			   g.getCanvas(2,0) == player || 
			   g.getCanvas(0,2) == player &&
			   g.getCanvas(1,2) == player &&
			   g.getCanvas(2,2) == player ||
			   g.getCanvas(0,2) == player &&
			   g.getCanvas(1,1) == player &&
			   g.getCanvas(2,0) == player ? true : false;
	}
	
	static boolean endgame(Grid g) {
		
		for(int i = 0; i < g.getCanvas().length; i++) {
			
		}
		
		if(checkGrid(g,0)) {
			Player p1 = g.getPlayer(0);
			System.out.println(p1.toString() + " Ganhou!!");
			return true;
		}
		else
			if(checkGrid(g,1)) {
				Player p2 = g.getPlayer(1);
				System.out.println(p2.toString() + " Ganhou!!");
				return true;
			}
		return false;
	}
	
	public App() {
	Grid jogoDaVelha = fillData();
	
	}

	public static void main(String[] args) {
		new App();
	}
}