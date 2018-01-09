public class Roboter
{
	static boolean left = false;
	static boolean right = true;
	static boolean up = false;
	static boolean down = false;
	static int x = 0;
	static int y = 0;
	static int i = 0; //Zählvariable für Gesamte Schritte
	static int distance = 0; //Distanz wie weit Roboter von 0/0 entfernt ist
	
  public static void main ( String[] args )
  {
	move("Left");
	move("Forward"); 
	move("Right");  
	move("Forward");
	move("Forward");
	/*move("Right");	 
	move("Forward"); 
	move("Forward");
	move("Right");   
	move("Forward");
	move("Forward");
	move("Forward"); */
	
	ausgabe();
  }//ende main
  
  public static void getPosition()
  {
	System.out.println("Position: " + x + "/" + y);
  }
  
  public static void distanceToZZ()
  {
	System.out.println("Distance zu 0/0: " + distance);
  }
  
  public static void distance()
  {
	System.out.println("Gesamte Schritte des Roboters: " + i);
  }
  
  public static void reset()
  {
	left = false;
	right = true;
	up = false;
	down = false;
	x = 0;
	y = 0;
	i = 0;
	distance = 0;
  } //ende reset
  
  public static void ausgabe()
  {
	System.out.println("--------------------------");
	getPosition();
	distance();
	distanceToZZ();
	System.out.println("--------------------------");
  
  }//ende ausgabe
  
  public static void move(String d)
  {
	switch(d){
		case "Left":{
					if(right == true)
					{     
						up = true;
						right = false;
					}else if(left == true)
							{
								left = false;
								down = true;
							}else if(up == true)
									{
										up = false;
										left = true;
									}else if(down == true)
											{
												down = false;
												right = true;
											}
											break;
		}//ende case-Left
		case "Right":{
					if(right == true)
					{     
						down = true;
						right = false;
					}else if(left == true)
							{
								left = false;
								up = true;
							}else if(up == true)
									{
										up = false;
										right = true;
									}else if(down == true)
											{
												down = false;
												left = true;
											}
											break;
		}//ende case-Right
		case "Forward":{
					if(left == true)
					{
						x--;
					}
					if(right == true)
					{
						x++;
					}
					if(up == true)
					{
						y++;
					}
					if(down == true)
					{
						y--;
					}
			//distance++;
			if((y > 0) && (x >0))
			{
				distance = y + x;
			}else if ((y<0) && (x>0))
					{
						distance = (y * (-1)) + x;
					}else if ((y>0) && (x<0))
							{
								distance = y + x * (-1);
							}else if ((y<0) && (x<0))
									{
										distance = (y *(-1)) + (x *(-1));
									}
		}
	i++;
	}//ende switch
  }    //ende move
  

  
  
}//ende class