package main.java.com.yt.john_marty.set_hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Set<String> names1 = new HashSet<>();

    names1.add("Maynard Keenan");
    names1.add("Adam Jones");
    names1.add("Justin Chancellor");
    names1.add("Dan Carey");
    names1.add("Paul D'Amour");
    names1.add("Maynard Keenan");

    java.util.Iterator<String> namesIterator = names1.iterator();

    while(namesIterator.hasNext()) {
      System.out.println(namesIterator.next());
    }

    System.out.println("--------------------");

    // names.remove(0); // removing an element based on its index doesn't work in Set
    names1.remove("Paul D'Amour");

    names1.forEach(name -> System.out.println(name));

    System.out.println("--------------------");

    System.out.println("names.size() -> " + names1.size());

    System.out.println("--------------------");

    System.out.println("names.contains(\"Paul D'Amour\") -> " + names1.contains("Paul D'Amour"));

    System.out.println("--------------------");

    System.out.println("names.isEmpty() -> " + names1.isEmpty());

    System.out.println("--------------------");

    names1.clear();

    System.out.println("names.clear() -> " + names1);

    System.out.println("--------------------");

    List<Integer> numberList = new ArrayList<>();

    numberList.add(1);
    numberList.add(2);
    numberList.add(3);
    numberList.add(2);
    numberList.add(1);

    System.out.println("numberList -> " + numberList);

    // approach 1
    // Set<Integer> numberSet = new HashSet<>();
    // numberSet.addAll(numberList);

    // approach 2
    Set<Integer> numberSet = new HashSet<>(numberList);

    System.out.println("numberSet -> " + numberSet);

    System.out.println("--------------------");

    Set<String> names2 = new TreeSet<>();

    names2.add("Layne Staley");
    names2.add("Jerry Cantrell");
    names2.add("Mike Starr");
    names2.add("Sean Kinney");
    names2.add("Mike Inez");
    names2.add("William Duvall");

    names2.forEach(System.out::println);

    System.out.println("--------------------");

    Set<String> names3 = new LinkedHashSet<>();

    names3.add("Thom Yorke");
    names3.add("Jonny Greenwood");
    names3.add("Colin Greenwood");
    names3.add("Ed O'Brien");
    names3.add("Philip Selway");
    
    names3.forEach(System.out::println);
  }
}
