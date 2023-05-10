package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;


/** Класс который занимается продажей, принимает интерфейсы */
public class Market implements iMarketBehaviour, iQueueBehaviour {


    /**Используем интерфейс как элемент очереди */
    private List<iActorBehaviour> queue;

    /**
     * Создаём конструктор инициализируя очередь из accerToMarket(людей которые зашли)
     * @param queue = очередь 
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    /**
     * Получаем имя и выводим его в консоль
     * метод takeInQueue = добавляет пришёдшего клиента в очередь магазина  
     * @param actor 
     */
    public void accerToMarket(iActorBehaviour actor) {
        System.out.println("Клиент " + actor.getActor().getName() + " пришёл в магазин");
        takeInQueue(actor);
    }
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println("Клиент " + actor.getActor().getName() + " добавлен в очередь");
    }

    @Override
    /** Позиция клиента */
    public void update() {
        takeOrder();  // Сделать заказ
        giveOrder(); // Получить заказ
        returnOrder(); // Вернуть заказ
        releaseFromQueue(); // Выйти из очереди
    }
    
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println("Клиент " + actor.getActor().getName() + " сделал свой заказ ");
            }
        }
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println("Клиент " + actor.getActor().getName() + " получил свой заказ ");
            }   
        }
    }
    
    @Override
    public void returnOrder(){
        for (iActorBehaviour actor : queue) {
            if(!actor.isReturnOrder()){
                actor.setReturnOrder(true);
                System.out.println("Клиент " + actor.getActor().getName() + " вернул свой заказ ");
            }
        }
    }   

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if(actor.isTakeOrder()){
                releaseActors.add(actor.getActor());
                System.out.println("Клиент " + actor.getActor().getName() + " ушёл из очереди ");
            }
        }
    }

    @Override
    /** @param actor удаляем клиента из списка очереди */
    public void releaseFromMarket(iActorBehaviour actor) {
        this.queue.remove(actor);
        System.out.println("Клиент " + actor.getActor().getName() + " ушёл из магазин");
    }
}