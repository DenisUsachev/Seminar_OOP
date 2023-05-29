package Solid.SingleResponsibilityPrinciple;

public class PayrollDepartment {
    private int baseSalary;

    public PayrollDepartment(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
