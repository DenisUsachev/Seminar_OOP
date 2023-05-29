package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView{

    @Override
    public void printAllStudent(List<Student> students) {
        System.out.println("-----Displaying a list of students-----");
        for (Student per : students) {
            System.out.println(per);
        }
        System.out.println("-----End of list-----");
    }

    @Override
    public String prompt(String message) {
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
