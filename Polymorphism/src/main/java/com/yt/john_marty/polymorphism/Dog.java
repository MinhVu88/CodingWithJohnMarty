package main.java.com.yt.john_marty.polymorphism;

public class Dog extends Animal {
  private int breed;

  public int getBreed() {
    return breed;
  }

  public void setBreed(int breed) {
    this.breed = breed;
  }

  // method overriding
  @Override
  public void eat() {
    System.out.println("chomp chomp chomp");
  }

  // method overloading
  public void eat(String chewingSound) {
    for(int i = 0; i < 3; i++) {
      System.out.print(chewingSound + " ");
    }
  }
}
