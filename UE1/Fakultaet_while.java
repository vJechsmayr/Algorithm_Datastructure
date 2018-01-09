public class Fakultaet_while{
	public static void main(String[] args) {
		System.out.println("Bitte geben Sie eine Zahl ein fuer welche die Fakultaet berechnet werden soll:");
		int zahl = Input.readInt();
		while (zahl <= 0)
		{
			System.out.println("Bitte geben Sie eine Zahl ein!");
			zahl = Input.readInt();
		}
		System.out.println("Die Fakultaet von " + zahl + " ist " + fakt(zahl));
	}
 
	static long fakt(int z) {
		long fakultaet = 1;
		int zahl = 1;
		
		while (zahl <=z)
		{
			fakultaet = fakultaet * zahl;
			zahl++;
		}
 
		return fakultaet;
	}
}