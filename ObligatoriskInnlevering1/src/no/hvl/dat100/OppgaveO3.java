package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {
	
	private static long factorial(long n) {
		if (n == 1) return 1;
		if (n <= 0) return 0;
		
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		long num = Long.parseLong(showInputDialog("Skriv inn eit tall større enn 0:"));
		showMessageDialog(null, factorial(num));
	}

}
