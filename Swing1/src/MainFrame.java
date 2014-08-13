import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MainFrame extends JFrame {
	
	private JButton btn;
	private JTextArea textArea;
	
	public MainFrame() {
		super("Hello world");
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		getBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getTextArea().append("Hello\n");
			}
		});
		
		add(getTextArea(), BorderLayout.CENTER);
		add(getBtn(), BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public JButton getBtn() {
		if (btn == null) {
			btn = new JButton("Click me");
		}
		return btn;
	}

	public JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
}
