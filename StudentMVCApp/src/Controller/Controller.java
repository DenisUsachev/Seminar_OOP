package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Student;


public class Controller {
    /** Список студентов */
    private List<Student> students;
    
    // Создаём поле интерфейса view
    private iGetView view;

    // Создаём поле интерфейса model
    private iGetModel model;

    /** Конструктор */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    //  Чтобы получить MVP необходимо разорвать связь между Model and View
    public void getAllStudent()
    {
        students = model.getAllStudent();
    }

    //тест для MVP
    public boolean testData(){
        if(students.size()> 0){
            return true;
        }
        return false;
    }


    /** Получаем из view метод вывода в котором из model получаем всех студентов */
    public void UpdateView(){
        // MVP
        getAllStudent();
        if(testData()){
            view.printAllStudent(students);
        }else{
            System.out.println("Список студентов неверный ");
        }
        
        // MVC
        //view.printAllStudent(model.getAllStudent());
    }

    // Метод который перехватывает команды от пользователя
    public void run(){
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы. Всего доброго! ");
                    break;
                case LIST:
                    getAllStudent();
                    UpdateView();
                    break;
                case DELETE:
                    getAllStudent();
                    Long idStud = view.promptLong("Введите id пользователя: ");
                    Boolean res =  model.deleteStudent(idStud);
                    if(!res) System.out.println("Студент не найден ");
                    else System.out.println("Запись удалена");
                
                default:
                    break;
            }
        }
    }
}
