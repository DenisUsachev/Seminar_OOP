package Controllers;

import StudentDomen.User;

/** Интерфейс в котором наследются все класс от User */
public interface iUserController<T extends User> {
    /** метод создания любого кто записан в учебном учереждении */
    void create(String firstName, String secondName, int age); 
}
