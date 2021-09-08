package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		
		int grossIncome = Integer.parseInt(showInputDialog("Bruttoinntekt"));
		double taxPercent;
		
		if (grossIncome <= 164100) {
			taxPercent = 0.0;
		} else if (grossIncome <= 230950) {
			taxPercent = 0.93;
		} else if (grossIncome <= 580650) {
			taxPercent = 2.41;
		} else if (grossIncome <= 934050) {
			taxPercent = 11.52;
		} else {
			taxPercent = 14.52;
		}
		
		showMessageDialog(null, "Trinnskatt: " + taxPercent + "%");
	}

}
