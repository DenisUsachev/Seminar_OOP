package Interfaces;

/**
 * Создали интерфейс для класса Market (В данном случае является спецификацией для реализации методов в классе Market) 
 */
public interface iQueueBehaviour { // интерфейс очереди поведение
    /**
     * Добавить в очередь()
     * @param actor = человека
     */
    void takeInQueue(iActorBehaviour actor);
        
    /** Сделать заказ */
    void takeOrder();
    
    /** Получить заказ */
    void giveOrder();

    /** Вернуть заказ */
    void returnOrder();
    
    /** Убрать из очереди человека */
    void releaseFromQueue();
}