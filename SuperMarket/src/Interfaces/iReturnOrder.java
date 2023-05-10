package Interfaces;

/** Интерфейс возврата товара */
public interface iReturnOrder { // Интерфейс возврат

    /**
     * Установить возврат заказа
     * @param returnOrder (Синтетический метод возврата магазина)
     */
    public void setReturnOrder(boolean returnOrder);

    /** @return Проверка возврата заказа */
    boolean isReturnOrder();

}
