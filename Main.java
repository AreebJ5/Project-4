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



   System.out.println("What is your blood current blood pressure? ");

    int currentBloodPressure = scan.nextInt();

    System.out.println("What was your blood pressure last year? ");
    int lastBloodPressure = scan.nextInt();

    int blood = bloodPressure(lastBloodPressure, currentBloodPressure);

    System.out.println(" Your blood pressure is " + blood);

    }

    //method calculates the paients current Weight 
    static int getWeight(int weightLostGained , int currentWeight)
   {
    int weight = currentWeight + weightLostGained ;
    return weight;
   }  

    //mathod that find how much the paients blood pressue has gone up or down 
   static int bloodPressure(int currentBloodPressure , int lastBloodPressure )
   {
    int blood = lastBloodPressure - currentBloodPressure ;
    return blood;
   }  
   


   //method returns greeting
   static String welcome(String name) 
   {
    String hello = "Hello. Welcome back, " + name;
    return hello;
   }
 
 
}
    