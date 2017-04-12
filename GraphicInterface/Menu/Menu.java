import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener  {

	public Menu() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JMenu - Aplikacja");

		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("Operacje");
		
		JMenuItem jmenuItem2 = new JMenuItem("Otwórz plik");
		jmenuItem2.setActionCommand("Open");
		jmenuItem2.addActionListener(this);
		
		JMenuItem jmenuItem1 = new JMenuItem("Zamknij program");
		jmenuItem1.setActionCommand("Close");
		jmenuItem1.addActionListener(this);
				
		menuBar.add(menu1);
		menu1.add(jmenuItem1);
		menu1.add(jmenuItem2);
		setJMenuBar(menuBar);		
		
		setSize(320, 200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent evt) {
		String cmd = evt.getActionCommand();
		if ("Open".equals(cmd)) {
			JFileChooser jfile = new JFileChooser();
			if(jfile.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
				String fileName = jfile.getSelectedFile().getName();
				JOptionPane.showMessageDialog(this, "Wybrano plik: " + fileName, "Informacja",
				JOptionPane.INFORMATION_MESSAGE);
			}
		} else if ("Close".equals(cmd)) {
			dispose();
		}
	}	
}
