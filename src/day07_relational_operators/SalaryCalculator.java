package day07_relational_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        //salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

        double salary = 100_000;
        double stateTaxRate = 0.06; // %6
        double federalTaxRate = 0.22; // %22
        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTaxRate;
        salaryAfterTax = salary - totalTax;

        System.out.println();

        String taxReport = "State tax rate: " + stateTax + ", Federal tax rage: " + ", Base Salary $" + salary + " Tax amount: " + stateTax + " for State Tax and " + federalTaxRate + "After tax our salary is: " + salaryAfterTax;

        System.out.println(taxReport);


    }
}
