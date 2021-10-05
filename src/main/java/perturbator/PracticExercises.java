package perturbator;

public class PracticExercises {

	public static void fibonacci(long size) {
		int n1=0, n2=1, n3=0;
		System.out.print(n1 + " ");
		System.out.print(n2+ " ");
		for (int i=2 ; i<size ; i++) {
			n3=n2+n1;
			System.out.print(n3+ " ");
			n1 = n2;
			n2 = n3;
		}
	}
	
	public static void swapnumbers(){
		int x = 32;
		int y = 23;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x=" + x  +" "+ "y=" + y);
	}
	
	public static boolean checkPalindrome(String text) {
		StringBuilder txt = new StringBuilder(text);
		StringBuilder reverse = txt.reverse();
		return txt.toString().equals(text);
		
	}
	
	public static void main(String[] args) {

//		fibonacci(13);
		swapnumbers();
		System.out.println(checkPalindrome("anitalavalatina"));
		
	}

}
