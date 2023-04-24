package Products;
/** Наследуем файл Product */

public class BottleOfWater extends Product {
    private Double volume;
    
    /**
     * Наследование
     * @param name  = наследуем имя из Product
     * @param price = наследуем цену из Product
     * @param volume = Объем жидкости для воды
     */
    public BottleOfWater(String name, Double price, Double volume){
        super(name, price);
        this.volume = volume;
    }
    
    /** @return получаем volume */
    public Double getVolume(){
        return volume;
    }

    /** Присваиваем полученное значение */
    public void setVolume(){
        this.volume = volume;
    }

    /**
     * Переопределяем наследуемый метод toString из Product
     * Чтобы получить имя и  цену из закрытого модификатора необходимо:
     * 1. Указать то это наследуется "super"
     * 2. Указать метод получение имени и цены
     */
    @Override
     public String toString(){
        return "Product{" +
        "name = '" + super.getName() + '\'' +  // name
        ", cost = " + super.getPrice() +   // price
        ", volume = '" + volume + "л." +
        '}';
    }
}
