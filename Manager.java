public class Manager extends Employee
{
	private double bonus;
	
	public Manager()
	{
		bonus=5000.0;
		System.out.println("Default Manager Constructor..");
	}
	public Manager(double bonus) 
	{
		super(102,"Tracy",50000.0);
		this.bonus = bonus;
		System.out.println("Parameterized Manager Constructor..");
	}
	public void dispBonus()
	{
		System.out.println("BONUS: "+bonus);
	}
}
