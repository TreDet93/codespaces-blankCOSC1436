import java.util.Scanner;

public class projectCalculator{
    public static void main(String []args){
        Scanner optimus = new Scanner(System.in);
        double firstNum, secNum, answer;
        System.out.println("Enter First Num: ");
        firstNum = optimus.nextDouble();
        System.out.println("Enter Second Num: ");
        secNum = optimus.nextDouble();
        answer = firstNum + secNum;
        System.out.println(answer);
        System.out.println("Would you like to perform another operation? ");
        System.out.println("Exit? ");
        System.out.println("Yes or No? ");
        System.out.println("Error: Division by zero is not allowed. ");
        System.out.println("Thank you for using the Java Calculator! Goodbye! ");
    }
}
