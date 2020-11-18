import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
public class javaClassNew extends JFrame {

	private JTextField field1;
	private JTextField field2;
	private JTextField field3;
	private JPasswordField password;
	
	public javaClassNew() {//creates the window
		super("TITLE");
		setLayout(new FlowLayout());
		
		field1 = new JTextField(10);
		add(field1);
		field2 = new JTextField("Enter text Here: ");
		add(field2);
		field3 = new JTextField("Can't edit!");
		field3.setEditable(false);
		add(field3);
		password = new JPasswordField("Enter password: ");
		add(password);
		
		//functionality
		thehandler handle = new thehandler();//object of the class
		field1.addActionListener(handle);
		field2.addActionListener(handle);
		field3.addActionListener(handle);
		password.addActionListener(handle);
	}
	
	//Event handling class that implements the ActionListener class
	private class thehandler implements ActionListener{
		
		//Does the actions based on the events occurred
		public void actionPerformed(ActionEvent event) {
			String string = "";
			
			if(event.getSource()==field1) {
				string = String.format("Field 1: %s", event.getActionCommand());
			}else if(event.getSource()==field2) {
				string = String.format("Field 2: %s", event.getActionCommand());
			}else if(event.getSource()==field3) {
				string = String.format("Field 3: %s", event.getActionCommand());
			}else if(event.getSource()==password) {
				string = String.format("Password: %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
		}
	}
}
