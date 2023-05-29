package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class ModelHash implements iGetModel{
    
    /**Список студентов */
    private HashMap<Long,Student> students;

    private List<Student> student;

    /** Конструктор */
    public ModelHash(HashMap<Long,Student> students) {
        this.students = students;
    }

    /** @return метод который будет возвращать студента  */
    public List<Student> getAllStudent(){
        return student;
    }

    @Override
    public boolean deleteStudent(long idStud) {

        for (int i = 0; i < students.size(); i ++) {
            if (students.get(i).getIdStud() == idStud) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
    
}
