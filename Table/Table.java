public class Table {
		public static void main (String[] args) {
		float tab[] = {3.5f, 7.9f};
		System.out.println(tab[0] + " | " + tab[1]);
		
		System.out.println("-------------");
		
		double tab1[] = new double[5];
		byte i = -1;
		int j = 0;	
		
		while(++i <= 4) {	
			System.out.println("element " + i + " = " + tab1[i]);
		}
		
		System.out.println("-------------");
		
		while (j < tab1.length) {
			tab1[j] = j + 1.189d;			
			System.out.println("element " + j + " = " + tab1[j]);
			j++;
		}
		
		System.out.println("-------------");
				
		for(double var: tab1) {
			System.out.println("element " + 
			((int)(var - 1.189d)) + " = " + Math.round(var*Math.PI));
		} 
	}
}
