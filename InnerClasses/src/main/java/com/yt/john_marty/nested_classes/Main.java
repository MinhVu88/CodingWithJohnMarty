package main.java.com.yt.john_marty.nested_classes;

public class Main {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.printOuterStuff();

		// how to create an instance of the NonStaticInnerClass class?
		OuterClass.NonStaticInnerClass nonStaticInnerClass = outerClass.new NonStaticInnerClass();
		nonStaticInnerClass.printInnerStuff();

		// create an instance of the StaticInnerClass
		OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
		staticInnerClass.printInnerStuff();
	}
}