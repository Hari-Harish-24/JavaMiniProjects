import java.util.Scanner;

public class Main{

    public static int powerFind(int powerNumber){

        int ctr = 0;
        while(powerNumber>0){
            powerNumber = (int)powerNumber/10;
            ctr++;
        }
        return ctr;
    }

    public static int isAmstrongNumber(int inputNumber){

        int power = powerFind(inputNumber);
        int answer = 0;

        while(inputNumber>0){
            answer += (int)Math.pow(inputNumber%10,power);
            inputNumber = (int) Math.floor(inputNumber/10);
        }

        return answer;
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int check = isAmstrongNumber(number);
        System.out.println("Enter the NUMBER : ");
        System.out.println(check);

        if (check == number){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}