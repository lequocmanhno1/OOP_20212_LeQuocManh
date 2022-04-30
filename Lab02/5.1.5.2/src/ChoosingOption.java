import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		//int option = JOptionPane.showConfirmDialog(null,"Do you want to change the first class ticket?");
		
//		JOptionPane.showMessageDialog(null, "You've chosen: " 
//					+ (option == JOptionPane.YES_OPTION?"Yes":"No"));
		Object[] options = { "Yes", "No","Maybe", "Cancel" };

		JOptionPane.showOptionDialog(null,"Do you want to change the first class ticket?", "You've chosen: ",
		JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
		null, options, options[0]);
		
		System.exit(0);
	}
}
