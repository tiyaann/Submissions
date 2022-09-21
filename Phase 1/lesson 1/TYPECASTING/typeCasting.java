package demo1;

public class typeCasting {
	public static void main(String[] args) {
		
		//implicit
		char c = 'B';
		System.out.println("Value of c: " +c);
		int i = c;
		System.out.println("Value of i: " +i);
		float f = c;
		System.out.println("Value of f: " +f);
		long l = c;
		System.out.println("Value of l: " +l);
		double d =c;
		System.out.println("Value of d: " +d);
		
		//explicit
		double x = 35.7;
		int y = (int)x;
		System.out.println("value of x: " +x);
		System.out.println("Value of y: " +y);
	}
}


