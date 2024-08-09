// Simple If Statement
//public class ControlStatementsDemo 
//{	
//	public static void main(String[] args) 
//	{
//		int value = 1;
//		if(value>0)
//		{
//			System.out.println("Positive Number..");
//		}
//	}
//}

//Simple If-else Statement
//public class ControlStatementsDemo 
//{	
//	public static void main(String[] args) 
//	{
//		int value = 1;
//		if(value>0)
//		{
//			System.out.println("Positive Number..");
//		}
//		else
//		{
//			System.out.println("Negative Number..");
//		}
//	}
//}

// Nested If-Else Statement
//public class ControlStatementsDemo 
//{	
//	public static void main(String[] args) 
//	{
//		int value = 0;
//		if(value>=0)  // outer if
//		{
//			if(value==0) // inner if -- Inner if is also known as Nested If
//			{
//				System.out.println("Number is Zero");
//			}
//			else
//			{
//				System.out.println("Positive Number..");
//			}
//		}
//		else
//		{
//			System.out.println("Negative Number..");
//		}
//	}
//}


// Multiple If-Else Statement
public class ControlStatementsDemo 
{	
	public static void main(String[] args) 
	{
		int value = 10000;
		if(value>=1 && value<10)
		{
			System.out.println("Single Digit");
		}
		else if(value>=10 && value<100)
		{
			System.out.println("Two Digits");
		}
		else if(value>=100 && value<1000)
		{
			System.out.println("Three Digits");
		}
		else if(value>=1000 && value<10000)
		{
			System.out.println("Four Digits");
		}
		else
		{
			System.out.println("More than four digits");
		}
	}
}