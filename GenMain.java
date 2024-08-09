public class GenMain 
{
	public static void main(String[] args) 
	{
		Gen<Integer,String> g1 = new Gen<>(10,"String");
		System.out.println("G1 Obj: "+g1.getOb()+"\t"+g1.getOb1());
	}
}