import java.io.*;

public class FileManager {
		
	public void writeFile(String a) {
		String line = "";
		FileOutputStream outs = null;							
		try {
			outs = new FileOutputStream(a);
		} catch(FileNotFoundException e) {
			System.out.println("Błąd poczas otwierania pliku");
			System.exit(-1);
		}
		DataOutputStream dataout = new DataOutputStream(outs);
		BufferedReader inpstr = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
				if((line = inpstr.readLine()) == null || line.equals("exit")) {
					break;
				}
			dataout.writeBytes(line + '\n'); 
			}
		} catch(IOException e) {
			System.out.println("Read/Write error.");
		}
	
	}
	public void readFile(String a) {
		String line = "";
		FileInputStream finpstr = null;
		try {
			finpstr = new FileInputStream(a);
		} catch(FileNotFoundException e) {
			System.out.println("Brak pliku");
			System.exit(-1);
		}
		DataInputStream dataout = new DataInputStream(finpstr);
		BufferedReader inpstr = new BufferedReader(new InputStreamReader(finpstr));
		try {
			while((line = inpstr.readLine()) != null) {
				System.out.println(line);	
			}
		} catch(IOException e) {
			System.out.println("Błąd wejścia - wyjścia.");
		}
	}
	public void copyFile(String a, String b) {
		FileInputStream finpstr = null;
		FileOutputStream outs = null;
		try {
			finpstr = new FileInputStream(a);
		} catch(FileNotFoundException e) {
			System.out.println("Brak pliku: " + a);
			System.exit(-1);
		}
		try {
			outs = new FileOutputStream(b);
		} catch(FileNotFoundException e) {
			System.out.println("Nie można utworzyć pliku: " + b);
			System.exit(-1);
		}
		try {
			int c;
			while((c = finpstr.read()) != -1)  {
				outs.write(c);	
			}
			System.out.println("Kopiowanie zakończone");
		} catch(IOException e) {
			System.out.println("Błąd wejścia - wyjścia.");
		}
	}
}













 
