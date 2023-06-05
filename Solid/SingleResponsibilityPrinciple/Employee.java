package Solid.SingleResponsibilityPrinciple;

import java.util.Date;

// Создаём класс Работника
public class Employee {
    /** Создаём приватное поле имя */
    private String name;
    /** Создаём приватное поле дата*/
    private Date dob;

    /**
     * Создаём конструтор в который передаём:
     * @param name = имя
     * @param dob = дата
     * @param baseSalary = зарплата
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
    }

    /** @return Вывод информации */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}