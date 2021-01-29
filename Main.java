import java.util.Scanner;

class Main {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("What is your current weight?");
    int currentYear = scan.nextInt();
    System.out.println("How much weight did you gain/lose last year?");
    int birthYear = scan.nextInt();

    int age = getAge(birthYear, currentYear);

    System.out.println("Hello " + (name));
    System.out.println("Your weight is " + age);

//Scanner for height 
    
    System.out.println("How tall are you this year in inches? Please give a whole number.");
    int currentHeight = scan.nextInt();
    System.out.println("How tall were you in inches last year? Give a whole number.");
    int lastHeight = scan.nextInt();

    int height = heightGrown(lastHeight, currentHeight);

    System.out.println(welcome(name));
    System.out.println("you grew " + height + " inches last year.");
  }

  //method calculates Weight 
  static int getAge(int birthYear, int currentYear)
  {
    int age = currentYear + birthYear;
    return age;
  }  

  //method returns greeting
  

 //Create a methoid that takes in at least 1 parameter and returns some type 
 //call this new method within your main method
 
   
  //method calculates age
  static int heightGrown(int lastHeight, int currentHeight)
  {
    int height = currentHeight - lastHeight;
    return height;
  }  

  //method returns greeting
  static String welcome(String name) 
  {
    String hello = "Hello. Welcome back, " + name;
    return hello;
  }
 
 
}