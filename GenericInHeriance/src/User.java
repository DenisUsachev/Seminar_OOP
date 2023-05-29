
/** Родительский класс в котором описаны основные параметры человека */
public class User<T,V> {
    /** Имя */
    private T firstName;
    /** Фамилия */
    private T secondName;
    /** Возраст */
    private V age;

    /** Конструктор */
    public User(T firstName, T secondName, V age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /** @return = Получаем имя */
    public T getFirstName() {
        return firstName;
    }

    /** @param name = Устанавливаем имя */
    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    /** @return = Получаем фамилия */
    public T getSecondName() {
        return secondName;
    }

    /** @param firstName = Устанавливаем фамилию */
    public void setSecondName(T secondName) {
        this.secondName = secondName;
    }

    /** @return = Получаем возвраст */
    public V getAge() {
        return age;
    }

    /** @param age = Устанавливаем возвраст */
    public void setAge(V age) {
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
