package SingleResponsibilityPrinciple;

// Класс в котором будёт расчитываться зарплата работника 
public class AccountingService {
    // Принимаем данные из класса работник
    Employee employee;

    // Приватное поле которое отвечает за базовую зарпату работника
    private int baseSalary;

    /**
     * Конструктор
     * @param employee = работник
     * @param baseSalary = базовая зарплата
     */
    public AccountingService(Employee employee, int baseSalary) {
        this.employee = employee;
        this.baseSalary = baseSalary;
    }
    
    /** @return = Возвращает чистую зарплату работника */
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}
