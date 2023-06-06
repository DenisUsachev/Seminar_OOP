
// Задача метода является создание нового продукта
public abstract class ItemGenerator {
   
    // метод, который будет получать награду
    public void openRerward() {
        
        // берем тип продукта экземпляр продукта и создаём его
        iGameItem gameItem = createItem();
        gameItem.open();
    }
    
    // будет генерировать какой-то продукт(указываем интерфейс как тип данных)
    public abstract iGameItem createItem(); 
        
}
