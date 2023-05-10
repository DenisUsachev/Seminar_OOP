package Classes;

import Interfaces.iActorBehaviour;

public class TaxService implements iActorBehaviour{
   
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isReturnOrder;

    public TaxService(){
        this.name = "Tax audit";
    }
    @Override
    /**Отдаем ссылку на самого себя */
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

    /**  @param Обращаясь к прорадителю через метод получаем имя */
    public String getName() {
        return name;
    }

    @Override
    /** Проверяет сделал ли заказ*/
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    /** Проверяет получил ли заказ*/
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    /** Проверяет возврат товара */
    public boolean isReturnOrder() {
        return isReturnOrder;
    }

    @Override
    /** Сделал ли заказ */
    public void setMakeOrder(boolean makeOrder ) {
        isMakeOrder = makeOrder;
    }

    @Override
    /** Забрал заказ */
    public void setTakeOrder(boolean picUpOrder) {
        isTakeOrder = picUpOrder;
    }

    @Override
    /** Вернул товар */
    public void setReturnOrder(boolean returnOrder) {
        isReturnOrder = returnOrder;
    }
}
