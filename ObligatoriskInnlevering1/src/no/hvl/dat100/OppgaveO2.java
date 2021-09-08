package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO2 {

	static int getScore(int idx) {
		int score = Integer.parseInt(showInputDialog("Poengsum til kandidat nr " + (idx + 1)));

		while (score < 0 || score > 100) {
			score = Integer.parseInt(showInputDialog("Ugyldig poengsum (0 - 100)"));
		}

		return score;
	}

	static void checkScore(int score) {
		if (score >= 90) System.out.println("A");
		else if (score >= 80) System.out.println("B");
		else if (score >= 60) System.out.println("C");
		else if (score >= 50) System.out.println("D");
		else if (score >= 40) System.out.println("E");
		else System.out.println("F");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) checkScore(getScore(i));
	}
	
}
