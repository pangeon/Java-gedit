public class PrimeNumber {
	protected int a;
	private int b = 0;

	public PrimeNumber() {
	}
	public PrimeNumber(int a) {
		this.a = a;
	}	
	public void SetNumLimit(int limit) {
		a = limit;
		b = 0;
	}
	public void GetLimit() {
		System.out.println(a);
	} 
	public int PrintSequence() {
		if(a > 1) System.out.print("Liczby pierwsze mniejsze od " + a + " - [");
		if (a > 7 && a % 1 == 0) {
			System.out.print(" 1 2 3 5 7 ");
				while (b++ < a) {
					if (b != 1 && b % 2 != 0 && b % 3 != 0 && b % 5 != 0 && b % 7 != 0) {
						System.out.print(b + " ");
				}
			}
			System.out.println("]");
		} 
		if (a <= 7) {
			switch (a) {
				case 7: case 6:
					System.out.print(" 1 2 3 5 ");
					break;
				case 5: case 4:
					System.out.print(" 1 2 3 ");
					break;
				case 3:
					System.out.print(" 1 2 ");
					break;
				case 2:
					System.out.print(" 1 ");
					break;
				default:
					throw new ArithmeticException("Nieporawna wartość. Zakres wartości określa liczba naturalna większa od 1.");
			}
			System.out.println("]");
		}
		return 0;
	}
	
	public int OpenSpaceSequence(String c, int a) {
		System.out.print("Liczby pierwsze mniejsze od " + a + " - [");
		while (b++ < a) {	
			if (b != 1 && b % 2 != 0 && b % 3 != 0 && b % 5 != 0 && b % 7 != 0) {
				System.out.print(b);
			} else {
				System.out.print(c);
			}
		}
		System.out.println("]");
		return 0;	
	}
        @Override
	public String toString() {
		return getClass().getName() + " [określony limit= " + a + "]";
	}
		
}	
