package mayu;

public class Checked {
int i = 10;
int b=0;
int c;

public void method()   {
	try {

	c=i/b;
}
catch (Exception e)
{
	e.printStackTrace();
	}}
public static void main (String[] args) throws Exception
{
	Checked ck = new Checked();
	ck.method();
	System.out.println("Mayuri");
	}
}
