public class Schaltjahr{
	public static void main(String[] args) {
		System.out.println("Bitte geben Sie ein Monat(zwischen 1 und 12) ein:");
		int monat = Input.readInt();
		while (monat < 1 || monat >  12)
		{
			System.out.println("Bitte geben Sie ein Monat ein (zwischen 1 und 12) ein:");
			monat = Input.readInt();
		}
		System.out.println("Bitte geben Sie ein Jahr(zwischen 1000 und 3000) ein:");
		int jahr = Input.readInt();
		while (jahr <= 0)
		{
			System.out.println("Bitte geben Sie ein Jahr(zwischen 1000 und 3000) ein:");
			jahr = Input.readInt();
		}
		System.out.println("Tage im Monat: " + daysInMonth(monat,jahr));
	}
	
	static int daysInMonth(int m, int j)
	{
	  int days = 0;
	
	switch (m) {
            case 1:  days = 31;
                     break;
            case 2:  days = Februar(j);
                     break;
            case 3:  days = 31;
                     break;
            case 4:  days = 30;
                     break;
            case 5:  days = 31;
                     break;
            case 6:  days = 30;
                     break;
            case 7:  days = 31;
                     break;
            case 8:  days = 31;
                     break;
            case 9:  days = 30;
                     break;
            case 10: days = 31;
                     break;
            case 11: days = 30;
                     break;
            case 12: days = 31;
                     break;
        }
		return days;
	}
	
	static int Februar(int jahr)
	{
		int tage = 0;
		//istSchaltjahr?
	if( (jahr%4 == 0) && (jahr%100 != 0 || jahr%400 == 0))
			{	//System.out.println("ist Schaltjahr!");
				tage = 29;
			}else{//System.out.println("ist kein Schaltjahr!");
				tage = 28;
				 }
		return tage;
	}
}

