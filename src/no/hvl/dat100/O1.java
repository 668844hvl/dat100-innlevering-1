package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		
	//Oppgåve a)
		
		/*int poeng = Integer.parseInt(showInputDialog("Hva er din poengsum? (0-100"));
			
		if ((poeng <=100)&&(poeng>=90)) {
				showMessageDialog(null, "Karakter: A");
		}
			
		else if ((poeng<=89)&&(poeng>=80)) {
				showMessageDialog(null, "Karakter: B");
		}
			
		else if ((poeng<=79)&&(poeng>=60)) {
				showMessageDialog(null, "Karakter: C");
		}
			
		else if ((poeng<=59)&&(poeng>=50)) {
				showMessageDialog(null, "Karakter: D");
		}
			
		else if ((poeng<=49)&&(poeng>=40)) {
				showMessageDialog(null, "Karakter: E");
		}
			
		else if ((poeng<=39)&&(poeng>=0)) {
				showMessageDialog(null, "Karakter: F");
		}
		
		else {
				showMessageDialog(null, "Ugyldig poengsum"); 
		}*/

		
		
	//Oppgåve b)
		
		/*for (int i=1; i<=10; i++) {
			int poeng = Integer.parseInt(showInputDialog("Hva er poengsummen for student " + i + "? (0-100)"));
			
			if ((poeng <=100)&&(poeng>=90)) {
				showMessageDialog(null, "Karakter: A");
			}
			
			else if ((poeng<=89)&&(poeng>=80)) {
				showMessageDialog(null, "Student: " + i + " Karakter: B");
			}
			
			else if ((poeng<=79)&&(poeng>=60)) {
				showMessageDialog(null, "Student: " + i + " Karakter: C");
			}
			
			else if ((poeng<=59)&&(poeng>=50)) {
				showMessageDialog(null, "Student: " + i + " Karakter: D");
			}
			
			else if ((poeng<=49)&&(poeng>=40)) {
				showMessageDialog(null, "Student: " + i + " Karakter: E");
			}
			
			else if ((poeng<=39)&&(poeng>=0)) {
				showMessageDialog(null, "Student: " + i + " Karakter: F");
			}
			
			else {
				showMessageDialog(null, "Ugyldig poengsum for student: " + i); 
			}

		}*/
		
		
		
		
	//Oppgåve c)
		
		for (int i = 1; i <= 10; i++) {
            int poeng = -1;  
            
            do {
            	String poengSvar = showInputDialog("Hva er poengsummen for student " + i + "? (0-100)");
            	poeng = Integer.parseInt(poengSvar);

            	if (poeng < 0 || poeng > 100) {
                        showMessageDialog(null, "Ugyldig poengsum for student " + i + ". Prøv igjen.");
                }
            } 
            
            while (poeng < 0 || poeng > 100); {
            }	
            
            if (poeng >= 90) {
                showMessageDialog(null, "Student " + i + " karakter: A");
            } 
            else if (poeng >= 80) {
                showMessageDialog(null, "Student " + i + " karakter: B");
            } 
            else if (poeng >= 60) {
                showMessageDialog(null, "Student " + i + " karakter: C");
            } 
            else if (poeng >= 50) {
                showMessageDialog(null, "Student " + i + " karakter: D");
            } 
            else if (poeng >= 40) {
                showMessageDialog(null, "Student " + i + " karakter: E");
            } 
            else {
                showMessageDialog(null, "Student " + i + " karakter: F");
            }
		}
	}
}
            
		
	
		

