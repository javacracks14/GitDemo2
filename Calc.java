public class Calc 
{
	public void add(int a, int b)
	{
		System.out.println("Adding (i,i): "+(a+b));
	}
	public void add(int a, float b)
	{
		System.out.println("Adding (i,f): "+(a+b));
	}
	public void add(float a, int b)
	{
		System.out.println("Adding (f,i): "+(a+b));
	}
	public void add(float a, float b)
	{
		System.out.println("Adding (f,f): "+(a+b));
	}
	public void dispData()
	{
		System.out.println("Hello");
	}
}
/*
	1) No of Arguement Passed
	2) Datatype of the arguement
	3) Sequenece in which datatype is passed
*/
