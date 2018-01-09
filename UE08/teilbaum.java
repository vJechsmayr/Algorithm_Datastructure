// http://www.java-forum.org/java-basics-anfaenger-themen/152205-ebene-knotens-binaerbaum-ermitteln.html

public int getDepth(String key)
    {
        return sucheTiefe(root, key);
        
    } //end getDepth
    
    private int sucheTiefe(Node curr, String key)
    {
        if(curr == null)
		{
            return -1;
		}
        
        if(curr.item.key == key)
        {    
			return 0;
		}
        
        int depthL = sucheTiefe(curr.left, key);
                
        if(depthL != -1) 
		{
			return depthL;
		}
        
        int depthR = sucheTiefe(curr.right, key);
        
        if(depthR != -1)
        {
			return depthR+1;
		}
            
        return -1;
            
    } //end sucheTiefe

	boolean move( )
	{
		boolean hasMoved := false
		int keyOfNewParent := 0
		
		
		return hasMoved
	}

	public class Node
{
    Item item;
    Node left;
    Node right;
 
    public Node(Item item, Node left, Node right)
    {
        this.item = item;
        this.left = left;
        this.right = right;     
        
    } //end Node
    
} //end class Node

public class Item
{
    String key;
        
    public Item(String key)
    {
        this.key = key;
        
    } //end Item
    
} //end class Item
