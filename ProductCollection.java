import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductCollection 
{
	public static void main(String[] args) 
	{
		List<Product> products = new ArrayList<>();
		products.add(new Product(1,"HP Laptop",50000.0));
		products.add(new Product(2,"Dell Laptop",70000.0));
		products.add(new Product(3,"Apple Mac Book", 120000.0));
		products.add(new Product(4,"Lenovo Laptop",35000.0));
		products.add(new Product(5,"Sony Laptop",45000.0));
		
//		List<Double> priceList = new ArrayList<>();
//		for(Product p : products)
//		{
//			if(p.getPrice()<50000)
//			{
//				priceList.add(p.getPrice());
//			}
//		}
//		System.out.println(priceList);
		
//		List<Double> priceList = products.stream()
//				.filter(p -> p.getPrice()<51000)   // filtering data
//				.map(p -> p.getPrice())  // fetching data
//				.collect(Collectors.toList()); // collecting data and storing as list
//		System.out.println(priceList);			
	
//		Stream.iterate(1, e->e+1).filter(e->e%2==0).limit(10).forEach(System.out::println);
//		products.stream().filter(p->p.getPrice()<50000).forEach(p->System.out.println(p.getName()));
		
//		Double totalPrice = products.stream().map(p->p.getPrice()).reduce(0.0,(sum,price)->sum+price);
//		System.out.println(totalPrice);
//		
//		double totalPrice2 = products.stream().collect(Collectors.summingDouble(p->p.getPrice()));
//		System.out.println(totalPrice2);
//		
//		Product max = products.stream().max((p1, p2)-> p1.getPrice()>p2.getPrice()?1:-1).get();
//		Product min = products.stream().min((p1, p2)-> p1.getPrice()>p2.getPrice()?1:-1).get();
//		System.out.println(max.getName()+"\t"+max.getPrice());
//		System.out.println(min.getName()+"\t"+min.getPrice());
//		
//		long count = products.stream().filter(p->p.getPrice()>0).count();
//		System.out.println(count);
		
//		Set<Double> price = products.stream().filter(p->p.getPrice()<60000).map(p->p.getPrice()).collect(Collectors.toSet());
//		System.out.println(price);
	}
}
