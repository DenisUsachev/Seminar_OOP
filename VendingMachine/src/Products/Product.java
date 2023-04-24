package Products;
/** Базовый класса продукт */
public class Product {
//public - модификатор(инкаплуляции), доступен везде в нашем проекте во всех наших прогаммах
    
    /** Наименование продукта */
    private String name;
    // private - закрытый модификатор, доступен только в это классе
    
    /** Цена продукта */
    private Double price;
     
    /**
     * создаем конструктор
     * @param name = наименование продукта
     * @param price = цена продукта
     */
    public Product(String name, Double price){
        if(name == ""){ // Add generation exception, if name not - добавили генератор ошибки если пользователь не ввёл имя
            throw new IllegalStateException(String.format("У продукта отсутствует название", name));
        }
        this.name = name;
        this.price = price;
    }

    /**
     * Устанавливаем цену продукта
     * @param value = новая цена цена
     */
    public void SetPrice(Double value){
        if(value <= 0){
            throw new IllegalStateException(String.format("Цена указана не верно", value));
        }
        this.price = value;
    }

    /** @return возвращаем полученное название продукта */
    public String getName(){
        return name;
    }
    
    /** @return возвращаем полученую цену */
    public Double getPrice(){
        return price;
    }

    /** @return Переопределение метода toString для правильного вывода продуктов на консоль */
    @Override    
    public String toString(){
        return "Product{" +
        "name = '" + name + '\'' +
        ", cost = " + price + 
        '}';
    }
}
