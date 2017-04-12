public class Loop {
	public static void main (String[] args) {
		int b = 0;
		System.out.println("Zbiór liczb pierwszych");
		System.out.println("----------------------");
		System.out.print("2 3 7 ");
		while (b <= 100) {
			if (
			b > 1 &&
			b % 2 != 0 && 
			b % 3 != 0 && 
			b % 4 != 0 && 
			b % 5 != 0 && 
			b % 6 != 0 && 
			b % 7 != 0 && 
			b % 8 != 0 && 
			b % 9 != 0) 
			System.out.print(b + " ");
			b++;
		}
	}
}
