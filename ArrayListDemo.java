import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
//		HashSet<String> arr = new HashSet<>();
//		arr.add("Java");
//		arr.add("Servlets");
//		arr.add("JSP");
//		arr.add("JDBC");
//		arr.add("Spring");
//		arr.add("Hibernate");
//		arr.add("Java");
//		arr.add("Servlets");
//		
//		
//		System.out.println(arr);
//		System.out.println(arr);
		
		//arr.clear();
		//System.out.println(arr);
		//System.out.println(arr.contains("Servlets"));
		//System.out.println(arr.indexOf("Spring"));
		//System.out.println(arr.isEmpty());
		
		//arr.set(1, "Servlet");
		//System.out.println(arr);
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Rest Web Services");
		map.put(2, "Couchbase DB");
		map.put(3, "Git & Jenkins");
		map.put(4, "Spring");
		map.put(5, "Spring Boot");
		map.put(6, "Kafka");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> data : map.entrySet())
		{
			System.out.println(data.getKey()+"\t"+data.getValue());
		}
		
	}
}