package mayu;

public class encapsulation {

	int a;
	int b;
	
	public int geta()
	{
		return a;
	}
	public int getb()
	{		return b; 
}
	
	public void ea(int c)
	{a=c;}
	public void eb(int d)
	{b=d;
		
	}
	
public static void main (String[] args) 
{
	encapsulation ep = new encapsulation();
			ep.ea(12);
	        ep.eb(900);
	        System.out.println("a" +ep.geta()+ep.getb());
	   double g = 12.0;
	   int  ff = (int) g;
	   System.out.println(ff);
	  
	   
	   
	   
}
}