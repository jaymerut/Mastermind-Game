package main;

import java.util.Random;

public class Peg {
	
	//Instantiating the enum for the color of the pegs.
	public enum Color {
		BLUE, GREEN, ORANGE, PURPLE, RED, YELLOW;
	}
	
	//Returns a color corresponding to it's value;
	public static Color getColor(int n) {
		
		if(n == 1) {
			return Color.valueOf("BLUE");
		}
		
		if(n == 2) {
			return Color.valueOf("GREEN");
		}
		
		if(n == 3) {
			return Color.valueOf("ORANGE");
		}
		
		if(n == 4) {
			return Color.valueOf("PURPLE");
		}
		
		if(n == 5) {
			return Color.valueOf("RED");
		}
		
		else{
			return Color.valueOf("YELLOW");
		}
	}

}