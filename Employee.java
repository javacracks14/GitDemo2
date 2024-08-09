public class Employee 
{
	private int empid;
	private String name;
	private double salary;
	
	public Employee() // default Constructor
	{
		empid=101;
		name="John";
		salary=25000.0;
		System.out.println("Default Employee Constructor...");
	}
	public Employee(int empid, String name, double salary) 
	{
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		System.out.println("Parameterized Employee Constructor...");
	}
	public void dispEmployee()
	{
		System.out.println("EMPID: "+empid+"\nNAME: "+name+"\nSALARY: "+salary);
	}
}
