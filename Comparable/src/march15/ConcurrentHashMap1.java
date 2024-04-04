package march15;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {

	public static void main(String[] args) {

 ConcurrentHashMap<String,Integer>map=new ConcurrentHashMap<String,Integer>();
		
		map.put("Colorcode", 101);
		
		map.put("A", 105);
		map.put("B", 107);
		
		System.out.println(map);
		
		System.out.println(map.get("A"));
		map.putIfAbsent("C", 110);
		System.out.println(map);
		
		map.remove("Colorcode");
		System.out.println(map);
		
		map.replace("A", 115);
		System.out.println(map);
	}

}
