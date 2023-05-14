package StudentService;

import java.util.List;

public interface iUsaerService<T> {
    /** @return Получение данных */
    List<T> getAll();
    
    /** Создание персоны */
    void create(String firstName, String secondName, Integer age);
}
