// main program
import javax.swing.JOptionPane;

public class menu {
	public static void main(String[] args) {
		int choice;
		do {
			choice = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1.Linear Equation\n"
					+ "2.Linear System\n"
					+ "3.Quadratic Equation\n"
					+ "0.Exit\n"
					+ "Your choice: " , "Menu", JOptionPane.INFORMATION_MESSAGE));
		switch(choice) {
			case 0: break;
			case 1: 
				LinearEquation le = new LinearEquation();
				le.a = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a: " , "INPUT: ax + b = 0", JOptionPane.INFORMATION_MESSAGE));
				le.b = Double.parseDouble(JOptionPane.showInputDialog(null, "Input b: " , "INPUT: ax + b = 0", JOptionPane.INFORMATION_MESSAGE));
				JOptionPane.showMessageDialog(null, le.solve(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				LinearSystem ls = new LinearSystem();
				ls.a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a11: " , "INPUT: a11x1 + a12x2 = b1", JOptionPane.INFORMATION_MESSAGE));
				ls.a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a12: " , "INPUT: a11x1 + a12x2 = b1", JOptionPane.INFORMATION_MESSAGE));
				ls.b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input b1: " , "INPUT: a11x1 + a12x2 = b1", JOptionPane.INFORMATION_MESSAGE));
				ls.a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a21: " , "INPUT: a21x1 + a22x2 = b2", JOptionPane.INFORMATION_MESSAGE));
				ls.a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a22: " , "INPUT: a21x1 + a22x2 = b2", JOptionPane.INFORMATION_MESSAGE));
				ls.b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input b2: " , "INPUT: a21x1 + a22x2 = b2", JOptionPane.INFORMATION_MESSAGE));
				JOptionPane.showMessageDialog(null, ls.solve(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3:
				QuadraticEquation qe = new QuadraticEquation();
				qe.a = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a: " , "INPUT: ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE));
				qe.b = Double.parseDouble(JOptionPane.showInputDialog(null, "Input b: " , "INPUT: ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE));
				qe.c = Double.parseDouble(JOptionPane.showInputDialog(null, "Input c: " , "INPUT: ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE));
				JOptionPane.showMessageDialog(null, qe.solve(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Please input choice 0-3!", "Menu", JOptionPane.INFORMATION_MESSAGE);
		}
		}while (choice != 0);
	}
}
