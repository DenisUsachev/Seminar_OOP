package VendingMachines;
import java.util.*;
import Products.*;

/** @param Манипуляция с апаратом */
public class VendingMachine {
    private int volume; 
    private List<Product> products; 
    private List<String> workLog;
    private List<String> money;
    
    /**
     * Присваеиваем с помощью конструктора параметры иницифоизации
     * @param volume = вместимость аппарата
     */
    public VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<Product>(); //инициализация пустых списков
        workLog = new ArrayList<String>();
        money = new ArrayList<String>();
    }
    
    /** @param prod = Добавляем в ArrayList "products" продукт "prod" */
    public void addProduct(Product prod){
        products.add(prod);
    }

    /** @param line = Добавляем в ArrayList "workLog" продажи "line" */
    public void addWorkLog(String line){
        workLog.add(line);
    }

    /** @return оставшиеся товары */
    public Product getProdByName(String name){
        for(Product prod : products) { //products = содержит все продукты
            if(prod.getName().contains(name)){
                return prod;
            }
        }
        return null; // иначе ничего не возвращает
    }
    /**
     * @param product = название товара
     * @param money = сколько денег внесли
     * @return результат
     */
    public String getProdByPrice(Product product ,Double money){
        if(money >= product.getPrice()){
            Double change = money - product.getPrice();
            money = 0.0;
            return "Товар успешно куплен: " + product.getName() + "\n" +  "Ваша сдача: " + change + " Рублей." + "\n" + "Хорошего дня!"; 
        }
        else{
            return "Недостаточно средств для покупки товара" + "\n" + "Ваша сдача: " + money + " Рублей." + "\n" + "Хорошего дня!";
        }
    }

    /** @return Получить все продукты */
    public List<Product> getProdAll(){
        return products;
    }
}