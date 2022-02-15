import java.lang.Math;

public class Lab3_Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
    private double monthlyPayment;
    private double totalPayment;

    
    public Lab3_Loan() {
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
    }

    public Lab3_Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return this.numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public java.util.Date getLoanDate() {
        loanDate = new java.util.Date();
        return loanDate;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        monthlyPayment = (loanAmount * monthlyInterestRate)/(1-(1/Math.pow((1 + monthlyInterestRate), (numberOfYears * 12))));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        totalPayment = this.monthlyPayment * numberOfYears * 12;
        return totalPayment;
    }

    
}
