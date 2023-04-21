package main.java.com.yt.john_marty.records;

public class Main {
	public static void main(String[] args) {
		Employee1 employee1 = new Employee1("Jerry", 123);
		System.out.println("id: " + employee1.getId() + " -> name: " + employee1.getName());
		System.out.println(employee1);

		Employee2 employee2 = new Employee2("Tom", 456);
		System.out.println("id: " + employee2.id() + " -> name: " + employee2.name());
		System.out.println(employee2);
		System.out.println(employee2.capitalizeName());
		Employee2.printStuff();
	}
}