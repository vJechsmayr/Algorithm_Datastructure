public class Palindrom
{
	public static int generateCode(String text)
	{
		int palis = 0; //Anzahl der Palindrome
		String wort = new String();
		String code = new String();
		String cText = new String();
		int i = text.length()-1;
		
		cText = cleanSpace(text); //überflüssige Leerzeichen entfernen
		
		while(code.length() <= cText.length())
		{
			wort = findeWort(text);
			if (istPali(wort) == true)
			{
				palis++;
			}
			
			code += umkehren(wort);
			
			if(istPali(wort))
			{
				palis++;
			}
		}
		System.out.println("CODE: " + code);
	
		return palis;
	}

	public static String findeWort(String text)
	{
		int i = text.length()-1;
		String wort = new String();
		
		while(i>=0)
		{
			while(text.charAt(i) == ' ')
			{
				i--;
			}
			while(text.charAt(i) != ' ')
			{
				wort += text.charAt(i);
				i--;
			}
			//i--;
		}
	
		return wort;
	}	
	
	public static String cleanSpace(String s)
	  {
		String cleaned = new String();
		char hilf;
		char hilfAlt;
		int i = 0; //= s.length()-1;
		hilfAlt = s.charAt(i);
		while(i <= s.length()-1)
		{
			hilf = s.charAt(i);
			if((hilf == ' ') && (hilfAlt == ' '))
			{
					//nix
			}else
			{
				cleaned = cleaned + s.charAt(i);
			}
			i++;
			hilfAlt = hilf;
		}
		return cleaned;
	  }//ende cleanSpace
	
	public static String umkehren(String s)
	{
		String code = new String();
		int i = s.length()-1;
		
		while(i >= 0)
		{
		  code += s.charAt(i);
		  i--;
		}
		return code;
	}

	public static boolean istPali(String wort)
	{
		int i = wort.length();
		
		if(i <= 1)
		{
			return true;
		}
		if (wort.charAt(0) != wort.charAt(i-1))
		{
			return false;
		}
		
		return istPali(wort.substring(1,i-1));
		//return false;
	}
  
  public static void main ( String[] args )
  {
	System.out.println("Bitte geben Sie Text ein: ");
	 String input = Input.readString();
	 System.out.println("Palindrome: " + generateCode(input));
  }
}