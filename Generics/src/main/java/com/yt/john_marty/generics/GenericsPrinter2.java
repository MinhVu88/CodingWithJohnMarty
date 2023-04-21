package main.java.com.yt.john_marty.generics;

// import java.io.Serializable;

/*
	- <T extends Animal> -> this's called bounded generics as the generic type 
		called T inherits properties & methods from the Animal class.

	- <T extends Serializable> -> T can implement the Serializable interface.

	- <T extends Animal & Serializable> -> T can also extend Animal & implement Serializable
		(Note: Java doesn't support multiple inheritance, so T can only extend 1 class, which
		must be listed 1st, before any interfaces after it). 
*/
public class GenericsPrinter2 <T extends Animal /*& Serializable*/> {
	T thingToPrint;

	public GenericsPrinter2(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		thingToPrint.eat();
		System.out.println(thingToPrint);
	}
}
