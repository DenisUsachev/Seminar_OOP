package Interfaces;

/** Создали интерфейс для класса Market (В данном случае является спецификацией для реализации методов в классе Market) */
public interface iMarketBehaviour { // интерфейс поведение магазина
    
    /**
     * Вход человека в магазин реализуется в классе Market
     * @param actor требование методов
     */
    void accerToMarket(iActorBehaviour actor);
   
    /**
     * Что человек купил
     * требование к метода
     */
    void update();

    /**
     * Выход человека из магазина реализуется в классе Market
     * @param actors требование к методов
     */
    void releaseFromMarket(iActorBehaviour actor);
}