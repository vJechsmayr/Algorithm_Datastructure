public class PartList {

    ListElem start = new ListElem(100, "Rad");

    public PartList() {}
	
	public void insert(int partNr, String descr)
	{
		ListElem i;
		ListElem aktuell;
		ListElem vorher;
		
		i = new ListElem(partNr,descr);
		
		aktuell = start;
		vorher = null;
	
		if(findeNr(partNr) == true)
		{
			System.out.println("Teil bereits in der Liste!");
		}else
		  {
			while((aktuell != null) && (aktuell.no < partNr))
			{
				vorher = aktuell;
				aktuell = aktuell.next;
			}
			if((vorher.next != start) && (vorher != null))
			{
				vorher.next = i;
				i.next = aktuell;
			}else
			  {
				start = i;
				i.next = aktuell;
			  }
		  }
	
	}//ende insertSorted

    public void delete(int no)
	{
        ListElem temp = start;
        while ((temp.getNextElement() != null) && !(temp.getNumber() == no))
		{
            if(temp.getNextElement().getNumber() == no)
			{
                if(temp.getNextElement().getNextElement()!=null)
				{
                    temp.setNextElem(temp.getNextElement().getNextElement());
				}
                else{
                    temp.setNextElem(null);
                    break;
                }
            }
            temp = temp.getNextElement();
        }
    }

    public boolean findeNr(int no)
	{
        ListElem temp = start;
        while (temp != null)
		{
            if(temp.getNumber() == no)
			{
				return true;
			}else 
			  {
				  temp = temp.next;
			  }
        }
        return false;
    }

    public ListElem getFirstElem()
	{
        return start;
    }

    public void writeListe()
	{
        ListElem temp = start;
        while(temp != null)
		{
            System.out.println("no: " + temp.getNumber());
			System.out.println("description: " + temp.getDescr());
			System.out.println("--------------------------------------------------");
            temp = temp.getNextElement();
        }
    }
	
	public boolean writePart(int partNr)
	{
		ListElem temp = start;
        while (temp != null)
		{
            if(temp.getNumber() == partNr)
			{
				System.out.println();
				System.out.println("-no: " + temp.getNumber());
				System.out.println("-description: " + temp.getDescr());

				if(temp.hasSub() == true)
				{
					writePart(temp.subparts.getPartNr());
					System.out.println("---count: " + temp.subparts.getStueck());
				}			
				return true;
			}else 
			  {
				  temp = temp.next;
			  }
        }
        return false;
	}
	
	public boolean connect(int partNr, int componentNr, int stk)
	{
		 ListElem temp = start;
			while (temp != null)
			{
				if(temp.getNumber() == partNr)
				{
					temp.setSubPart(componentNr, stk);
					return true;
				}else 
				  {
					  temp = temp.next;
				  }
			}
			return false;
	}

    public static void main(String[] args) {
        PartList auto = new PartList();
		
		auto.insert(101,"Felge");
		auto.insert(102,"Reifen");
		auto.connect(100,101,4);
		auto.insert(103, "Bremse");
		auto.insert(104, "Bremsscheibe");
		auto.connect(103,104,1);
		auto.insert(117, "Rahmen");
		auto.connect(101,117,1);
		auto.insert(118, "Speichen");
		auto.connect(101,118,8);
		auto.writeListe();
    }
}

class ListElem 
{

    //Object obj;
	int no;
	String description = new String();

    ListElem next;
	ComponentElem subparts;

    public ListElem(int nr, String descr) 
	{
        this.no = nr;
		this.description  = descr;
        next = null;
		subparts = null;
    }
	
	public boolean hasSub()
	{
		if(subparts != null)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public void setSubPart(int nr, int stk)
	{
		this.subparts = new ComponentElem(nr,stk);
	}

    public void setNextElem(ListElem nextElem) 
	{
        this.next = nextElem;
    }

    public ListElem getNextElement() 
	{
        return next;
    }

    public int getNumber()
	{
        return no;
    }
	
	public String getDescr()
	{
		return description;
	}
	
} //ende ListElem

class ComponentElem
{
	int count;
	int partNr;
	
	ComponentElem next;
	
	public ComponentElem(int nr, int stk)
	{
		this.partNr = nr;
		this.count = stk;
	}
	
	public void setNextComp(ComponentElem nextComp)
	{
		this.next = nextComp;
	}
	
	public ComponentElem getNextComp()
	{
		return next;
	}
	
	public int getPartNr()
	{
		return partNr;
	}
	
	public int getStueck()
	{
		return count;
	}
}//ende ComponentElem





