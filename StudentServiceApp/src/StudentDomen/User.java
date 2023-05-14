package StudentDomen;

/** Родительский класс в котором описаны основные параметры человека */
public class User {
    /** Имя */
    private String firstName;
    /** Фамилия */
    private String secondName;
    /** Возраст */
    private Integer age;

    /** Конструктор */
    public User(String firstName, String secondName, Integer age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /** @return = Получаем имя */
    public String getFirstName() {
        return firstName;
    }

    /** @param name = Устанавливаем имя */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** @return = Получаем фамилия */
    public String getSecondName() {
        return secondName;
    }

    /** @param firstName = Устанавливаем фамилию */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /** @return = Получаем возвраст */
    public Integer getAge() {
        return age;
    }

    /** @param age = Устанавливаем возвраст */
    public void setAge(Integer age) {
        this.age = age;
    }
        
    @Override
    /** Переопределяем метод toString */
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
