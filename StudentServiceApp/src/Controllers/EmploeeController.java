package Controllers;

import StudentDomen.Emploee;
import StudentDomen.User;
import StudentService.EmploeeService;


public class EmploeeController implements iUserController<Emploee> {
    
    private final EmploeeService empService = new EmploeeService();

    @Override
    /** Контролеер который создает работника */
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }

    /** Статический метод с импользованием дженероков который возврщает имя работника и его зарплату */
    static public <T extends Emploee> void PaySalary(T person){
        System.out.println(((User) person).getFirstName() + " зп 10000р ");
    }

    /** Статический метод который считает среднее значение */
    static public <T extends Number> Double mean(T[] num){
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
}
