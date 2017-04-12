public class Problem {
	public static void main(String[] args) {
		int result = 0;
		for(int i = 0; i<5;i++) {
			if(i == 3) {
				result = result + 10; // result += 10;
			} else {
				result = result + i; // result += i;	
			}
		}
		System.out.println(result);
		/*System.out.println("result=" + result + " + i=" + i + " suma: " + (result+i));
		result=0 + i=0 suma: 0
		result=1 + i=1 suma: 2
		result=3 + i=2 suma: 5
		result=6 + i=3 suma: 9
		result=10 + i=4 suma: 14*/
	}
}
