import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is your name?");

    String name = scan.next();

    System.out.println("Hello " + name + " welcome to your doctors appointment");
    System.out.println("What is your current weight?");

    int currentWeight = scan.nextInt();
   System.out.println("How much weight did you gain/lose last year?");
    System.out.println("If you gained weight use a positive number. If you lost weight use a negative number.");

    int weightLostGained = scan.nextInt();

    int weight = getWeight(weightLostGained , currentWeight);

    System.out.println("Hi " + (name));
    System.out.println("Your weight is " + weight);

    System.out.println(welcome(name));
    }

    //method calculates Weight 
    static int getWeight(int weightLostGained , int currentWeight)
   {
    int weight = currentWeight + weightLostGained ;
    return weight;
   }  

 
 
   


   //method returns greeting
   static String welcome(String name) 
   {
    String hello = "Hello. Welcome back, " + name;
    return hello;
   }
 
 
}
    