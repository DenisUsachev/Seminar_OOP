

import java.util.Iterator;
import java.util.List;

/** Класс студенческие группы созданный с возможностью быть перечисляемым и для возможность сортировки */
public class StudentGroup<T,V,S extends Comparable<S>> implements Iterable<Student<T,V,S>>{
    
    /** Список студентов группы */
    private List<Student<T,V,S>> students;

    /**Номер группы */  
    private V groupId;

    /** Конструктор */
    public StudentGroup(List<Student<T,V,S>> students, V groupId) {
        this.students = students;
        this.groupId = groupId;
    }

    /** @return = Получаем список студентов группы */
    public List<Student<T,V,S>> getStudents() {
        return students;
    }

    /** @param students = Устанавливаем список студентов группы */
    public void setStudents(List<Student<T,V,S>> students) {
        this.students = students;
    }

    /** @return = получаем номер группы студента */
    public V getGroupId() {
        return groupId;
    }

    /** @return = устанавливаем номер группы студента */
    public void setGroupId(V groupId) {
        this.groupId = groupId;
    }

    @Override
    /** Переопределяем метод toString */
    public String toString() {
        return "Group{"+
            "groupId=" +groupId+", "+
            "studentsCount="+students.size()+
        "}";
    }


    /** Анонимный метод итерирования в цикле (foreach) без необходимости создания экземпляра класса */
    @Override
    public Iterator<Student<T,V,S>> iterator() {
        return new Iterator<Student<T,V,S>>() {
            private int index = 0;

            @Override
            /** импиментируемый метод входящий в Iterator
             * реализация того, что индекс находится в и не выходит за рамки строки
             */
            public boolean hasNext() {
                return index < students.size();
            }
        
            @Override
            /** импиментируемый метод входящий в Iterator
             * Возвращает наше значение строки студент через получение индекса счётчика 
             */
            public Student<T,V,S> next() {
                if(!hasNext()){ // если условие hasNext == False: возвращаем null
                    return null;
                }
                return students.get(index++);    
            }
        };
    }
}
