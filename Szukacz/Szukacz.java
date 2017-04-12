import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Szukacz extends JFrame implements ActionListener {
	private JButton button;
	private JTextField textField;
	private JTextArea textArea;
	
	public Szukacz() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 200);
		setTitle("Szukacz 1.0");
		setLayout(null);
		
		button = new JButton("Szukaj");
		this.add(button);
		button.setActionCommand("cmd-Szukaj");
		button.addActionListener(this);
		button.setBounds(180, 120, 90, 25);
		
		textField = new JTextField();
		textField.setBounds(10, 120, 150, 25);
		this.add(textField);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 10, 260, 100);
		this.add(textArea);
		
		setVisible(true);
	}
	public void szukaj() {
		String tekst = textArea.getText();
		String ciąg = textField.getText();
		int indeks = 0;
		int indeksWystąpienia = 0;
		int liczbaWystapień = 0;
		if (tekst.equals("") || ciąg.equals("")) {
			indeksWystąpienia = -1; 
		}
		while (indeksWystąpienia != -1) {
			indeksWystąpienia = tekst.indexOf(ciąg, indeks);
			if (indeksWystąpienia != -1) {
				indeks = indeksWystąpienia + 1;
				liczbaWystapień++;
			}
		}
		JOptionPane.showMessageDialog(this, "Liczba wystąpień: " + liczbaWystapień, 
		"Informacja!", JOptionPane.INFORMATION_MESSAGE);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("cmd-Szukaj")) {	
			szukaj();	
		}
	} 
} 
