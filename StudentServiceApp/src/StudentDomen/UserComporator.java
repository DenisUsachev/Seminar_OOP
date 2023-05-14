package StudentDomen;

import java.util.Comparator;

public class UserComporator<T extends User> implements Comparator<T>  {
    
    @Override
    /** Сомпоратор для сравнений User и всех наследников */
    public int compare(T o1, T o2) {
        // сравниваем по имени
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        // если имени одинаковые, то делаем какие-то действия
        if (resultOfComparing == 0) { 
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultOfComparing;
            // иначе выдаем имя
        } else {
            return resultOfComparing; 
        }
    }
}
