package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("Are you happy?");
	if (x.equals("yes"))  {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
	}
	if (x.equals("no")) {
		String y = JOptionPane.showInputDialog("Do you want to be happy?");
	if (y.equals("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
	}
	if (y.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Change something.");
	}
	}
}
}
