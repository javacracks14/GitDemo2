public class RelativeMain 
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.action();
		c.silent();
		c.speak();
		
		Parent p = new Parent();
		p.speak();
	}
}