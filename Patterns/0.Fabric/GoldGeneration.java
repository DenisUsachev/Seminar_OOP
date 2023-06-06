
// Фабрика, которая будет производить награду в виде золота наследник ItemGenerator
public class GoldGeneration extends ItemGenerator{
    
    @Override
    // Метод создаёт продукт, вызывает констуктор в котором лежит награда
    public iGameItem createItem(){
        return new GoldReward();
    }
}
