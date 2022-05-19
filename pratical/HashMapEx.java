import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer , String> map = new HashMap<Integer , String>();
		map.put(101, "Mango");
		map.put(102, "Orange");
		map.put(103, "Apple");
		map.put(104, "Banana");
		map.put(102, "Orange");//duplicate entry
		map.put(null, null);// null entry
		map.put(108, null);// null value
		//map.put(null, "Grape"); only one null key & null value can be multiple
		map.putIfAbsent(108, "CustardApple");// 108 was mapped with null value , update 108
		map.putIfAbsent(101,"Watermelon");//101 is already mapped with value
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey() +  " " + m.getValue());
		}
		
		map.remove(103);
		System.out.println("After removal :");
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey() +  " " + m.getValue());
		}
		
		
	}

}