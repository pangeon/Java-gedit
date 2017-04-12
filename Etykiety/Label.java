import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Label extends JFrame implements ActionListener {
	private JButton button;
	private JTextField textField;
	private JLabel label;
	
	public Label() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 200);
		setTitle("Guziczek - etykieta");
		setLayout(null);
		
		button = new JButton("Show");
		this.add(button);
		button.setActionCommand("Click");
		button.addActionListener(this);
		button.setBounds(195, 90, 90, 25);
		
		textField = new JTextField();
		textField.setBounds(25, 90, 150, 25);
		this.add(textField);

		label = new JLabel();
		label.setBounds(115, 30, 90, 20);
		this.add(label);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Click")) {	
			String text = textField.getText();
			if (text.equals("Close")) { 
				dispose();
			} else {
				label.setText(textField.getText());
			}
		}
	} 
} 
