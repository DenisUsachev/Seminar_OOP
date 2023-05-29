package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView{

    public void printAllStudent(List<Student> students){
        System.out.println("-----Вывод списка студентов-----");
        for (Student per : students) {
            System.out.println(per);
        }
        System.out.println("-----Конец списка-----");
    }

    public String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    @Override
    public Long promptLong(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLong();
    }
}
