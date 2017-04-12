import java.io.Console;

class Konwerter {
	private Console con = System.console();
	private String line = "";
	private int liczba;

	{
		if (con == null) {
			System.out.println("Brak konsoli !");
			System.exit(-1);
		}
		con.printf("Podaj liczbę całkowitą z zakresu [-2147483648 - 2147483647] : ");
		while(true) {
			line = con.readLine();
			try {
				liczba = Integer.parseInt(line);
			} catch (NumberFormatException e) {
				con.printf("Błąd! Program operuje na wartościach typu Integer! ");
				continue;
			}
			break;
		}
		con.printf("hashcode: %h\n", liczba);	
		con.printf("Ósemkowo: %o%n", liczba);
		con.printf("Szesnastkowo: %x%n", liczba);
		System.out.println("Binarnie: " + Integer.toBinaryString(liczba));
	}
}
