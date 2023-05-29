package Model;

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel{
    
    /**Список студентов */
    private List<Student> students;

    /** Конструктор */
    public Model(List<Student> students) {
        this.students = students;
    }

    @Override
    public List<Student> getAllStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllStudent'");
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
