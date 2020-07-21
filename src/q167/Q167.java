package q167;

public class Q167 {

	public static void main(String[] args) {		
		int x = 100;
		int a = x++;
		System.out.println(a);
		System.out.println(x);
		int b = ++x;
		System.out.println(b);
		int c = x++;
		System.out.println(c);
		System.out.println(x);             
		int d = (a <b) ? (a < c) ? a : ((b < c) ? b : c ): x;

		System.out.println(d);
	}

}
