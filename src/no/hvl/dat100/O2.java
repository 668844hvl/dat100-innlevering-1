package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		
		int a = 208050;
		int b = 292850;
		int c = 670000;
		int d = 937900;
		int e = 1350000;
		
		double t1 = (b-a)*0.017;
		double t2 = (c-b)*0.04;
		double t3 = (d-c)*0.136;
		double t4 = (e-d)*0.166;
		
		int inntekt = Integer.parseInt(showInputDialog("Hva er din inntekt?"));
		
		double skatt = 0;
		
		
		if (inntekt <= a) {
			showMessageDialog(null, "Du må ikke betale trinnskatt");
		}
		
		else if (inntekt <= b) {
			skatt = (inntekt-a)*0.017;			
		}
		
		else if (inntekt <= c) {
			skatt = (inntekt-b)*0.04+t1;					
		}
		
		else if (inntekt <= d) {
			skatt = (inntekt-c)*0.136+t1+t2;			
		}
		
		else if (inntekt <= e) {
			skatt = (inntekt-d)*0.166+t1+t2+t3;			
		}
		
		else if (inntekt > e) {
			skatt = (inntekt-e)*0.176+t1+t2+t3+t4;	
		}
		
		double skattSvar = Math.floor(skatt*100)/100;
		showMessageDialog(null, "Du betaler "+ skattSvar +" i skatt");

	}

}
