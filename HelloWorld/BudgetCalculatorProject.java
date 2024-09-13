import java.util.Scanner;

public class BudgetCalculatorProject
{    
    public static void main(String [] args) 
    {
        final int SALARY = 3000; // The fixed month salary
        final double SAVINGS_PERCENT = 0.2 ; // The percentage of salary saved
        final double  RENT_PERCENT = 0.3; // The percentage of salary spent on rent
        final double  GROCERIES_PERCENT =0.15; // The percentage of salary spent on groceries 
        final double  ENTERTAINMENT_PERCENT = 0.10; // The percentage spent on entertainment

        double monthlySalary= SALARY;
        System.out.println("monthly salary: " + monthlySalary);
        
        double savedAmount = monthlySalary * SAVINGS_PERCENT;
        System.out.println(savedAmount); 

        double rentAmount = monthlySalary * RENT_PERCENT;
        System.out.println("rentAmount: " + rentAmount); 
        double groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        System.out.println("groceriesAmount: ");
        double totalExpenses = rentAmount + grocerieAmount + ENTERTAINMENT_PERCENT;
        System.out.println("entertainmentAmount: ");

        
        /*
        savedAmount= 0.20;
        rentAmount = 0.30; 
        groceriesAmount= 0.15;
        entertainmentAmount = 0.10;

        
        int  monthlySalary; (a)= 3000.0;
        int  savedAmount; (b)= 0.20;
        int  rentAmount; (c)= 0.10; 
        int  groceriesAmount; (d)=0.30;
        int entertainmentAmount; (e)= 0.15; 
        totalExpenses= 0.65;
        */
        
        



    }
}

