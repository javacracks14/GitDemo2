interface Demo
{
	void disp();
}
class Outer
{
//	Demo d = new Demo()
//	{
//		@Override 
//		public void disp()
//		{
//			System.out.println("Without Lambda Expression");
//		}
//	};
	
	Demo d = ()->
	{
		System.out.println("Using Lambda Expression");
	};
}
public class LambdaExpressionDemo 
{
	public static void main(String[] args) 
	{
		Outer out = new Outer();
		out.d.disp();
	}
}