package main.java.com.yt.john_marty.polymorphism;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();

    Cat cat = new Cat();
    cat.eat();

    Dog dog = new Dog();
    dog.eat();
    dog.eat("gobble");
  }
}