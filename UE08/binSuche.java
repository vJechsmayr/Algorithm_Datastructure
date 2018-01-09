public class binSuche {
	public static int binarySearch(float[] a, float val)
	{
		int Anfang = 0;
		int Ende = a.length-1;
		int i = binSuchen(Anfang, Ende, val, a);
		
		return i;
	}
	
	public static int binSuchen(int A, int E, float[] a, float val)
	{
		if(A > E)
		{
			return -1;
		}
		int mitte = A + ((E - A)/2);
		
		if(val > a[mitte])
		{
			return binSuchen(mitte+1, E, val, a);
		}
		
		if(val < a[mitte])
		{
			return binSuchen(A, mitte-1, val, a);
		}
		return mitte;
	}

	public static void main(String args[])
	{
		float[] feld = new float[8];
		feld[0] = (float)1.23;
		feld[1] = (float)2.46;
		feld[2] = (float)4.23;
		feld[3] = (float)5.0;
		feld[4] = (float)6.15;
		feld[5] = (float)7.5;
		feld[6] = (float)8.75;
		feld[7] = (float)10.10;

		System.out.println("Index von 4.0: " + binarySearch(feld, (float)4.0));
		System.out.println("Index von 6.15: " + binarySearch(feld, (float)6.15));
	}
}//ende class binSuche

