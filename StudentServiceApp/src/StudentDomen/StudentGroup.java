package StudentDomen;

import java.util.Iterator;
import java.util.List;

/** Класс студенческие группы созданный с возможностью быть перечисляемым и для возможность сортировки */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    
    /** Список студентов группы */
    private List<Student> students;

    /**Номер группы */  
    private int groupId;

    /** Конструктор */
    public StudentGroup(List<Student> students, int groupId) {
        this.students = students;
        this.groupId = groupId;
    }

    /** @return = Получаем список студентов группы */
    public List<Student> getStudents() {
        return students;
    }

    /** @param students = Устанавливаем список студентов группы */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /** @return = получаем номер группы студента */
    public int getGroupId() {
        return groupId;
    }

    /** @return = устанавливаем номер группы студента */
    public void setGroupId(int groupId) {
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

    //  Расписанный метод итерирования в цикле (foreach) с применением экземпляра класса StrudentGroupIterator В качестве перечислителя

    @Override
    /**
     * импиментируемый метод
     * Для того, чтобы можно было группу студентов выводить через forech, необходимо сделать её иттерируемой для этого создаём итератор
     */
    public Iterator<Student> iterator() {  
        return new StudentGroupIterator(students); // создаём класс в котором храниться конструктор( и передавать в студент)) 
    }


    /** Анонимный метод итерирования в цикле (foreach) без необходимости создания экземпляра класса */
//    @Override
//    public Iterator<Student> iterator() {
//        return new Iterator<Student>() {
//            private int index = 0;
//
//            @Override
//            /** импиментируемый метод входящий в Iterator
//             * реализация того, что индекс находится в и не выходит за рамки строки
//             */
//            public boolean hasNext() {
//                return index < students.size();
//            }
        
//            @Override
//            /** импиментируемый метод входящий в Iterator
//             * Возвращает наше значение строки студент через получение индекса счётчика 
//             */
//            public Student next() {
//                if(!hasNext()){ // если условие hasNext == False: возвращаем null
//                    return null;
//                }
//                return students.get(index++);    
//            }
//        };
//    }


    @Override
    /**  Переопределяем метод сравнения */
    public int compareTo(StudentGroup o) {
        // Сравниваем по количеству студентов в группе
        if (students.size() == o.getStudents().size()) {
            // Сравниваем по номеру группы
            if (groupId == o.getGroupId()){
                 return 0;
            }
            if (groupId < o.getGroupId()){
                 return -1;
            }
            return 1;
        }
        if (students.size() < o.getStudents().size()){
             return -1;
        }
        return 1;
    }
}
