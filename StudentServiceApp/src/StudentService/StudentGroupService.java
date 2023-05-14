package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComporator;

public class StudentGroupService {
    /** Список Групп */
    private List<StudentGroup> groups;

    /**Конструктор */
    public StudentGroupService() {
        this.groups = new ArrayList<StudentGroup>();
    }

    /** @return вывод всех групп */
    public List<StudentGroup> getAll(){
        return this.groups;
    }

    /**
     * @param numberGroup = номер группы 
     * @return = возвращает отсортированный список студентов
     */
    public List<Student> getSortedByFIOStudentGroup(int numberGroup){
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComporator<Student>()); //Создает сортировку применяя класс UserComporator
        return students;
    }
}
