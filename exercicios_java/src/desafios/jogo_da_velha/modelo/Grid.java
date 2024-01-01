package desafios.jogo_da_velha.modelo;

import java.util.Arrays;

public class Grid {
	int[][]  canvas = new int[3][3];
	Player[] players;

	public Grid() {
		for(int[] row : canvas)
		Arrays.fill(row, 0);
		this.players = new Player[2];
	}
	
	
	public int[][] getCanvas() {return canvas;}
	public int getCanvas(int lin, int row) {return canvas[lin][row];}
	public void setCanvas(int[][] canvas) {
		this.canvas = canvas;
	}
	
	public int getPlayerId(int player) { return players[player].getId();}
	
	public Player getPlayer(int id) { return players[id];}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	
	public String toString() {
		return " "   + canvas[0][0] + " " + canvas[0][1] + " " + canvas[0][2] +
			   "\n " + canvas[1][0] + " " + canvas[1][1] + " " + canvas[1][2] +
			   "\n " + canvas[2][0] + " " + canvas[2][1] + " " + canvas[2][2];
	}
}