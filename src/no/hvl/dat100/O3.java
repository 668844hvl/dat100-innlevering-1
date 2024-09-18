package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
	
		
		
		int tall = Integer.parseInt(showInputDialog("Skriv et heltall større enn 0"));
		
		if (tall<=0) {
			showMessageDialog(null, "Ugyldig tall");
		}
		else {
			int fakultet = 1;
			for (int i=1; i<=tall; i++) {
				fakultet = fakultet*i;
			}
			showMessageDialog(null, "fakultetet av "+ tall +" er "+ fakultet);
		}
		
		
		
		
	}

}
