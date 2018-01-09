public class Queue {

    private QueueElem[] a;

    public Queue(int capacity) 
	{
        QueueElem[] tempQueue = new QueueElem[capacity];
        a= tempQueue;
    }
	
	public int count(int p)
	{
		int x = 0;
		int i = 0;
		while(a[i] != null)
		{
			if(a[i].getPrio() == p)
			{
				x++;
			}
			i++;
		}
		
		return x;
	}
	
	public void init()
	{
		Queue PQ = new Queue(1);
	}
	
	public int nrElems()
	{
		int i = 0;
		while(a[i] != null)
		{
			i++;
		}
		return i;
	}
	
    public boolean isInArray(int p)
	{
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i] == null || a[i].getPrio() == p)
			{
				return true;
			}
		}
		return false;
	}
	
	public void enqueue(int p, String v) 
	{
		QueueElem neu = new QueueElem(p,v);
		QueueElem temp;
		int i=0;
		
		try 
		{
			while(i<a.length) 
			{
				if (a[i] == null) 
				{
					a[i] = neu;
					break;
				}
			
				if(isInArray(p) == true)
				{
					if(a[i].getPrio() == p)
					{
						while(i<a.length-1)
						{
							temp = a[i];
							a[i] = neu;
							neu = a[i+1];
							
							i++;
						}
					}
				}else if((isInArray(p) == false) && (a[i] != null))
						{
							while((a[i].getPrio() > p) || (a[i] != null))
							{
								i++;
							}
							if(a[i] == null)
							{
								a[i] = neu;
								break;
							}
							if(a[i].getPrio() <= p)
							{
								while(i<a.length-1)
								{
									temp = a[i];
									a[i] = neu;
									neu = a[i+1];
									a[i+1] = temp;
								}
							}
						}
				i++;
			}
        } catch (ArrayIndexOutOfBoundsException e) //Speicher erweitern
			{
				int j = 0;
				
			   QueueElem[] temp2 = new QueueElem[a.length+5];
				a = temp2;
				while(j<a.length) 
				{
					if (a[j] == null)
					{
						a[j] = neu;
						break;
					}
					j++;
				}
			}
    }
	
    public String dequeue() 
	{
        String result = a[0].getValue();
        a[0] = null;
        for (int i=1; i<a.length;i++) 
		{
            a[i-1] = a[i];
        }
        return result;
    }

    public void deleteAll() 
	{
		int i=0;
		while((i<a.length) && (a[i] != null))
		{
            a[i] = null;
			i++;
        }
    }
	
	public void deleteAll(int p)
	{
		int i=0;
		
		while((i<a.length) && (a[i] != null))
		{
			if(a[i].getPrio() == p)
			{
				a[i] = null;
				a[i] = a[i+1];
			}
			i++;
		}
	}
	
	public void writeQueue()
	{
		int i=0;
		
		while((i< a.length) && (a[i] != null))
		{
            System.out.println("Priority: " + a[i].priority + " Value: " + a[i].value);
			i++;
        }
	}
	
	public Queue invert()
	{
		Queue neu = new Queue(a.length);
		QueueElem[] temp = a;
		QueueElem[] tempmax = a;
		int max = 0;
		int i = 0;
		int j = 0;
		
		//Maximal Priorität als aktuellen Liste suchen und in max speichern
		while(tempmax[i] != null)
		{
			if(tempmax[i].getPrio() > max)
			{
				max = tempmax[i].getPrio();
			}
			i++;
		}
		
		while(temp[j] != null)
		{
			neu.enqueue(max-temp[j].getPrio(), temp[j].getValue());
			j++;
		}
	return neu;
	}

	public static void main(String args[])
	{
		Queue neu = new Queue(10);
		Queue inneu;
		neu.enqueue(4,"iso");
		neu.enqueue(2,"abc");
		neu.enqueue(5,"x");
		neu.enqueue(1,"abc");
		neu.enqueue(4,"bap");
		neu.enqueue(2,"xvf");
		neu.enqueue(4,"buep");
		System.out.println("Anzahl Prio 4: " + neu.count(4));
		System.out.println("Anzahl Elemente: " + neu.nrElems());
		neu.writeQueue();
		System.out.println("-------------------");
	}
	
}//ende class Queue

class QueueElem {
	int priority;
	String value = new String();
	
	public QueueElem(){	}

	public QueueElem(int p, String v)
	{
		this.priority = p;
		this.value = v;
	}
	
	public int getPrio()
	{
		return this.priority;
	}
	
	public String getValue()
	{
		return this.value;
	}	
}