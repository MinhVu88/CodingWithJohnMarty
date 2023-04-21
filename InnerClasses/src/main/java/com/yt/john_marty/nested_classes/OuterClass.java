package main.java.com.yt.john_marty.nested_classes;

public class OuterClass {
	String outerField = "a regular field of OuterClass";

	public void printOuterStuff() {
		System.out.println("eyyo wassup dude, OuterClass here");

		class PrintOuterStuffClass {
			String localInnerField = "holy sh*t! PrintOuterStuffClass here";

			public void printLocalInnerField() {
				System.out.println(localInnerField);
			}
		}

		PrintOuterStuffClass printOuterStuffClass = new PrintOuterStuffClass();
		printOuterStuffClass.printLocalInnerField();
	}

	public class NonStaticInnerClass {
		String innerField = "an inner field of NonStaticInnerClass";

		public void printInnerStuff() {
			System.out.println("yo yo yo, NonStaticInnerClass here");
		}
	}

	public static class StaticInnerClass {
		String innerField = "an inner field of StaticInnerClass";

		public void printInnerStuff() {
			System.out.println("yo biatch, StaticInnerClass here");
		}
	}
}
