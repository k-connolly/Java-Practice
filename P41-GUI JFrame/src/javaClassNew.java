import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class javaClassNew extends JFrame{//inherit from JFrame
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5296754725027315253L;
	private JLabel label;
	
	public javaClassNew() {
		super("Title Bar");
		setLayout(new FlowLayout());
		
		label = new JLabel("this is a label!");
		label.setToolTipText("Show on hover");
		add(label);
	}

}
