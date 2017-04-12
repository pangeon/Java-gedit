import java.util.*;

public class PrimeNumberScanner extends PrimeNumber {

	private static Scanner sc = new Scanner(System.in);
	
	private int a;
	
	PrimeNumberScanner() {
	}
	
	PrimeNumberScanner(int a) {
		super(a);
	}
	public void primeToConsole() {
		try {
			System.out.println("Podaj zakres liczb pierwszych (wartość większa od 1)");
			while(sc.hasNextInt()) {
				a = sc.nextInt();
				PrimeNumber pn = new PrimeNumber(a);
				pn.PrintSequence();
				while (!sc.hasNextInt()) {
					sc.next();
					System.out.println("Niepoprawny argument. Podaj liczbę naturalną.");
				}
			}
		} catch (Exception e) {
			System.out.println("Przerwanie działania programu.");
			System.exit(-1);
		} 
	}
}
