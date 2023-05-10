package Classes;

import Interfaces.iActorBehaviour;

public class PromotionalClient implements iActorBehaviour {
    
    private String name;
    private String PromotionWord;
    private boolean isTakeOrder;


    private boolean isMakeOrder;
    private boolean isSaleOrder;

    /**
     * @param name = имя клиента (передается через метод super в абстрактном классе Actor)
     * @param PromoWord = акционное слово
     */
    public PromotionalClient(String name, String PromoWord) {
        this.name = name;
        this.PromotionWord = PromoWord;
    }
    
    @Override
    /**Отдаем ссылку на самого себя */
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
    
    /** 
     * @param Обращаясь к прорадителю через метод super получаем имя 
     */
    public String getName() {
        return name;
    }

    /**
     * @return Создаёт метод получения Promo
     */
    public String getPromotionWord() {
        return PromotionWord;
    }

    @Override
    /** Проверяет сделал ли заказ*/
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**Сделать скидку */
    public boolean isSaleOrder(){
        return isSaleOrder;
    }

    @Override
    /** Проверяет получил ли заказ*/
    public boolean isTakeOrder() {
        return isTakeOrder;
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

    public void setSaleOrder(boolean Sale) {
        this.isSaleOrder = Sale;
    }

    @Override
    public void setReturnOrder(boolean returnOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setReturnOrder'");
    }

    @Override
    public boolean isReturnOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isReturnOrder'");
    }

}