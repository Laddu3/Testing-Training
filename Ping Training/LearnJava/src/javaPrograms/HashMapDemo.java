package javaPrograms;

import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {
	
public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	
	System.out.println("initial list of elements"+hm);
	hm.put(101,"Harsha");
	hm.put(102,"Niranjan");
	hm.put(103,"Jayaram");
	System.out.println("After invoking put() method");
	
	for(Map.Entry m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	hm.putIfAbsent(104, "Pavan");
	System.out.println("After Invoking putIfAbsent() method");
	
	for(Map.Entry m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	
	map.put(105, "Ramesh");
	map.putAll(hm);
	
	System.out.println("After invoking putAll() method");
	
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	System.out.println("The set is: " + hm.keySet()); 
	System.out.println("The Values is: " + hm.values()); 
}

}
