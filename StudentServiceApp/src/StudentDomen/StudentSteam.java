package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Класс студенческих потоков созданный с возможностью быть перечисляемым */
public class StudentSteam implements Iterable<StudentGroup>{
    
    /** Список групп  */
    private List<StudentGroup> course;
    
    /** Номер потока */
    private int SteamNum;

    /** Конструктор */
    public StudentSteam(List<StudentGroup> course, int steamNum) {
        this.course = course;
        SteamNum = steamNum;
    }
    /** @return = Получаем список групп студентов */
    public List<StudentGroup> getCourse() {
        return course;
    }
    /** @return = Устанавливаем список групп студентов */
    public void setCourse(List<StudentGroup> course) {
        this.course = course;
    }

    /** @return = Получаем номер потока */
    public int getSteamNum() {
        return SteamNum;
    }

    /** @return = Устанавливаем номер потока */
    public void setSteamNum(int steamNum) {
        SteamNum = steamNum;
    }

    @Override
    /** Анонимный метод итерирования в цикле (foreach) без необходимости создания экземпляра класса */
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            /** импиментируемый метод входящий в Iterator
             * реализация того, что индекс находится в и не выходит за рамки строки
             */
            public boolean hasNext() {
                return index < course.size();
            }
        
            @Override
            /** импиментируемый метод входящий в Iterator
             * Возвращает наше значение строки студент через получение индекса счётчика 
             */
            public StudentGroup next() {
                if(!hasNext()){ // если условие hasNext == False: возвращаем null
                    return null;
                }
                return course.get(index++);    
            }
        };
    }

    // Список всех студентов
    public List<Student> getAllStudents() {
        List<Student> studentSteam = new ArrayList<>();
        /** Перечисляем группы */
        for(StudentGroup group : course) {
            /** Перечисляем студентов в каждой группе */
            for(Student student : group)
            studentSteam.add(student);
        }
        return studentSteam;
    }
}
