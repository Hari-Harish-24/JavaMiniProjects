// importing package
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Enter a number :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        if (number % 3 == 0 && number % 5 == 0){ // prints fizzbuzz if it is divisible by both 3 and 5
            System.out.print("fizzBuzz");
        }else if(number % 3 == 0){ // prints fizz if it is divisible by 3
            System.out.print("fizz");
        }else if(number % 5 == 0){ // prints buzz if it is divisible by 5
            System.out.println("Buzz");
        }else{ // returns the number if it is not divisible by 3 and 5
            System.out.println(number);
        }
    }
}