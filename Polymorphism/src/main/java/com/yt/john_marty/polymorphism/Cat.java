package main.java.com.yt.john_marty.polymorphism;

public class Cat extends Animal {
  private String litterPreference;

  public String getLitterPreference() {
    return litterPreference;
  }

  public void setLitterPreference(String litterPreference) {
    this.litterPreference = litterPreference;
  }

  @Override
  public void eat() {
    System.out.println("nom nom nom");
  }
}
