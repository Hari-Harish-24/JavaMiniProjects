import java.util.Scanner;
import java.text.NumberFormat;

public class Main{
    public static void main(String[] args){
        byte monthsInYear = 12;
        byte percent = 100;
        int amount = 0;
        float rate = 0;
        int period = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter the principle Amount [1000-10000] : ");
            amount = scanner.nextInt();
            if (amount > 1000 && amount <= 10000){
                break;
            }else{
                System.out.println("Enter Amount between 1000-10000 !!");
            }
        }
        
        while(true){
            System.out.print("Enter Rate of Intrest [1-30%] : ");
            rate = scanner.nextFloat();
            if (rate > 0 && rate <= 30){
                break;
            }else{
                System.out.println("Enter vaild input [1-30] !!");
            }
        }
        
        while(true){
            System.out.print("Enter Period [Years] : ");
            period = scanner.nextInt();
            if (period > 0 && period <= 30){
                break;
            }else{
                System.out.println("Enter vaild input [0-30] !!");
            }
        }
        
        float rateInPercentage = rate / percent;
        
        double answer = amount * (1 + period*rateInPercentage) ;
        String AMOUNT = NumberFormat.getCurrencyInstance().format(answer);
        
        System.out.println("The Total Amount is :" + AMOUNT);
        
    }
}