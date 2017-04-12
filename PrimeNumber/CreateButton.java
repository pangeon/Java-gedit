import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CreateButton extends JFrame implements ActionListener {
	JButton button;
	
	public CreateButton() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Guziczek");
		setLayout(null);
		button = new JButton("Clicker");
		this.add(button);
		button.setActionCommand("Click");
		button.addActionListener(this);
		button.setBounds(75, 55, 160, 40);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Click")) {
			dispose();
		}
	} 
} 
