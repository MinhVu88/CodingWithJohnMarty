package main.java.com.yt.john_marty.optionals;

import java.util.Optional;

public class Main {
	private static Optional<Cat> findCatByName(String name) {
		return Optional.ofNullable(new Cat(name, (int)Math.floor(Math.random() * (10 - 1 + 1) + 1)));
	}

	public static void main(String[] args) {
		int defaultCatAge = -1;

		Optional<Cat> optionalCat1 = findCatByName("Tom");

		// approach #1
		if(optionalCat1.isPresent()) {
			System.out.println(optionalCat1.get().getName() + " & " + optionalCat1.get().getAge());
		} else {
			System.out.println("CAT NOT FOUND");
		}

		// approach #2
		Optional<Cat> optionalCat2 = findCatByName("Garfield");

		Cat cat1 = optionalCat2.orElse(new Cat("unknown", defaultCatAge));

		System.out.println(cat1.getName() + " & " + cat1.getAge());

		// approach #3
		Optional<Cat> optionalCat3 = findCatByName("Cheshire");

		System.out.println(optionalCat3.map(Cat::getAge).orElse(defaultCatAge));
	}
}