package D_OOP_Inheritance.InheritanceChallenge;

public class SalariedEmployee extends Employee {

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        terminate("21/11/2026");
        isRetired = true;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 12;
        double adjustedPay = (isRetired) ? 0.9 * paycheck: paycheck;
        return (int) adjustedPay;
    }
}
