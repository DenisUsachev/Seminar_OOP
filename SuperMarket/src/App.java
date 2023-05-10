import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionalClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;

/**
 * Программа сделана автоматизации заказов магазина:
 * Узнает у клиента, определяет наличие у коиента Vip статуса;
 * Ставить клиента в очередь;
 * Считывает делал ли клиент заказ и определяет получение товара;
 * Убирает человека из очереди при получении им заказа
 * 
 * Version: 1.0
 * Date: 03.05.2023  
 */


public class App {
    public static void main(String[] args) throws Exception {

        Market market = new Market();
        iActorBehaviour item1 = new OrdinaryClient("Борис");
        iActorBehaviour item2 = new OrdinaryClient("Даша");
        iActorBehaviour item3 = new SpecialClient("Денис", 1);
        iActorBehaviour item4 = new TaxService();
        //iActorBehaviour item5 = new PromotionalClient("Данил", "Promo");
        market.accerToMarket(item1); // вход первого человека
        market.accerToMarket(item2); // вход второго человека
        market.accerToMarket(item3);
        market.accerToMarket(item4);
        //market.accerToMarket(item5);
        market.update();
        market.releaseFromMarket(item1);
        market.releaseFromMarket(item2);
        market.releaseFromMarket(item3);
        market.releaseFromMarket(item4);

    }
}