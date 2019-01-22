package main;

import java.util.Random;
import java.lang.Enum;

public class Computer extends Peg {
	
	public Color secretComb[];
	public Computer() {
		secretComb = new Color[4];
	}
	
	public Color pegGen() {
		Random rand = new Random();
		
		//6 is the maximum number and 1 is the minimum
		int n = rand.nextInt(6) + 1;
		return getColor(n);
	}
	
	//Fills the secretComb array with random colors allowing duplicates
	public void populateDup() {
		for(int i = 0; i < 4; i++) {
			secretComb[i] = pegGen();
		}
	}
	
	//Fills the secretComb array with random colors not allowing duplicates
	public void populateNoDup() {
		Color temp;
		boolean noDup = false;
		
		for(int i = 0; i < 4; i++) {
			if(i != 0) {
				temp = pegGen();
				while(!noDup) {
					
					for(int j = 0; j < i; j++) {
						if(!noDup) {
							j = 0;
						}
						if(secretComb[j].equals(temp)) {
							temp = pegGen();
							noDup = false;
						}
						
						else {
							noDup = true;
						}
					}
				}
				secretComb[i] = temp;
			}
			else {
				secretComb[i] = pegGen();
			}
			noDup = false;
		}
	}
	public String toString() {
		populateNoDup();
		String result = "";
		for(int i = 0; i < 4; i++) {
			result += "" + secretComb[i] + ", ";
		}
		
		return result;
	}
}