import java.util.*;

public class Listen
{

	public static void main(String[] args)
	{
		LinkedList liste1 = new LinkedList();
		fillList(liste1);
		printList(liste1);
	
	}
	
	static void fillList(List liste)
	{
		for (int i=0; i<10;i++)
		{
			liste.add("" + i);
		}
		
		liste.remove(3);
		liste.remove("5");
	
	}
	
	static void printList(List liste)
	{
		for (int i= 0; i<liste.size(); ++i)
		{
			System.out.println((String)liste.get(i));
		}
		System.out.println("---------");
	}


}//ende class