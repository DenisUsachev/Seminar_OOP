package Classes;
/** Наследуемый класс от Абстрактного класса Actor, который реальзует выполнение методов для vip клиентов*/
public class SpecialClient extends Actor{
    
    /** Создаём уникальный номер vip Client */
    private int idVip;
    
    /**
     * Конструктор Vip Client
     * @param name = имя vip client(передается через метод super в абстрактном классе Actor)
     * @param id = уникальный номер vip Client
     */
    public SpecialClient(String name, int id){
        super(name);
        this.idVip = id;
    }

    @Override
    /** @param Обращаясь к прорадителю через метод super получаем имя */
    public String getName() {
        return super.name;
    }

    /** @return Создаём метод получения уникального номера vip Client */
    public int getVipId(){
        return idVip;
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
        super.isMakeOrder = makeOrder;
    }

    @Override
    /** Забрал заказ */
    public void setTakeOrder(boolean picUpOrder) {
        super.isTakeOrder = picUpOrder;
    }

    @Override
    /**Отдаем ссылку на самого себя */
    public Actor getActor() {
        return this;
    }

    @Override
    /** Вернул товар */
    public void setReturnOrder(boolean returnOrder) {
        isReturnOrder = returnOrder;
        
    }
}