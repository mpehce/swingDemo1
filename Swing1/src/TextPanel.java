import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextPanel extends JPanel {

	private JTextArea textArea;
	
	public TextPanel() {
		setLayout(new BorderLayout());
		add(new JScrollPane(getTextArea()), BorderLayout.CENTER);
	}
	
	public JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	
	public void appendText(String text) {
		textArea.append(text);
	}
}
