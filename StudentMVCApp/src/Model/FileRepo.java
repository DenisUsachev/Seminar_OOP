package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

// Класс который считывает информацию с жёсткого диска
public class FileRepo implements iGetModel{
    /** Имя файла */
    private String fileName;
    
    /** Список студентов */
    private List<Student> students;

    /** Конструктор */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();

        /** Делаем проверку для открытия файла  */
        try(FileWriter fw = new FileWriter(fileName, true)){  
            //Если всё хорошо, то мы его просто закроем и скинем из памяти в него
            fw.flush(); 
        }catch(Exception e){ 
            // иначе если выдало ошибку, то вывести её в консоль
            System.out.println(e.getMessage());
        }
    }

    /** Метод который добавляет студента */
    public void addStudent(Student student){
        this.students.add(student);
    }    

    /** Метод который будет читать всех студентов в открытом файле */
    public void readAllStudentsFromFile(){
        try {
            // Информация из операционной системе о файла
            File file = new File(fileName);
            
            // Подключаемся 
            FileReader fr = new FileReader(file);
            
            //Открываем соединение с файлом
            BufferedReader reader = new BufferedReader(fr);
        
            //Считываем данные построчно
            String line = reader.readLine();

            // Считываем все строки
            while(line != null){

                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(pers);
                line = reader.readLine();
            }

        } catch (Exception e) {
            // иначе если выдало ошибку, то вывести её в консоль    
            System.out.println(e.getMessage());
        }
    }

    /** Метод сохранение записи в файл */
    public void saveAllStudentToFile(){
        /** Делаем проверку для открытия файла  */
        try(FileWriter fw = new FileWriter(fileName, true)){  
            //Если всё хорошо, то мы его просто закроем и скинем из памяти в него
            for (Student pers : students) {
                
                // Считываем информацию и записываем её в FileWrite
                fw.write(pers.getFirstName() + " " + pers.getSecondName() + " " + pers.getAge() + " " + pers.getIdStud());
                fw.append("\n");

            }
            fw.flush(); 
        }catch(Exception e){ 
            // иначе если выдало ошибку, то вывести её в консоль
            System.out.println(e.getMessage());
        }
    }

    @Override
    // мы из readAllStudentsFromFile загрузим его во внутрь студеты, а потом выводим загруженный список обратно 
    public List<Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;
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
