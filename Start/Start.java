public class Start {
	public static void main (String[] args) {
		System.out.println("Zaczynamy");
		System.out.println("---------");
		int a = 0, b = 4, c = 6;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println();
		
		for ( ; ; ) {	
			if (a++ >= 10) {
				break;
			} else if (a % 2 == 0) {				
				System.out.println("a for | = " + a);
				
			}
		}
		System.out.println("---------");
		for (; b <= 20; ) {
			b++;
			if (b % 2 == 0 || b % 3  == 0) continue;
			System.out.println("b for | = " + b);
		}    
	} 
}
