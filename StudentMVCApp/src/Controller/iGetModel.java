package Controller;

import java.util.List;

import Model.Student;

public interface iGetModel {
    /** метод который будет возвращать студента  */
    public List<Student> getAllStudent();

    // Удалить студента
    public boolean deleteStudent(long idStud);
}
