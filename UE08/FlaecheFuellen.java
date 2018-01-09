public class FlaecheFuellen {
	static char[][] Zeichenflaeche = new char[20][20];
	
	public static int fill(int x, int y, char c)
	{
		if((x >= 0) && (Zeichenflaeche[x][y] == '.'))
		{	
			fill(x-1,y,c);
		}
		
		return 0;
	}
	
	public static void ausgabe()
	{
		for(int i = 0; i <20;i++)
		{
			for(int j = 0; j<20; j++)
			{
				System.out.print(Zeichenflaeche[i][j]);
			}
			System.out.println();
		}
	
	}
	public static void fillArray()
	{
		for(int i = 0; i <20;i++)
			{
				for(int j = 0; j<20; j++)
				{
					Zeichenflaeche[i][j] = '.';
				}
			}

		Zeichenflaeche[0][3] = 'S';
		Zeichenflaeche[0][14] = 'G';
		Zeichenflaeche[1][2] = 'S';
		Zeichenflaeche[1][14] = 'G';
		Zeichenflaeche[2][3] = 'S';
		Zeichenflaeche[2][13] = 'G';
		Zeichenflaeche[3][3] = 'S';
		Zeichenflaeche[3][12] = 'G';
		Zeichenflaeche[4][4] = 'S';
		Zeichenflaeche[4][10] = 'G';
		Zeichenflaeche[5][6] = 'S';
		Zeichenflaeche[5][8] = 'G';
		Zeichenflaeche[6][6] = 'S';
		Zeichenflaeche[6][9] = 'G';
		Zeichenflaeche[7][5] = 'S';
		Zeichenflaeche[7][6] = 'S';
		Zeichenflaeche[7][7] = 'S';
		Zeichenflaeche[7][8] = 'S';
		Zeichenflaeche[8][9] = 'S';
		Zeichenflaeche[9][9] = 'S';
		Zeichenflaeche[10][10] = 'S';
		Zeichenflaeche[10][11] = 'S';
		Zeichenflaeche[11][11] = 'S';
		Zeichenflaeche[7][17] = 'S';
		Zeichenflaeche[7][18] = 'B';
		Zeichenflaeche[7][19] = 'B';
		Zeichenflaeche[8][3] = 'R';
		Zeichenflaeche[8][4] = 'G';
		Zeichenflaeche[8][5] = 'B';
		Zeichenflaeche[8][16] = 'S';
		Zeichenflaeche[8][17] = 'S';
		Zeichenflaeche[8][15] = 'B';
		Zeichenflaeche[9][5] = 'S';
		Zeichenflaeche[9][4] = 'B';
		Zeichenflaeche[9][14] = 'G';
		Zeichenflaeche[10][13] = 'S';
		Zeichenflaeche[10][3] = 'B';
		Zeichenflaeche[11][12] = 'B';
		Zeichenflaeche[12][12] = 'S';
		Zeichenflaeche[13][13] = 'S';
		Zeichenflaeche[14][13] = 'S';
		Zeichenflaeche[14][12] = 'S';
		Zeichenflaeche[14][11] = 'S';
		Zeichenflaeche[15][12] = 'S';
		Zeichenflaeche[11][3] = 'S';
		Zeichenflaeche[12][4] = 'G';
		Zeichenflaeche[12][2] = 'G';
		Zeichenflaeche[13][9] = 'G';
		Zeichenflaeche[13][10] = 'G';
		Zeichenflaeche[13][8] = 'G';
		Zeichenflaeche[13][7] = 'G';
		Zeichenflaeche[14][9] = 'G';
		Zeichenflaeche[15][8] = 'G';
		Zeichenflaeche[16][8] = 'G';
		Zeichenflaeche[17][7] = 'G';
		Zeichenflaeche[16][9] = 'G';
		Zeichenflaeche[16][10] = 'B';
		Zeichenflaeche[16][11] = 'G';
		Zeichenflaeche[16][12] = 'B';
		Zeichenflaeche[16][13] = 'G';
		Zeichenflaeche[16][14] = 'B';
		Zeichenflaeche[16][15] = 'G';
		Zeichenflaeche[16][16] = 'B';
		Zeichenflaeche[16][17] = 'G';
		Zeichenflaeche[16][18] = 'B';
		Zeichenflaeche[16][19] = 'S';
		Zeichenflaeche[17][16] = 'S';
		Zeichenflaeche[18][16] = 'S';
		Zeichenflaeche[19][17] = 'S';
		Zeichenflaeche[17][6] = 'S';
		Zeichenflaeche[18][5] = 'S';
		Zeichenflaeche[19][4] = 'S';
		Zeichenflaeche[12][0] = 'S';
		Zeichenflaeche[12][1] = 'S';
		Zeichenflaeche[12][3] = 'S';
		Zeichenflaeche[12][7] = 'S';
		Zeichenflaeche[12][5] = 'B';
		Zeichenflaeche[12][6] = 'B';
		
	
	}

	public static void main(String args[])
	{
		fillArray();
		
		System.out.println("Pixel gefuellt: " + fill(2,7,'R'));
		
		ausgabe();
		
		System.out.println();
	}
}//ende class binSuche

