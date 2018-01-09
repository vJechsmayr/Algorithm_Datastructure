public class CodeGenerator
{
  public static String umkehren(String s)
  {
    String code = new String();
	char hilf;
	char hilfAlt;
	int i = s.length()-1;
	hilfAlt = s.charAt(i);
    while(i >= 0)
	{
		hilf = s.charAt(i);
		if((hilf == ' ') && (hilfAlt == ' '))
		{
				//nix
		}else
		{
			code = code + s.charAt(i);
		}
	    i--;
		hilfAlt = hilf;
	}
	
	int palis = checkPalindrom(code);
	System.out.println("Palindrome: " + palis);
	
    return code;
  }//ende umkehren
  
  public static int checkPalindrom(String s)
  {
		int x = 0;	//zählt Palindrome
		int i = s.length()-1; //länge des Strings
		String wort = new String();
		String wort2 = new String();
		char hilf;
		
		hilf = s.charAt(i);
		while(i>=0)
		{ 
		  System.out.println("i: " + i);
		  System.out.println("hilf: " + hilf);
			while(hilf == ' ')
			{
				i--;
				hilf = s.charAt(i);
				System.out.println("hilf: " + hilf);
			}
			wort +=s.charAt(i);
			while(hilf != ' ')
			{
				i--;
				hilf = s.charAt(i);
				wort += s.charAt(i);
				
				System.out.println("i und hilf: " + i + " - " + hilf);
				System.out.println("wort: " + wort);
			}
			
			if (wort.equals(umkehren(wort)))
			{
				x++;
				 System.out.println("x: " + x);
				 System.out.println("wort: " + wort);
			}
			wort = "";
			i--;
		}
		
	 System.out.println("-----ENDE-----");
	 System.out.println("wort: " + wort);
	 System.out.println("x: " + x);
	 
	return x;	
  
  }//ende checkPalindrom
  
 
  
  
  
  

  public static void main (String[] args)
  {
	String input = Input.readString();
    System.out.println(umkehren(input));
  }//ende Main
}//ende Class