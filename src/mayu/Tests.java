package mayu;

public interface Tests {
interface I1 {
	 
	public void Test1() ;	
}
interface I2 {
	
	public void Test3() ;	
}
interface I3 {
	
	public void Test5() ;	
}
public class Tesp extends masala  implements I1,I2,I3{
	public void Test1() {
		System.out.println("nl");
		
	}
	public void Test3() {
		System.out.println("clala");
	}
		public void Test5() {
			System.out.println("mmlml000");
			
	}
}

public static void main (String[] args)
{
	Tesp tp=new Tesp();
	tp.Test1();
	tp.Test3();
	tp.Test5();
	
	}
}
