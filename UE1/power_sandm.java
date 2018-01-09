public class power_sandm{
	public static void main(String[] args) {
		System.out.println("Bitte geben Sie eine Zahl ein:");
		long p = Input.readLong();
		while (p <= 0)
		{
			System.out.println("Bitte geben Sie eine Zahl (größer als 0) ein!");
			p = Input.readLong();
		}
		System.out.println("Bitte geben Sie eine zweite Zahl ein:");
		long q = Input.readLong();
		while (q <= 0)
		{
			System.out.println("Bitte geben Sie eine Zahl (größer als 0) ein!");
			q = Input.readLong();
		}
		System.out.println(power(p,q));
	}
 
	static long power(long z1, long z2) {
		long res = 1;
		long akt = z1;
		int x=0;
		
		while(z2 > 0) 
		{
			if ( (z2%2) == 1)
			{
				res = res * akt;
			}
			akt = akt * akt;
			z2 = z2/2;
			x++;
		}
		System.out.println("Durchlauf: " + x);
		return res;
	}
}