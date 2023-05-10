package Interfaces;

import Classes.Actor;

public interface iPromoBehaviour  extends iActorBehaviour{
    
    void promoClient(iActorBehaviour actor);

    
    
    

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

    public void setPromoClient(boolean isPromoClient);


    @Override
    public void setReturnOrder(boolean returnOrder);

    /** @return Проверка делал ли клиент заказ */
    boolean isMakeOrder();


    boolean isPromoClient();



    /** @return Проверка получил ли клиент заказ */
    boolean isTakeOrder();

    @Override
    boolean isReturnOrder();

    // Получаем getActor из класса Actor, котрый показывает, кто сейчас клиент
    Actor getActor();
}
