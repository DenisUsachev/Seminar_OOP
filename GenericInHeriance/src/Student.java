

/** Наследуемый класс в котором описано дополнительные характеристики для студента с возможностью сотртировки */
public class Student<T,V,S extends Comparable<S>> extends User<T,V> implements Comparable<Student<T,V,S>>{
    /** id студента */
    private S idStud;

    /** Конструктор */
    public Student(T firstName, T secondName, V age, S id) {
        super(firstName, secondName, age);
        this.idStud = id;
    }

    /** @return = Получаем id студента */
    public S getIdStud() {
        return idStud;
    }

    /** @param iD = Устанавливаем id студента */
    public void setIdStud(S idStud) {
        this.idStud = idStud;
    }

    @Override
    /** Переопределяем метод toString */
    public String toString() {
        return "Student{"
            + "firstName=" + super.getFirstName()
            + ", secondName=" + super.getSecondName()
            + ", age=" + super.getAge() +
            ", studentID=" + idStud +
            '}';
    }

    @Override
     /**
     * Сортировка по возрасту и если возвраст одинаковый то и по id
     * Сравниваем текущий и следущий возвраст
     */
    public int compareTo(Student<T,V,S> o) {

        return this.idStud.compareTo(o.idStud);
    }
}
