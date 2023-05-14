import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.AverageAge;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;
import StudentService.EmploeeService;
import StudentService.StudentService;
import StudentService.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
         //SEMINER 3
        //User u1 = new User("Денис", "Иванов",  17);
        // Первая группа
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
        // Вторая группа для домашней работы
        Student s7 = new Student("Дмитрий", "Смирной", 22,  5);
        Student s8 = new Student("Иван",  "Уваров", 22,  4);
        Student s9 = new Student("Кирилл", "Трутнев", 23,  3);
        Student s10 = new Student("Роман", "Носов", 23,  2);
        Student s11 = new Student("Вадим", "Зерин", 22,  1);
        Student s12 = new Student("Алексей", "Рудин", 23,  0);

        /** Создаем список студентов */
        List<Student> lstStd = new ArrayList<Student>();
        /** Добавляем  в список */
        lstStd.add(s1);
        lstStd.add(s2);
        lstStd.add(s3);
        lstStd.add(s4);
        lstStd.add(s5);
        lstStd.add(s6);
        
        /** Создаем группу */
       StudentGroup group = new StudentGroup(lstStd, 0);
        
       /** Выводим список группы до сортировки */
        for (Student stud : group) {
            System.out.println(stud);
        }

        System.out.println("Сортировка по возрасту и по id");
        
        /**
         * Сортируем группу студентов 
         * Реализация в классе Student */
        Collections.sort(group.getStudents());
        
        /** Выводим список группы после сортировки */
        for (Student stud : group) {
            System.out.println(stud);
        }

    System.out.println("__________Домашняя работа № 3___________");

        List<Student> lstStd2 = new ArrayList<Student>();
        lstStd2.add(s7);
        lstStd2.add(s8);
        lstStd2.add(s9);
        lstStd2.add(s10);
        lstStd2.add(s11);
        lstStd2.add(s12);
        
        /** Создаем группу */
       StudentGroup group1 = new StudentGroup(lstStd2, 1);

        /** Создаем список групп */
        List<StudentGroup> lstStdGr = new ArrayList<StudentGroup>();
        /** Добавляем группу */
        lstStdGr.add(group);
        lstStdGr.add(group1);

        StudentSteam stream = new StudentSteam(lstStdGr, 3366);

        // Перечисляем группы в потоке
        for(StudentGroup groups : stream) {
            System.out.println("  " + groups);
            // Перечисляем студентов в каждой группе
            for(Student stud : groups)
                System.out.println("    " + stud);
        }
       
        System.out.println("Сортировка групп по числу студентов");
        
        // Сортируем поток
        Collections.sort(stream.getCourse());

        // Перечисляем
        for(StudentGroup groups : stream)
            System.out.println("  "+groups);


    System.out.println("____________Семинар 4 Домашняя работа_____________");

        //Emploee person1 = new Emploee("Иванов", "Олег", 55, 110);
        
        /* Без использования статического поля в EmploeeControler:

        EmploeeContoller.paySalary() 
        EmploeeContoller contrEmp = new EmploeeContoller();
        contrEmp.paySalary(person1);
        */

        //Integer studHour[] = {123, 234, 231, 1, 45};
        //System.out.println(EmploeeControler.mean(studHour));

        //Double emplSalary[] = {1255.23, 34213.5, 10000.0};
        //System.out.println(EmploeeControler.mean(emplSalary));


    // SEMINAR 4 HOMEWORK
 
        StudentService studen = new StudentService();
       
        // Передаём созданные данные студентов в класс StudentService
        studen.create("Тимур", "Латипов", 23);
        studen.create("Никита", "Пазгалёв", 20);
        studen.create("Валерия", "Маивко", 21);
        studen.create("Ирина", "Архипова", 23);
        studen.create("Даниил", "Богомягков", 19);
        studen.create("Иван", "Жуков", 22);

        // Выводим список студентов внутри сервиса
        System.out.println("Список студентов: \n" + studen.getAll());
        

        EmploeeService emploee = new EmploeeService();
        // Передаём созданные данные работников в класс EmploeeService
        emploee.create("Валерий", "Краснова", 28);
        emploee.create("Семён", "Васильев",35);
        emploee.create("Алиса", "Попова", 27);
        emploee.create("Аслидин", "Иванов", 30);
        emploee.create("Дарья", "Бобкова", 45);
        emploee.create("Денис", "Сидоров", 54);
        
        System.out.println("Список работников: \n" + emploee.getAll());

        System.out.println("Отсортированный список работников:");
        System.out.println(emploee.getSortedByFIOStudentGroup());


        TeacherService teacher = new TeacherService();        
        // Передаём созданные данные преподавателей в класс TeacherService
        teacher.create("Виктория", "Кузнецова", 55);
        teacher.create("Вадим", "Шмельков", 46);
        teacher.create("Николай", "Лобанов", 30);
        teacher.create("Ксения", "Петросянова", 35);
        teacher.create("Екатерина", "Белова", 63);
        teacher.create("Анастасия", "Смирнова", 60);

        System.out.println("Список преподавателей: \n" + teacher.getAll());

        System.out.println("Отсортированный список учителей: \n" + teacher.getSortedByFIOTeacher());

        /* Вычисление средних возрастов */
        AverageAge<Student> averAgeOfStudents = new AverageAge<Student>(studen.getAll());
        System.out.println("Средний возраст студентов: " + averAgeOfStudents.averAge());
        
        AverageAge<Teacher> averAgeOfTeachers = new AverageAge<Teacher>(teacher.getAll());
        System.out.println("Средний возраст преподавателей: " + averAgeOfTeachers.averAge());
        
        AverageAge<Emploee> averAgeOfEmploee = new AverageAge<Emploee>(emploee.getAll());
        System.out.println("Средний возраст работников: " + averAgeOfEmploee.averAge());
    }
}