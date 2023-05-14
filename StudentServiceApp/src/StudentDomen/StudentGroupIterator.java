package StudentDomen;

import java.util.Iterator;
import java.util.List;

/** Экземпляр класса созданный для перечислителя реализуемый метод итератора находится в классе(StudentGroup) */
public class StudentGroupIterator implements Iterator<Student>{
     /** Счётчик */
     private int counter;
     /** Список студентов */
     private final List<Student> students;
 
     /** Конструктор */
     public StudentGroupIterator(List<Student> students) {
         this.students = students;
         this.counter = 0;
     }
 
     @Override
     /** импиментируемый метод
      * реализация того что наш счётчик дошёл до конца
     */
     public boolean hasNext() {
         return counter < students.size();
     }
 
     @Override
     /** импиментируемый метод
      * Возвращает наше значение строки студентю получение через счётчик индекса
     */
     public Student next() {
         if(!hasNext()){
             return null;
         }
         return students.get(counter++);    
     }
}
