
import java.util.ArrayList;
import java.util.List;

// Программа создана для игр, где в виде подарка или 
// пообщерения участника выпадает приз 

public class Main {
    public static void main(String[] args) {
        
        // Создаем список созданных продуктов
        List<ItemGenerator> generatorList = new ArrayList<>();

        // добавляем в список - генератор продукты
        generatorList.add(new GoldGeneration());
        generatorList.add(new GemGeneration());

        // Создаём сколько у нас доступнызх наград
        for (int i = 0; i < 10; i++) {  
            ItemGenerator itemGenerator = generatorList.get(i);
            
            // Когда награда уже сгенерирована, мы её открываем
            itemGenerator.openRerward();
        }
    }
}
