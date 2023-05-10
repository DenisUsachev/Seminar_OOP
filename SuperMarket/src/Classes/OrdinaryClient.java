package Classes;
/** Наследуемый класс от Абстрактного класса Actor, который реальзует выполнение методов для обычных клиентов*/
public class OrdinaryClient extends Actor{
    /** @param name = имя клиента (передается через метод super в абстрактном классе Actor) */
    public OrdinaryClient(String name){
        super(name);
    }

    @Override
    /**Отдаем ссылку на самого себя */
    public Actor getActor() {
        return this;
    }

    @Override 
    /** @param Обращаясь к прорадителю через метод super получаем имя */
    public String getName() {
        return super.name;
    }

    @Override
    /** Проверяет сделал ли заказ*/
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    /** Проверяет получил ли заказ*/
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    /** Проверяет возврат товара */
    public boolean isReturnOrder() {
        return super.isReturnOrder;
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