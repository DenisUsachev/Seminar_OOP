package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComporator;

public class EmploeeService implements iUsaerService<Emploee> {
     /** Счётчик */
     private int count;
    
     /** Список студентов */
     private List<Emploee> embloees;
     
     /** Констуктор */
     public EmploeeService() {
         this.embloees = new ArrayList<Emploee>();
    }

    /** @return вывод всех работников */
    public List<Emploee> getAll(){
        return embloees;
    }

    @Override
    /** Создает имя, фамилию, возраст и уникальный номер работника */
    public void create(String firstName, String secondName, Integer age) {
        Emploee per = new Emploee(firstName, secondName, age, count);
        count++;
        embloees.add(per);
    }

    /**
     * @param numberGroup = номер группы 
     * @return = возвращает отсортированный список работников
     */
    public List<Emploee> getSortedByFIOStudentGroup(){
        List<Emploee> emps = new ArrayList<>(embloees);
        emps.sort(new UserComporator<Emploee>()); //Создает сортировку применяя класс UserComporator
        return emps;
    }
}
