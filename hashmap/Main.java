package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<>();
		
		phoneBook.put("Michael", "6261234567");
		phoneBook.put("Emily", "6261234567");
		phoneBook.put("Jeff", "6261234567");
		phoneBook.put("Jenny", "6261234567");
		
		Set<String> keys = phoneBook.keySet();
		
		for(String i : keys){
			System.out.println(i);
			System.out.println(phoneBook.get(i));
		}
		
		
		// Another way to do it
		Set<Map.Entry<String, String>> values = phoneBook.entrySet();
		
		for(Map.Entry<String, String> e : values){
			System.out.println(e.getKey() + " : " + e.getValue());
			e.setValue("911");
			//System.out.println(e.getKey() + " : " + e.getValue());		
		}
		
		System.out.println("---------------------------- LinkedHashMap below");
		
		Map<String, String> phoneBook2 = new LinkedHashMap<>();
		
		phoneBook2.put("Michael", "6261234567");
		phoneBook2.put("Emily", "6261234567");
		phoneBook2.put("Jeff", "6261234567");
		phoneBook2.put("Jenny", "6261234567");
		
		Set<Map.Entry<String, String>> values2 = phoneBook2.entrySet();
		
		for(Map.Entry<String, String> b : values2){
			System.out.println(b.getKey() + " : " + b.getValue()); 
		}
		
		System.out.println("---------------------------- TreeHashMap below");
		
		Map<String, String> phoneBook3 = new TreeMap<>();
		
		phoneBook3.put("D", "6261234567");
		phoneBook3.put("C", "6261234567");
		phoneBook3.put("B", "6261234567");
		phoneBook3.put("A", "6261234567");
		phoneBook3.put("4", "6261234567");
		phoneBook3.put("3", "6261234567");
		phoneBook3.put("2", "6261234567");
		phoneBook3.put("1", "6261234567");
		
		phoneBook3.replace("A", "123");
		phoneBook3.put("B", "1234");
		System.out.println(phoneBook3.containsValue("1234"));
		
		Set<Map.Entry<String, String>> values3 = phoneBook3.entrySet();
		
		for(Map.Entry<String, String> b : values3){
			System.out.println(b.getKey() + " : " + b.getValue()); 
		}
		
	}
}
