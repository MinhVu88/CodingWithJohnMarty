package main.java.com.yt.john_marty.records;

// record can't extend another class, but it can implement interfaces
// record is implicitly final, so it can't be extended by another class
public record Employee2(String name, int id) /*extends Employee1*/ implements Runnable {
	// private String someValue; // instance field isn't allowed in record

	public static final String DEFAULT_EMP_NAME = "Bill";

	/*
	public Employee2(String name, int id) {
		if(id < 0) {
			throw new IllegalArgumentException("id can't be negative");
		}

		this.name = name;
		this.id = id;
	}
	*/

	// compact constructor
	public Employee2 {
		if(id < 0) {
			throw new IllegalArgumentException("id can't be negative");
		}
	}

	public String capitalizeName() {
		return name.toUpperCase();
	}

	public static void printStuff() {
		System.out.println("eyyo wassup dude");
	}

	@Override
	public void run() {
		System.out.println("run Forrest run");
	}
}
