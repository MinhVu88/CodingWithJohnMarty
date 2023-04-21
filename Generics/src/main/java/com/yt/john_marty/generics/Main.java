package main.java.com.yt.john_marty.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
	// generic methods
	private static <T> void swear1(T damnedThing) {
		System.out.println("Fuck " + damnedThing + "!!!");
	}

	private static <T, V> void swear2(T damnedThing1, V damnedThing2) {
		System.out.println("Fuck both " + damnedThing1 + " & " + damnedThing2 + "!!!!");
	}

	private static <T> T swear3(T damnedThing) {
		return damnedThing;
	}

	private static void printList1(List<?> someList) {
		System.out.println(someList);
	}

	private static void printList2(List<? extends Animal> someList) {
		System.out.println(someList);
	}

	public static void main(String[] args) {
		System.out.println("\n-------[ WITHOUT GENERICS ]-------");
		IntegerPrinter integerPrinter = new IntegerPrinter(23);
		integerPrinter.print();

		DoublePrinter doublePrinter = new DoublePrinter(2.3);
		doublePrinter.print();

		StringPrinter stringPrinter = new StringPrinter("eyyo wassup");
		stringPrinter.print();

		System.out.println("\n-------[ WITH GENERICS ]-------");
		GenericsPrinter1<Integer> genericsPrinter1 = new GenericsPrinter1<>(69);
		genericsPrinter1.print();

		GenericsPrinter1<Double> genericsPrinter2 = new GenericsPrinter1<>(6.9);
		genericsPrinter2.print();

		GenericsPrinter1<String> genericsPrinter3 = new GenericsPrinter1<>("you're talking to me?");
		genericsPrinter3.print();

		System.out.println("\n-------[ GENERICS & COLLECTIONS FRAMEWORK ]-------");
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(new Cat());
		// cats.add(new Dog()); // WRONG! can't add a Dog instance to the Cat ArrayList
		cats.forEach(cat -> System.out.println(cat.getClass().getSimpleName()));

		System.out.println("\n-------[ GENERICS & TYPE-SAFETY ISSUES ]-------");
		ArrayList<Object> dogs = new ArrayList<>();
		dogs.add(new Dog());
		Dog dog1 = (Dog) dogs.get(0);
		System.out.println("dog 1 -> " + dog1.getClass().getSimpleName());
		
		dogs.clear();

		try {
			dogs.add(new Cat());
			Dog dog2 = (Dog) dogs.get(0);
			System.out.println("dog 2 -> " + dog2.getClass().getSimpleName());   
		} catch (ClassCastException e) {
			System.out.println("\nERROR -> " + e.getMessage());
		}

		System.out.println("\n-------[ GENERIC ANIMAL CLASS ]-------");
		GenericsPrinter2<Cat> cat1 = new GenericsPrinter2<Cat>(new Cat());
		cat1.print();

		GenericsPrinter2<Dog> dog2 = new GenericsPrinter2<Dog>(new Dog());
		dog2.print();

		System.out.println("\n-------[ GENERIC METHODS ]-------");
		swear1("eyyo wassup");
		swear1(23);
		swear1(new Cat("Fury").name);
		swear2("society", "CCP");
		System.out.println("Fuck " + swear3("you") + "!!!");

		List<Integer> intList = new ArrayList<>();
		intList.add(0);
		intList.add(1);
		intList.add(2);
		printList1(intList);

		List<Cat> catList = new ArrayList<>();
		catList.add(new Cat("cat 1"));
		catList.add(new Cat("cat 2"));
		catList.add(new Cat("cat 3"));
		printList2(catList);
	}
}