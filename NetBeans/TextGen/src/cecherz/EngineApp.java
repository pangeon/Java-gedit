
package cecherz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class EngineApp extends JFrame implements ActionListener {
    private final JTextArea textArea;

    public EngineApp() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 200);
        setTitle("TextGen 1.0");
        setLayout(null);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Plik");
        
        JMenuItem open = new JMenuItem("Otwórz");
        open.addActionListener(this);
        open.setActionCommand("Open");
        
        JMenuItem write = new JMenuItem("Zapisz jako");
        write.addActionListener(this);
        write.setActionCommand("Save");
        
        JMenuItem close = new JMenuItem("Zamknij");
        close.addActionListener(this);
        close.setActionCommand("Close");
        
        menu.add(open);
        menu.add(write);
        menu.add(new JSeparator());
        menu.add(close);
        
        textArea = new JTextArea();
        textArea.setBounds(10, 10, 270, 110);
        add(textArea);
        
        menuBar.add(menu);
        setJMenuBar(menuBar);
        setVisible(true);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Close":
                dispose();
                break;
            case "Open":
                {
                    JFileChooser filechooser = new JFileChooser();
                    if (filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                        open(filechooser.getSelectedFile());
                    } else {       
                    }
                    break;
                }
            case "Save":
                {
                    JFileChooser filechooser = new JFileChooser();
                    if (filechooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                        save(filechooser.getSelectedFile());
                    }       
                    break;
                }
            default:
                break;
        }
    }
    public void open(File file) {
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Błąd przy otwieraniu pliku. ", "Błąd", JOptionPane.ERROR_MESSAGE);
        }
        DataInputStream dataInput = new DataInputStream(fileInput);
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(fileInput));
        textArea.setText("");
        String line;
        try {
            while((line = buffReader.readLine()) != null) {
                textArea.append(line + '\n');
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Błąd wejścia - wyjścia. ", "Błąd", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void save(File file) {
        FileOutputStream fileOutput = null;
        try {
            fileOutput = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Błąd przy otwieraniu pliku. ", "Błąd", JOptionPane.ERROR_MESSAGE);
        }
        DataOutputStream dataOutput = new DataOutputStream(fileOutput);
        try {
            String line = textArea.getText();
            dataOutput.writeBytes(line + '\n');
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Błąd wejścia - wyjścia. ", "Błąd", JOptionPane.ERROR_MESSAGE);
        }
    }
}
