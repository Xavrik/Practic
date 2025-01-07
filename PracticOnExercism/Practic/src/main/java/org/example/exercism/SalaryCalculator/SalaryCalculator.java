package org.example.exercism.SalaryCalculator;

public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
//        boolean penalty =
        return daysSkipped >= 5 ?  0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusMultiplier() method");
    }

    public double bonusForProductsSold(int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductsSold() method");
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
    }

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println( salaryCalculator.salaryMultiplier(3));
        System.out.println("test");
    }
}

