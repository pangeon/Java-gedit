import java.io.Console;

public class Start {
	public static void main(String[] args) {
			FileManager fw = new FileManager();
			Console con = System.console();
			if (con == null) {
				System.out.println("Brak konsoli");
				System.exit(-1);
			}
			args[0] = "";
			args[0] = con.readLine("Wprowadź komendę (write, read lub copy): ");
			con.printf("Wybrany tryb: " + args[0]);
			
			if (args[0] == "read") {			
				if (args.length < 1) {
					System.out.println("Wywołanie programu: Start nazwa_pliku");
					System.exit(0);
				}
				fw.readFile(args[1]);
			}
			if (args[0] == "write") {
				if (args.length < 1) {
					System.out.println("Wywołanie programu: Start nazwa_pliku");
					System.exit(0);
				}
				fw.writeFile(args[1]);
			}
			if (args[0] == "copy") {
				if (args.length < 2) {
					System.out.println("Wywołanie programu: " + 
					"Start nazwa_pliku_zróbłowego nazwa_pliku_docelowego");
					System.exit(0);
				}
				fw.copyFile(args[1], args[2]);
			}
	}
}
