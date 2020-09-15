import java.util.Scanner;

/**
 *Tells the user what to say based on the number they put in
 * @Chad 
 */
public class Main {
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    //holds the divisors
    final int divOne= 3;
    final int divTwo = 5;
    final int none = 0;
    //asks user to input a number and records it 
    System.out.println("Please enter a number to play FizzBuzz");
    int numBase = input.nextInt();

    //divdes number by both 3 and 5 and checks for remainders
    int divThree = numBase % divOne;
    int divFive = numBase % divTwo;
    
    // checks if the quotients are 0 for either
    if (divThree == none && divFive == none){
      System.out.println("You should say FizzBuzz");
    } else if (divThree == none && divFive != none){
      System.out.println("You should say Fizz");
    } else if (divThree != none && divFive == none){
      System.out.println("You should say Buzz");
    } else {
      System.out.println("You should say " + numBase);
    }

  }
}
