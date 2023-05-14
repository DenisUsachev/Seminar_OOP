package StudentDomen;

import java.util.List;

/** Класс исполуемый для подсчёта среднего возроста с импользованием дженереков  */
public class AverageAge<T extends User> {
    /** Список пользователй */
    private List<T> users;

    /** Конструктор */
    public AverageAge(List<T> users) {
        this.users = users;
    }

    /** Метод при помощи которого будем высчитываться средний возраст */
    public Double averAge() {
        
        int sum = 0;
        for (T user : users)
            sum += user.getAge();

        return (double) (sum / users.size());
    }
}
