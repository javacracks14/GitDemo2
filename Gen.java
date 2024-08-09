public class Gen<T,V>
{
	private T ob;
	private V ob1;
	public Gen(T ob, V ob1)
	{
		this.ob=ob;
		this.ob1=ob1;
	}
	public T getOb()
	{
		return ob;
	}
	public V getOb1()
	{
		return ob1;
	}
}

// public class Gen<T,V> // multiple parameter generics class
/*
T	- Type
K	- Key
V	- Value
N	- Number
E	- Element
*/