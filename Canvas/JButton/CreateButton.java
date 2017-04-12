import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CreateButton extends JFrame implements ActionListener {
	private JButton button;
	private JTextField textField;
	
	public CreateButton() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 200);
		setTitle("Guziczek");
		setLayout(null);
		
		button = new JButton("Clicker");
		this.add(button);
		button.setActionCommand("Click");
		button.addActionListener(this);
		button.setBounds(75, 55, 160, 40);
		//setVisible(true);
		
		textField = new JTextField();
		textField.setBounds(80, 25, 150, 25);
		this.add(textField);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Click")) {	
			String text = textField.getText();
			if (text.equals("Close")) { 
				dispose();
			} else {
				JOptionPane.showMessageDialog(this, "Odczytany tekst: " + text, 
				"Informacja!", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	} 
} 
