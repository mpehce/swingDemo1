import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private Toolbar toolbar;
	
	public MainFrame() {
		super("Hello world");
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		getToolbar().setTextPanel(getTextPanel());
		
		add(getToolbar(), BorderLayout.NORTH);
		add(getTextPanel(), BorderLayout.CENTER);
		
		setVisible(true);
	}

	public TextPanel getTextPanel() {
		if (textPanel == null) {
			textPanel = new TextPanel();
		}
		return textPanel;
	}

	public Toolbar getToolbar() {
		if (toolbar == null) {
			toolbar = new Toolbar();
		}
		return toolbar;
	}
}
