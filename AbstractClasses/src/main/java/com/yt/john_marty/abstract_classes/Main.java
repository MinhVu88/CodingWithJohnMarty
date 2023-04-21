package main.java.com.yt.john_marty.abstract_classes;

/* Key differences between an abstract class & an interface:
- A class can implement as many interfaces as possible, but can only extend 1 class.
- A class can do both things mentioned above at the same time.
- Fields in an interface are static & final by default.
- An abstract class is for closely related classes that have the same functionality
  & the same types of fields available.
- An interface is for unrelated classes that can perform some kind of certain things.
  Ex: objects other than Cat or Dog can implement Animal2 & its methods.
*/
public class Main {
	public static void main(String[] args) {
		// Animal animal = new Animal(); // can't instantiate an abstract class

		Cat1 cat1 = new Cat1();
		cat1.makeNoise();
		cat1.eat();

		Cat2 cat2 = new Cat2();
		cat2.move();
	}
}