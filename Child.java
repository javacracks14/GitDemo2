public class Child extends Parent
{
	public Child()
	{
		System.out.println("Child Welcoming Guests...");
	}
	@Override
	public void speak()
	{
		System.out.println("Child is talking to relative");
	}
	public void silent()
	{
		System.out.println("Child is sitting silent");
	}
}
/*
	1) Name of the method should be same in parent & child class
	2) No of Arguement passed should be same
	3) Datatype & Sequence should be same
	4) return type should be same
*/