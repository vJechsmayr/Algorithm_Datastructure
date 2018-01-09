public class PriorityListedoppelt {

	ListElem first = new ListElem();
	ListElem last = new ListElem();

	public boolean enqueue(int p, String v)
	{
		ListElem temp = new ListElem(p,v);
		
		if(first == null)
		{
			first = temp;
			last = temp;
			temp.nextElem = null;
			temp.prevElem = null;
			return true;
		}
		
		ListElem suc = first;
		
		while((suc != null) && (suc.priority > p))
		{
			suc = suc.nextElem;
		}//ende while
		
		if(suc == null)
		{
			last.nextElem = temp;
			temp.prevElem = last;
			temp.nextElem = null;
			last = temp;
			return true;
		}
		
		if(suc.prevElem == null)
		{
			first.prevElem = temp;
			temp.nextElem = first;
			temp.prevElem = null;
			first = temp;
			return true;
		}
		
		suc.prevElem.nextElem = temp;
		temp.prevElem = suc.prevElem;
		temp.nextElem = suc;
		suc.prevElem = temp;
		return true;
	}
	
	public int count(int p)
	{
		ListElem temp = first;
		int x = 0;
		while(temp.nextElem != last)
		{
			if(temp.getPrio() == p)
			{
				x++;
			}
			temp = temp.getNextElem();
		}
		
		return x;
	}
	
	public int nrElems()
	{
		ListElem temp = first;
		int x = 0;
		while(temp.nextElem != last)
		{
				x++;
			temp = temp.getNextElem();
		}
		
		return x;
	}
	
	public String dequeue()
	{
		String rueck = new String();
		
		if(first == null)
		{
			//fehler
		}
		
		ListElem temp = first;
		first = first.nextElem;
		rueck = temp.getValue();
		
		//delete temp;
		//normalfall mitte
				if((temp != first) && (temp.nextElem !=last))
				{
					temp.getPrevElem().nextElem = temp.nextElem;
					temp.getNextElem().prevElem = temp.prevElem;
				}else  if((temp == first) && (temp.nextElem != last)) //Erstes Element löschen
						{
							first = temp.nextElem;
							temp.getNextElem().prevElem = null;
						}else if((temp!= first) && (temp.nextElem == last)) //Letzes Element löschen
								{
									last = temp.prevElem;
									temp.getPrevElem().nextElem = null;
								}else if((temp == first) && (temp.nextElem == last)) //nur 1 Element in Liste
										{
											first = null;
											last = null;
										}
		return rueck;
	}
	
	public void deleteAll(int priority)
	{
		ListElem temp = first;
		while(temp.nextElem != last)
		{
			if(temp.getPrio() == priority)
			{
				//normalfall mitte
				if((temp != first) && (temp.nextElem !=last))
				{
					temp.getPrevElem().nextElem = temp.nextElem;
					temp.getNextElem().prevElem = temp.prevElem;
				}else  if((temp == first) && (temp.nextElem != last)) //Erstes Element löschen
						{
							first = temp.nextElem;
							temp.getNextElem().prevElem = null;
						}else if((temp!= first) && (temp.nextElem == last)) //Letzes Element löschen
								{
									last = temp.prevElem;
									temp.getPrevElem().nextElem = null;
								}else if((temp == first) && (temp.nextElem == last)) //nur 1 Element in Liste
										{
											first = null;
											last = null;
										}
			}//ende if
			temp = temp.getNextElem();
		}//ende while
	}
	
	public void deleteAll()
	{
		ListElem temp = first;
		while(temp.nextElem != last)
		{
			
				//normalfall mitte
				if((temp != first) && (temp.nextElem !=last))
				{
					temp.getPrevElem().nextElem = temp.nextElem;
					temp.getNextElem().prevElem = temp.prevElem;
				}else  if((temp == first) && (temp.nextElem != last)) //Erstes Element löschen
						{
							first = temp.nextElem;
							temp.getNextElem().prevElem = null;
						}else if((temp!= first) && (temp.nextElem == last)) //Letzes Element löschen
								{
									last = temp.prevElem;
									temp.getPrevElem().nextElem = null;
								}else if((temp == first) && (temp.nextElem == last)) //nur 1 Element in Liste
										{
											first = null;
											last = null;
										}
			temp = temp.getNextElem();
		}//ende while
	}
	
	public void writeQueue()
	{
		ListElem temp = first;
		while(temp.nextElem != last)
		{
			if(temp.getPrio() != -1)
			{
				System.out.println("Priority: " + temp.getPrio() + " - Value: " + temp.getValue());
				temp = temp.getNextElem();
			}else{
				break;
			}
		}
	
	}
	
	public void init()
	{
		//was machen?
		first.nextElem = last;
		first.prevElem = null;
		last.nextElem = null;
		last.prevElem = first;
	}

	public PriorityListedoppelt invert()
	{
		PriorityListedoppelt neu = new PriorityListedoppelt();
		ListElem temp = first;
		ListElem tempmax = first;
		int max = 0;
		
		//Maximal Priorität als aktuellen Liste suchen und in max speichern
		while(tempmax.nextElem != last)
		{
			if(tempmax.getPrio() > max)
			{
				max = tempmax.getPrio();
			}
			tempmax = tempmax.getNextElem();
		}
		
		while(temp.nextElem != last)
		{
			neu.enqueue(max-temp.getPrio(), temp.getValue());
			temp = temp.getNextElem();
			
		}
	return neu;
	}
	
    public static void main(String[] args) {
		PriorityListedoppelt queue = new PriorityListedoppelt();
		PriorityListedoppelt inqueue;
		queue.init();
		
		queue.enqueue(4,"iso");
		queue.enqueue(2,"abc");
		queue.enqueue(5,"x");
		queue.enqueue(1,"abc");
		queue.enqueue(4,"bap");
		queue.enqueue(2,"xvf");
		queue.enqueue(4,"buep");
		System.out.println("Anzahl Prio 4: " + queue.count(4));
		System.out.println("Anzahl Elemente: " + queue.nrElems());
		inqueue = queue.invert();
		queue.deleteAll(4);
		queue.writeQueue();
		System.out.println("Anzahl Prio 2: " + queue.count(2));
		System.out.println("Anzahl Elemente: " + queue.nrElems());
		System.out.println("-------------------");
		inqueue.writeQueue();
	
    }//ende main
}//ende PriorityListedoppelt

class ListElem {


    int priority = -1;
	String value = new String();

    ListElem nextElem;
	ListElem prevElem;
	
	public ListElem()
	{
		nextElem = null;
		prevElem = null;
	}

	public ListElem(int prio)
	{
		this.priority = prio;
		nextElem = null;
	}
	
    public ListElem(int prio, String val) 
	{
        this.priority = prio;
		this.value = val;
        nextElem = null;
	}

    public void setNextElem(ListElem nextElem) 
	{
        this.nextElem = nextElem;
	}
    
    public void setPrevElem(ListElem prevElem) 
	{
        this.prevElem = prevElem;
	}

    public ListElem getNextElem() 
	{
        return nextElem;
	}
	
	public boolean hasNextElem()
	{
		if(getNextElem() != null)
		{
			return true;
		}else
			{
				return false;
			}
	}
    
    public ListElem getPrevElem() 
	{
        return this.prevElem;
	}

    public int getPrio() 
	{
        return priority;
	}
	
	public String getValue() 
	{
        return value;
	}
} 
