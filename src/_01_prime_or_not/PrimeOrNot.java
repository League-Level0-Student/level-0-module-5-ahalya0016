package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
String y = JOptionPane.showInputDialog(null, "Choose a number");
int x=Integer.parseInt(y);
for (int x1 = 2; x1 < x-1; x1++) {
	if (x%x1 ==0)  {
		JOptionPane.showMessageDialog(null, "You're number is not prime");
		return;
	}
}
JOptionPane.showMessageDialog(null, "You're number is prime");
	


}
}



