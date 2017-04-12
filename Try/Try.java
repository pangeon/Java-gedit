public class Try {
	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5};
		int num2 = 798798798;
		int num3 = 0;
          int i = 0;
		try {
			nuller("drzewo");
			nuller(null);
		} catch(NullPointerException e) {
			System.out.println("Typ wyjątku: " + e);
			e.printStackTrace(System.out);
		}
		try {
			devide(2);
			devide(0);	
		} catch(ArithmeticException e) {
			System.out.println("Typ wyjątku: " + e);
			e.printStackTrace(System.out);
		}
 		

	}
	static int devide(int a) throws ArithmeticException {
		System.out.println(2/a);	
		if (2 % a != 0) {
			throw new ArithmeticException("Podany argument nie jest dzielnikiem 2");
		}
		return 0; 
	}
	static String nuller(String s) throws NullPointerException {
		String empty = s;
		System.out.println(empty.toString());
		return "end";
	}
}
