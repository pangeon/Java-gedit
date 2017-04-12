public class Case {
	public static void main (String[] args) {
		byte a = 103;
		switch (a % 2) {
			case 0:
				if (a > 0) System.out.println("Liczba parzysta, większa od 0");
				else if (a == 0) System.out.println("Liczba 0");
				else System.out.println("Liczba parzysta, mniejsza od 0");
				break;
			case 1:
				if (a > 0) System.out.println("Liczba nieparzysta, większa od 0");
				else System.out.println("Liczba nieparzysta, mniejsza od 0");
				break;
			default:
				System.out.println("Nieprawidłowa liczba");
		}
		switch (a % 3) {
			case 0:
				if (a > 0) System.out.println("Liczba podzielna przez 3, większa od 0");
				else if (a == 0) System.out.println("Liczba 0");
				else System.out.println("Liczba podzielna przez 3, mniejsza od 0");
				break;
			case 1: case 2:
				if (a > 0) System.out.println("Liczba niepodzielna przez 3, większa od 0");
				else System.out.println("Liczba nieparzysta niepodzielna przez 3, mniejsza od 0");
				break;
			default:
				System.out.println("Nieprawidłowa liczba");
		}				
	}
}
