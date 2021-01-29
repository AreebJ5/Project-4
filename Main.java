import java.util.Scanner;

class Main {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is your name?");

    String name = scan.next();

    System.out.println("Hello " + name + " welcome to your doctors appointment");
    System.out.println("What is your current weight?");

    int currentWeight = scan.nextInt();

    