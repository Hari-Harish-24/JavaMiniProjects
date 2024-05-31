import java.util.Scanner;
import java.text.NumberFormat;

public class Main{
    public static void main(String[] args){
        final byte monthsInYear = 12;
        final byte percentage = 100;
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the Amount : ");
        int amount = scanner.nextInt();
       
        System.out.print("Enter the Interest Rate : ");
        float rate = scanner.nextFloat();
        float rateForYear = rate / monthsInYear / percentage;
       
        System.out.print("Enter Time period in years : ");
        int period = scanner.nextInt();
        int periodInMonths = period * monthsInYear;
       
        double result = amount*(rate*Math.pow(1+rate,periodInMonths))/(Math.pow(1+rate,periodInMonths)-1);
        String formatResult = NumberFormat.getCurrencyInstance().format(result);
       
        System.out.print("The Mortgage is "+ formatResult);
       
    }
}
