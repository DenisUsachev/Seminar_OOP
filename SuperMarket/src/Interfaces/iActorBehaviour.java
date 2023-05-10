package Interfaces;

import Classes.Actor;

/** Создали интерфейс для класса Actor (В данном случае является спецификацией для реализации методов в классе Actor)*/
public interface iActorBehaviour extends iReturnOrder{ // интерфейс  поведение заказа

    /**
     * Сделать заказ
     * @param makeOrder (Синтетический метод заказов магазина) 
     */
    public void setMakeOrder(boolean makeOrder);

    /**
     * Забрал заказ 
     * @param picUpOrder (Синтетический метод Полученных заказов)
     */
    public void setTakeOrder(boolean picUpOrder);

    @Override
    public void setReturnOrder(boolean returnOrder);

    /** @return Проверка делал ли клиент заказ */
    boolean isMakeOrder();

    /** @return Проверка получил ли клиент заказ */
    boolean isTakeOrder();

    @Override
    boolean isReturnOrder();

    // Получаем getActor из класса Actor, котрый показывает, кто сейчас клиент
    Actor getActor();
}