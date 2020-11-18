import javax.swing.JOptionPane;
public class javaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = JOptionPane.showInputDialog("Enter first #: ");
		String second = JOptionPane.showInputDialog("Enter second #: ");
		
		int fnum = Integer.parseInt(first);
		int snum = Integer.parseInt(second);
		
		int sum = fnum + snum;
		
		JOptionPane.showMessageDialog(null, "Anwser: " + sum, "Title", JOptionPane.PLAIN_MESSAGE);
	}

}
