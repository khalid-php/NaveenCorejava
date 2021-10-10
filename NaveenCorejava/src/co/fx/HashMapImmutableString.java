package co.fx;

import java.util.HashMap;
import java.util.Map;

public class HashMapImmutableString {
	/**
	 * Why hashMap key should be immutable in java ?
	 * Why String is popular hashMap key in java */
	public static void main(String[] args) {
		Map<Employee,String> listMap=new HashMap<Employee,String>();
		Employee e1 = new Employee("khalid",33);
		listMap.put(e1,"permament");
		e1.setAge(25);
//		listMap.put(e1, "temp");
		System.out.println(listMap.get(e1));
		Map<String,Integer> m1=new HashMap<String,Integer>();
		String e11="Tomm";
		m1.put(e11,100);
		System.out.println(m1.get(e11));
		e11="hussain";
		m1.put(e11,340);
		System.out.println(m1.get("Navneet"));
		System.out.println(m1.get(e11));
		
	}
}
