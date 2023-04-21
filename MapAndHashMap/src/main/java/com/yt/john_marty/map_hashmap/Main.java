package main.java.com.yt.john_marty.map_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		Map<String, Integer> employees = new HashMap<>();

		employees.put("Scott Weiland", 1);
		employees.put("Dean DeLeo", 2);
		employees.put("Robert DeLeo", 3);
		employees.put("Eric Kretz", 4);
		employees.put("Chester Bennington", 5);
		employees.put("Jeff Gutt", 6);

		System.out.println("employees -> " + employees);
		
		System.out.println(
			"employees.get(\"Chester Bennington\") -> " + 
			employees.get("Chester Bennington")
		);
		
		System.out.println(
			"employees.containsKey(\"Mike Shinoda\") -> " + 
			employees.containsKey("Mike Shinoda")
		);

		System.out.println("employees.containsValue(3) -> " + employees.containsValue(3));

		employees.put("Chester Bennington", 0);
		System.out.println("employees -> " + employees);

		employees.replace("Scott Weiland", -1);
		System.out.println("employees -> " + employees);

		employees.replace("John Doe", 9);
		System.out.println("employees -> " + employees);

		employees.putIfAbsent("Adolf Hitler", 55);
		System.out.println("employees -> " + employees);

		employees.remove("Adolf Hitler");
		employees.remove("Chester Bennington");
		employees.remove("Scott Weiland");
		System.out.println("employees -> " + employees);
	}
}
