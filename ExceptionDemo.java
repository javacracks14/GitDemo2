public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		int a=10,b=0,c;
		try
		{
			c=a/b;
			System.out.println("Division: "+c);
		}
		catch(ArithmeticException ex)
		{
			System.err.println("Error: "+ex);
		}
		System.out.println("Stop");
	}
}