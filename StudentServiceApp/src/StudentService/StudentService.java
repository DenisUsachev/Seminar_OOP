package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;

public class StudentService implements iUsaerService<Student> {
    /** Счётчик */
    private int count;
    
    /** Список студентов */
    private List<Student> students;
    
    /** Констуктор */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    /** @return вывод всех студентов */
    public List<Student> getAll(){
        return students;
    }

    @Override
    /** Создает имя, фамилию, возраст и уникальный номер студента */
    public void create(String firstName, String secondName, Integer age) {
        Student per = new Student(firstName, secondName, age, count);
        count++;
        students.add(per);
    }
}
