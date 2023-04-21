package main.java.com.yt.john_marty.generics;

public class GenericsPrinter1 <T> {
  T thingToPrint;

  public GenericsPrinter1(T thingToPrint) {
    this.thingToPrint = thingToPrint;
  }

  public void print() {
    System.out.println(thingToPrint);
  }
}
