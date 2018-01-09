public class test
{	
  public static void main ( String[] args )
  {
		int n = 210;
		int p = 2;
		String s = "";
		boolean isP = true;
		
		// (1)
		System.out.println("(1)");
		ausgabe(n, p, s, isP);
		while (n > 1) {
			while (n%p == 0) {
				s = s + " " + p;
				n = n / p;
				// (2)
				System.out.println("(2)");
				ausgabe(n, p, s, isP);
			} // while
			isP = false;
			while((n > 1) && (isP == false)) {
				p = p + 1;
				isP = true;
				// (3)
				System.out.println("(3)");
				ausgabe(n, p, s, isP);
				for(int i = 2; i<= p-1; i++) {
					if (p%i == 0) {
						isP = false;
					} // if
				} // for
				// (4)
				System.out.println("(4)");
				ausgabe(n, p, s, isP);
			} // while (!isP)
		} // while (n >1)
		// (5)
		System.out.println("(5)");
		ausgabe(n, p, s, isP);
	}//ende Main
	public static void ausgabe(int n, int p, String s, boolean isP)
	{
		System.out.println("-----------------");
		System.out.println("n: " + n);
		System.out.println("s: " + s);
		System.out.println("p: " + p);
		System.out.println("isP: " + isP);
		System.out.println("-----------------");
	}
	
}//ende class