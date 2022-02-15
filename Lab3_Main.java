import java.util.Scanner;

public class Lab3_Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double monthlyPayment, totalPayment;

        //User input interest rate in percentage
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double interestRate = input.nextDouble();

        //User input loan years
        System.out.print("Enter number of years as an integer: ");
        int year = input.nextInt();

        //User input loan amount
        System.out.print("Enter loan amount, for example, 12000.95: ");
        double loanAmount = input.nextDouble();

        //Create object: loan
        Lab3_Loan loan = new Lab3_Loan(interestRate, year, loanAmount);

        //Pass in user inputs and calculate monthly payment
        monthlyPayment = loan.getMonthlyPayment();
        //Pass in user inputs and calculate total payment
        totalPayment = loan.getTotalPayment();

        //Print outputs
        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.2f", monthlyPayment));
        System.out.println("The total payment is " + String.format("%.2f", totalPayment));

        input.close();
    }
}
