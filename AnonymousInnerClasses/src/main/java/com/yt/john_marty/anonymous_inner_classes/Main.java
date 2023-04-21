package main.java.com.yt.john_marty.anonymous_inner_classes;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.makeNoise();

    // create an anon inner class of Animal (approach #1)
    // bigfoot technically isn't an instance of the Animal class
    // it's an object of the Animal class's anonymous & nameless subclass
    Animal bigfoot = new Animal() {
      @Override
      public void makeNoise() {
        System.out.println("Aggghhhhhh Aggghhhhhhh Agggggggggghhhhhhhhhhhh");
      }
    };

    bigfoot.makeNoise();

    // create another anon inner class (approach #2)
    // we're not creating a Runnable instance here (can't create objects from an interface)
    Runnable anonymousRunnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Bitches & gents! without further ado, anon runnable here");
      }
    };

    anonymousRunnable.run();
  }
}