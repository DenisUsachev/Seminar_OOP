package Model;

/** Наследуемый класс в котором описано дополнительные характеристики для студента с возможностью сотртировки */
public class Student extends User implements Comparable<Student>{
    /** id студента */
    private long idStud;

    /** Конструктор */
    public Student(String firstName, String secondName, Integer age, long id) {
        super(firstName, secondName, age);
        this.idStud = id;
    }

    /** @return = Получаем id студента */
    public long getIdStud() {
        return idStud;
    }

    /** @param iD = Устанавливаем id студента */
    public void setIdStud(long idStud) {
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
    public int compareTo(Student o) {
        if(this.getAge() == o.getAge()){
            // Двойная сортировка, если без неё, то на этом месте будет
            //return 0;
            if(this.idStud == o.idStud){
                return 0;
            }
            if(this.idStud < o.idStud){
                return -1;
            }
            return 1;
        }
        if(this.getAge() < o.getAge()){
            return -1;
        }
        return 1;
    }
}
