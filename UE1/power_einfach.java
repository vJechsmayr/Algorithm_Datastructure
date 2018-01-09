public class power_einfach{
	public static void main(String[] args) {
		System.out.println("Bitte geben Sie eine Zahl ein:");
		int p = Input.readInt();
		while (p <= 0)
		{
			System.out.println("Bitte geben Sie eine Zahl (größer als 0) ein!");
			p = Input.readInt();
		}
		System.out.println("Bitte geben Sie eine zweite Zahl ein:");
		int q = Input.readInt();
		while (q <= 0)
		{
			System.out.println("Bitte geben Sie eine Zahl (größer als 0) ein!");
			q = Input.readInt();
		}
		
		System.out.println(power(p,q));
	}
 
	static long power(int z1, int z2) {
		int count = 1;
		int sum = 1;
		int x = 0;
 
		while( count <= z2)
		{
			sum = sum *z1; 
			count++;
			x++;
		}
		System.out.println("Durchlauf: " + x);
		return sum;
	}
}