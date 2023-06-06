// Фабрика, которая будет производить награду в виде золота наследник ItemGenerator
public class GemGeneration extends ItemGenerator{
    
    @Override
    // Метод создаёт продукт, вызывает констуктор в котором лежит награда
    public iGameItem createItem(){
        return new GemReward();
    }
}
