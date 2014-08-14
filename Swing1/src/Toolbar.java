import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Toolbar extends JPanel implements ActionListener{

	private JButton helloButton;
	private JButton goodbyeButton;
	
	private TextPanel textPanel; //use interface instead of textPanel to avoid tight coupling
	
	public Toolbar() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(getHelloButton());
		add(getGoodbyeButton());
	}

	public JButton getHelloButton() {
		if (helloButton == null) {
			helloButton = new JButton("Hello");
			helloButton.addActionListener(this);
		}
		return helloButton;
	}

	public JButton getGoodbyeButton() {
		if (goodbyeButton == null) {
			goodbyeButton = new JButton("Goodbye");
			goodbyeButton.addActionListener(this);
		}
		return goodbyeButton;
	}

	public TextPanel getTextPanel() {
		if (textPanel == null) {
			textPanel = new TextPanel();
		}
		return textPanel;
	}

	public void setTextPanel(TextPanel textPanel) {
		this.textPanel = textPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		
		if (clickedButton == helloButton) {
			getTextPanel().appendText("Hello\n");
		} else {
			getTextPanel().appendText("Goodbye\n");
		}
	}
}
