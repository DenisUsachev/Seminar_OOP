package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComporator;

public class TeacherService implements iUsaerService<Teacher>{
    /** Счётчик учителя */
    private int count;

    /** Список Учителей */
    private List<Teacher> teachers;

    /** Констуктор */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    /** @return вывод всех учителей */
    @Override
    public List<Teacher> getAll(){
        return teachers;
    }

    @Override
    /** Создает имя, фамилию, возраст и уникальный номер учителя */
    public void create(String firstName, String secondName, Integer age) {
        Teacher person = new Teacher(firstName, secondName, age, count);
        count ++;
        teachers.add(person);    
    }

    /**
     * @param numberGroup = номер группы 
     * @return = возвращает отсортированный список учителей
     */
    public List<Teacher> getSortedByFIOTeacher(){
        List<Teacher> tchr = new ArrayList<>(teachers);
        tchr.sort(new UserComporator<Teacher>()); //Создает сортировку применяя класс UserComporator
        return tchr;
    }
}
