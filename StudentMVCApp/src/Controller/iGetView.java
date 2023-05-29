package Controller;

import java.util.List;

import Model.Student;

public interface iGetView {
    // Вывод списка студетов в консоль
    void printAllStudent(List<Student> students);

    // Метод управления командами
    String prompt(String message);
    Long promptLong(String message);
}
