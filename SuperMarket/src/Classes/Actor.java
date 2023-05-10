package Classes;

import Interfaces.iActorBehaviour;

/** Прототип (абстрактный класс) показывает, что должно находится и реализовавываться в
 *  наследуемых классах( какие должны быть методы ) */
public abstract class Actor implements iActorBehaviour{
    
    /** Имя клиента */
    protected String name;
    
    /** Сделал заказ */
    protected boolean isTakeOrder;
    
    /** Получил заказ */
    protected boolean isMakeOrder;

    /** Вернул заказ */
    protected boolean isReturnOrder;

    /** Инициализируем 
     * @param name = имя клиента
    */
    public Actor(String name) {
        this.name = name;
    }
    
    /** @return абстрактный конструктор, который подразумевает, 
     * что реализацией займётся наследуемый класс (Клиент или вип клиент)*/
    public abstract String getName();
}